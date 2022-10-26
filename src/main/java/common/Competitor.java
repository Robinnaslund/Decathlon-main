package common;

public class Competitor {

	//Definierar tillstånden/attributen
	String compName = ""; // tävlandes namn sparad i en String
	Object [][] CompetitorScoresForAllDisciplines;

	//Lägg till konkurrent
	//Definierar metoderna
	// sparar användarnamn (competitorName) till attributet compName

	public void addCompetitor(String competitorName) {

		compName = competitorName;
	}

	// returnerar sparad String från attribut compName
	public String readCompetitorName() {
		return compName;
	}

	// validerar String input. returnerar booleanvärde.
	public boolean validateNameInput(String competitorName) {

		boolean validatedCompetitorName = false;

		//Inmatningen tillåter endast små och stora bokstäver
		if (!competitorName.matches("^[a-öA-ö]{2,20}$")) {
			System.out.println("Only use letters when putting in competitors name.");
			System.out.println("PLease type again: ");
		}
		else {
			validatedCompetitorName = true;
		}

		return validatedCompetitorName;

	}
}
