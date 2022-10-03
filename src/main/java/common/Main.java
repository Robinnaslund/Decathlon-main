package common;

import decathlon.*;

//Denna klass läser in text och skriver ut resultatet
public class Main {

	public static void main(String[] args) {
		boolean choice = true;

		//Loopen körs så länge choise är sant
		while (choice = true) {

			//Skapar objekt av klassen InputName
			InputName inputName = new InputName();

			//Anropar metoden addCompetitor från InputName klassen
			inputName.addCompetitor();

			//Skapar objekt av klassen SelectDiscipline
			SelectDiscipline selectDiscipline = new SelectDiscipline();

			//Anropar metoden inputSelection från selectDiscipline klassen
			selectDiscipline.inputSelection();

		}
		choice = false;
	}
	// lite små ändringar
}
