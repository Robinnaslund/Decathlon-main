package common;

public class InputName {

	//Definierar tillst�nden/attributen
	String compName = ""; // t�vlandes namn sparad i en String


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

		//Inmatningen ska vara skilt ifr�n.*[a-�A-�], annars f�r man fel meddelande
		if (!competitorName.matches(".*[a-�A-�]")) {
			System.out.println("Only use letters when putting in competitors name.");
			System.out.println("PLease type again: ");

		} else {
			validatedCompetitorName = true;
		}

		return validatedCompetitorName;

	}
}
