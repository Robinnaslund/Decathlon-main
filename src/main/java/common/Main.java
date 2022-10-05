package common;

import decathlon.*;

import java.util.Scanner;

//Denna klass läser in text och skriver ut resultatet
public class Main {

	public static void main(String[] args) {
		boolean choice = true;
        Scanner scan = new Scanner(System.in);

		//Loopen körs så länge choise är sant
		while (choice = true) {

			//Skapar objekt av klassen InputName
			InputName inputName = new InputName();

			//Anropar metoden addCompetitor från InputName klassen
            System.out.println("Please enter the competitor's name:");
            inputName.addCompetitor(scan.nextLine());

			//Skapar objekt av klassen SelectDiscipline
			SelectDiscipline selectDiscipline = new SelectDiscipline();

			//Anropar metoden inputSelection från selectDiscipline klassen
			selectDiscipline.inputSelection();

		}
		choice = false;
	}
	// lite små ändringar
}
