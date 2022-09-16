package common;

import java.util.Scanner;

public class InputResult {

	//Definierar tillstånden/attributen
	double inputResult = 0;

	public double enterResult() {
		Scanner sc = new Scanner(System.in);
		boolean active = true;

		//Loopen körs så länge det är "active"
		while (active) {
			System.out.println("Please enter the result:");

			//Om något går utanför det normala flödet i programmet
			try {
				inputResult = Double.parseDouble(sc.nextLine());
				active = false;
			} catch (Exception e) {
				System.out.println("Invalid input, try again.");
				
			}

		}
		return inputResult;
	}

	//En metod för att returnera resultatet
	public double returnResult() {
		return inputResult;
	}
}
