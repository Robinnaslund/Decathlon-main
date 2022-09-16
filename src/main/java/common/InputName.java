package common;

import java.util.Scanner;

public class InputName {

	//Definierar tillst�nden/attributen
	String compName = "";



	//L�gg till konkurrent
	//Definierar metoderna
	public String addCompetitor() {

		boolean active = true;
		String compName = "";
		Scanner sc = new Scanner(System.in);

		//Loopen k�rs s� l�nge det �r "active"
		while (active) {
			System.out.println("Please enter the competitor's name:");
			compName = sc.nextLine();
			//Inmatningen ska vara skilt ifr�n .*[a-�A-�], annars f�r man fel meddelande
			if (!compName.matches(".*[a-�A-�]")) {
				System.out.println("Only use letters when putting in competitors name.");

			} else {
				active = false;
			}

		} 
		return compName;
	} 
}
