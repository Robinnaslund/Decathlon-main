package commonhide2;

import java.util.Scanner;

import common.InputResult;
import decathlon.Discipline;
import decathlon2.Deca1500M;
import decathlon2.Deca110MHurdles;
import decathlon2.Deca400M;
import decathlon2.DecaDiscusThrow;
import decathlon2.DecaHighJump;
import decathlon2.DecaJavelinThrow;
import decathlon2.DecaLongJump;
import decathlon2.DecaShotPut;
import decathlon2.DecaPoleVault;

import heptathlon.Hep100MHurdles;
import heptathlon.Hep200M;
import heptathlon.Hep800M;
import heptathlon.HeptHightJump;
import heptathlon.HeptJavelinThrow;
import heptathlon.HeptLongJump;
import heptathlon.HeptShotPut;

public class SelectDiscipline {

    int disciplineSelected; // en int som representerar vilken discipline användaren vill välja

    //Skapar objekt av klassen InputResult
    InputResult inputResult = new InputResult();

    Scanner sc = new Scanner(System.in);

    //Skapar objekt av klasserna som finns i decathlon mappen
    // Dessa skall generaliserar till en klass.
    Discipline deca100M = new Discipline();
    Deca400M deca400M = new Deca400M();
    Deca110MHurdles deca110MHurdles = new Deca110MHurdles();
    Deca1500M deca1500M = new Deca1500M();
    DecaLongJump decaLongJump = new DecaLongJump();
    DecaHighJump highJump = new DecaHighJump();
    DecaDiscusThrow discusThrow = new DecaDiscusThrow();
    DecaShotPut decaShotPut = new DecaShotPut();
    DecaJavelinThrow decaJavelinThrow = new DecaJavelinThrow();
    DecaPoleVault poleVault = new DecaPoleVault();

    //Skapar objekt av klasserna som finns i hepatathlon mappen
    // Dessa skall generaliserar till en klass.
    Hep200M hep200M = new Hep200M();
    Hep800M hep800M = new Hep800M();
    Hep100MHurdles hep100MHurdles = new Hep100MHurdles();
    HeptHightJump hepHighJump = new HeptHightJump();
    HeptLongJump hepLongJump = new HeptLongJump();
    HeptShotPut hepShotPut = new HeptShotPut();
    HeptJavelinThrow hepJavelinThrow = new HeptJavelinThrow();

    // En metod för att ta emot input för val av disciplin.
    public void inputSelection() {
        System.out.println("Select discipline.");
        printDisciplines();

        //Om något går utanför det normala flödet i programmet
        try {

            disciplineSelected = Integer.parseInt(sc.nextLine());
            makeSelection();

        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
            System.out.println("");
            inputSelection();
        }

    }

    // Kontrollerar inmatning av disciplin.
    public void makeSelection() {
        switch (disciplineSelected) {
            //Operationerna utförs om de har samma värde som disciplineSelected
            //Metoden calculateResult finns i de olika klasserna nedan, den Beräknar poängen baserat på t.ex tid, avstånd, höjd, m.m
            case 1:
                inputResult.entedeca100M.calculateResult(rResult());
                break;
            case 2:
                deca400M.calculateResult(inputResult.enterResult());
                break;
            case 3:
                deca110MHurdles.calculateResult(inputResult.enterResult());
                break;
            case 4:
                deca1500M.calculateResult(inputResult.enterResult());
                break;
            case 5:
                decaLongJump.calculateResult(inputResult.enterResult());
                break;
            case 6:
                highJump.calculateResult(inputResult.enterResult());
                break;
            case 7:
                poleVault.calculateResult(inputResult.enterResult());
                break;
            case 8:
                discusThrow.calculateResult(inputResult.enterResult());
                break;
            case 9:
                decaJavelinThrow.calculateResult(inputResult.enterResult());
                break;
            case 10:
                decaShotPut.calculateResult(inputResult.enterResult());
                break;
            case 11:
                hep200M.calculateResult(inputResult.enterResult());
                break;
            case 12:
                hep800M.calculateResult(inputResult.enterResult());
                break;
            case 13:
                hep100MHurdles.calculateResult(inputResult.enterResult());
                break;
            case 14:
                hepHighJump.calculateResult(inputResult.enterResult());
                break;
            case 15:
                hepLongJump.calculateResult(inputResult.enterResult());
                break;
            case 16:
                hepShotPut.calculateResult(inputResult.enterResult());
                break;
            case 17:
                hepJavelinThrow.calculateResult(inputResult.enterResult());
                break;
            default:
                System.out.println("Invalid input, try again.");
                System.out.println("");
                inputSelection();
                break;
        }
    }

    public int getDisciplineSelected() {

        return disciplineSelected;

    }

    // Needs more stuff.
    public void printDisciplines() {
        System.out.println("1. Decathlon 100 meters. (Measured in seconds)");
        System.out.println("2. Decathlon 400 meters. (Measured in seconds)");
        System.out.println("3. Decathlon 110 meters hurdles. (Measured in seconds)");
        System.out.println("4. Decathlon 1500 meters. (Measured in minutes and seconds)");
        System.out.println("5. Decathlon Long Jump. (Measured in centimeters)");
        System.out.println("6. Decathlon High Jump. (Measured in centimeters)");
        System.out.println("7. Decathlon Pole Vault. (Measured in centimeters)");
        System.out.println("8. Decathlon Discus Throw. (Measured in meters)");
        System.out.println("9. Decathlon Javelin Throw. (Measured in meters)");
        System.out.println("10. Decathlon Shot Put. (Measured in meters)");
        System.out.println("11. Heptathlon 200 meters.");
        System.out.println("12. Heptathlon 800 meters.");
        System.out.println("13. Heptathlon 100 meters hurdles.");
        System.out.println("14. Heptathlon High Jump.");
        System.out.println("15. Heptathlon Long Jump.");
        System.out.println("16. Heptathlon Shot Put.");
        System.out.println("17. Heptathlon Javelin Throw.");
    }

}