package common;

public class Competitor {

	//Definierar tillst�nden/attributen
	String compName = ""; // t�vlandes namn sparad i en String
	Object [][] CompetitorScoresForAllDisciplines;

	//L�gg till konkurrent
	//Definierar metoderna
	// sparar anv�ndarnamn (competitorName) till attributet compName

	public void addCompetitor(String competitorName) {

		compName = competitorName;
	}

	// returnerar sparad String fr�n attribut compName
	public String readCompetitorName() {
		return compName;
	}

	// validerar String input. returnerar booleanv�rde.
	public boolean validateNameInput(String competitorName) {

		boolean validatedCompetitorName = false;

		//Inmatningen till�ter endast sm� och stora bokst�ver
		if (!competitorName.matches("^[a-�A-�]{2,20}$")) {
			System.out.println("Only use letters when putting in competitors name.");
			System.out.println("PLease type again: ");
		}
		else {
			validatedCompetitorName = true;
		}

		return validatedCompetitorName;

	}
}
