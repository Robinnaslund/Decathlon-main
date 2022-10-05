package common;

//Friidrott, Beräknar poäng
public class CalcTrackAndField {

	//Definierar tillstånden/attributen
	private int score; // uträknad poäng sparad som en integer

	//Beräknar höjd och distans för fältdisciplin.
	//Definierar metoderna (egenskaperna)
	public int calculateField(double A, double B, double C, double distance) {
		//Math.pow accepterar två parametrar och returnerar värdet för den första parametern upphöjd till den andra parametern.
		score = (int) (A * Math.pow((distance - B), C));
		return score;
	}

	//Beräknar höjd och distans för bandisciplin.
	//Definierar metoderna (egenskaperna)
	public int calculateTrack(double A, double B, double C, double distance) {
		score = (int) (A * Math.pow((B - distance), C));
		return score;
	}

}
 /* Ändra alla variabler till passande namn. Skall enkelt gå att skilja dom två ekvationerna åt.*/
