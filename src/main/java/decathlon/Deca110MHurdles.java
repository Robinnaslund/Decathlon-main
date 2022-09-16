package decathlon;

import common.*;

public class Deca110MHurdles {

	//Definierar tillstånden/attributen
	private int score;
	private double A = 5.74352;
	private double B = 28.5;
	private double C = 1.92;
	boolean active = true;

	//Skapar objekt av klassen CalcTrackAndField
	CalcTrackAndField calc = new CalcTrackAndField();

	//Skapar objekt av klassen InputResult
	InputResult inputResult = new InputResult();

	// Beräkna poängen baserat på tid. Alla löparevenemang.
	public void calculateResult(double runningTime) {

		while (active) {

			try {
				// Acceptable values.
				//Om körtiden är mindre än 10
				if (runningTime < 10) {
					System.out.println("Value too low");
					runningTime = inputResult.enterResult();
				} else if (runningTime > 28.5) {
					System.out.println("Value too high");
					runningTime = inputResult.enterResult();
				} else {
					score = calc.calculateTrack(A, B, C, runningTime);
					active = false;
				}
			} catch (Exception e) {

				System.out.println("Please enter numbers");
			}
		}
		System.out.println("The result is " + score);

	}

}
