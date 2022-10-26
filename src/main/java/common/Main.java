package common;

import competition.*;
import excel.ExcelPrinter;
import excel.ExcelWriter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.IOException;
import java.util.Scanner;

//Denna klass läser in text och skriver ut resultatet
public class Main {


    public static void main(String[] args) throws IOException {


        ExcelWriter writer = new ExcelWriter();
        writer.excelWriter();

        System.out.println("Welcome");
        System.out.println("******************************************");
        System.out.println("");
        System.out.println("Here are the alternatives for the program: ");
        System.out.println("1. Decathlon tournament, type in DECA to add competitors and results for Decathlon disciplines.");
        System.out.println("2. Heptathlon tournament, type in Hepta to add competitors and results for Hepthathlon disciplines.");
        System.out.println("3. Se results for either Decathlon or Heptathlon tournament (coming soon).");
        System.out.println("");
        System.out.println("******************************************");

        Scanner scan = new Scanner(System.in);
        String menyChoise = "";
        Competition myCompetition = null;


        // while competition = null.
        while (myCompetition == null) {
            System.out.println("PLease type in your choise: ");
            menyChoise = scan.nextLine().toLowerCase();

            switch (menyChoise) {

                case "deca":
                    myCompetition = new Decathlon();
                    break;
                case "hepta":
                    myCompetition = new Heptathlon();
                    break;
                default:
                    System.out.println("This feature is coming soon");
                    break;

            }
        }

        System.out.println("Please enter the competitor's name:");
        //Skapar objekt av klassen InputName
        Competitor inputName = new Competitor();
        String competitorName = scan.nextLine();

        // validate input
        // continue asking until input is valid
        while (!inputName.validateNameInput(competitorName)) {

            competitorName = scan.nextLine();

        }
        inputName.addCompetitor(competitorName);

        //loopa genom sporter
        // input.result
        //yCompetition.calculateScore();


        myCompetition.printDisciplines();
        System.out.println("Choose discipline: (by typing in one number between 1-17) ");
        myCompetition.setChoiceOfDiscipline(Integer.parseInt(scan.nextLine()));

        InputResult inputResult = new InputResult();
        System.out.println("Type in result to calculate gained score:");
        //dubbelvalidering både här och i klassen input result.
        inputResult.enterResult(Double.parseDouble(scan.nextLine()));

        myCompetition.calculateScore(inputResult.returnResult(), menyChoise);

        System.out.println("Here is what will be saved.");
        System.out.println("The competitor name is: " + inputName.readCompetitorName());
        System.out.println("The entered result is: " + inputResult.returnResult());
        System.out.println("The score gained is: " + myCompetition.getScore());
    }

}


