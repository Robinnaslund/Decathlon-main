package common;

//Friidrott, Beräknar poäng
public class CalcTrackAndField {

	//Definierar tillstånden/attributen
	private int result;

	//Beräknar höjd och distans för fältdisciplin.
	//Definierar metoderna (egenskaperna)
	public int calculateField(double A, double B, double C, double distance) {
		//Math.pow accepterar två parametrar och returnerar värdet för den första parametern upphöjd till den andra parametern.
		result = (int) (A * Math.pow((distance - B), C));
		return result;
	}

	//Beräknar höjd och distans för bandisciplin.
	//Definierar metoderna (egenskaperna)
	public int calculateTrack(double A, double B, double C, double distance) {
		result = (int) (A * Math.pow((B - distance), C));
		return result;
	}

}
