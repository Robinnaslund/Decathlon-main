package common;

import java.util.Scanner;

public class InputName {

	//Definierar tillstånden/attributen
	String compName = "";



	//Lägg till konkurrent
	//Definierar metoderna
	public String addCompetitor() {

		boolean active = true;
		String compName = "";
		Scanner sc = new Scanner(System.in);

		//Loopen körs så länge det är "active"
		while (active) {
			System.out.println("Please enter the competitor's name:");
			compName = sc.nextLine();
			//Inmatningen ska vara skilt ifrån .*[a-öA-ö], annars får man fel meddelande
			if (!compName.matches(".*[a-öA-ö]")) {
				System.out.println("Only use letters when putting in competitors name.");

			} else {
				active = false;
			}

		} 
		return compName;
	} 
}
