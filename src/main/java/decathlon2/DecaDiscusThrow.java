package decathlon2;

import common.CalcTrackAndField;
import common.InputResult;

public class DecaDiscusThrow {

	private int score;
	private double A = 12.91;
	private double B = 4;
	private double C = 1.1;
	boolean active = true;

	//Skapar objekt av klassen CalcTrackAndField
	CalcTrackAndField calc = new CalcTrackAndField();

	//Skapar objekt av klassen InputResult
	InputResult inputResult = new InputResult();

	// Calculate the score based on distance and height. Measured in meters.
	public void calculateResult(double distance) {

		while (active) {

			try {
				// Acceptable values.
				//Om distansen är mindre än 0
				if (distance < 0) {
					System.out.println("Value too low");
					distance = inputResult.enterResult();
				} else if (distance > 85) {
					System.out.println("Value too high");
					distance = inputResult.enterResult();
				} else {
					score = calc.calculateField(A, B, C, distance);

					active = false;
				}
			} catch (Exception e) {

				System.out.println("Please enter numbers");
			}
		}
		System.out.println("The result is: " + score);

	}

}
