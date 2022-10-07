package common;


public class InputResult {

	//Definierar tillstånden/attributen
	double inputResult = 0;

	public void enterResult(double result) {

				inputResult = result;
	}

	public boolean validateResultInput(String inputResult){
		boolean isInputValid = false;
		try {
			double validResult = Double.parseDouble(inputResult);
			isInputValid = true;
		} catch (Exception e) {
			System.out.println("Invalid input, try again.");

		}

		return isInputValid;

	}

	//En metod för att returnera resultatet
	public double returnResult() {
		return inputResult;
	}
}
