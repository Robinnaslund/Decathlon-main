package decathlon;

import common.*;


public class Discipline {

    //Definierar tillstånden/attributen
    public double[][] calculatingScoreValues;
    int score = 0;
    int choiceOfDiscipline = 0;

    //Skapar objekt av klassen CalcTrackAndField
    CalcTrackAndField calc = new CalcTrackAndField();

    public void setChoiceOfDiscipline(int choiceOfDiscipline) {

        this.choiceOfDiscipline = choiceOfDiscipline;

    }

    // Beräkna poängen baserat på tid. Alla löparevenemang.
    public void calculateScore(double runningTimeOrDistance, String competition) {

        double valueA = calculatingScoreValues[choiceOfDiscipline - 1][0];
        double valueB = calculatingScoreValues[choiceOfDiscipline - 1][1];
        double valueC = calculatingScoreValues[choiceOfDiscipline - 1][2];

        if (competition.toLowerCase().equals("deca")) {

            if (choiceOfDiscipline > 0 && choiceOfDiscipline < 5) {

                score = calc.calculateTrack(valueA, valueB, valueC, runningTimeOrDistance);

            } else {

                score = calc.calculateField(valueA, valueB, valueC, runningTimeOrDistance);
            }
        } else if (competition.equalsIgnoreCase("hepta")) {

            if (choiceOfDiscipline > 0 && choiceOfDiscipline < 4) {

                score = calc.calculateTrack(valueA, valueB, valueC, runningTimeOrDistance);

            } else {

                score = calc.calculateField(valueA, valueB, valueC, runningTimeOrDistance);

            }
        }

    }

    public int getScore() {

        return score;
    }

    public void printDisciplines() {
        System.out.println("1. Decathlon 100 meters. (Measured in seconds)");
        System.out.println("2. Decathlon 400 meters. (Measured in seconds)");
        System.out.println("3. Decathlon 110 meters hurdles. (Measured in seconds)");
        System.out.println("4. Decathlon 1500 meters. (Measured in minutes and seconds)");
        System.out.println("5. Decathlon Long Jump. (Measured in centimeters)");
        System.out.println("6. Decathlon High Jump. (Measured in centimeters)");
        System.out.println("7. Decathlon Pole Vault. (Measured in centimeters)");
        System.out.println("8. Decathlon Discus Throw. (Measured in meters)");
        System.out.println("9. Decathlon Javelin Throw. (Measured in meters)");
        System.out.println("10. Decathlon Shot Put. (Measured in meters)");
        System.out.println("11. Heptathlon 200 meters.");
        System.out.println("12. Heptathlon 800 meters.");
        System.out.println("13. Heptathlon 100 meters hurdles.");
        System.out.println("14. Heptathlon High Jump.");
        System.out.println("15. Heptathlon Long Jump.");
        System.out.println("16. Heptathlon Shot Put.");
        System.out.println("17. Heptathlon Javelin Throw.");
    }


    public int getChoiceOfDiscipline() {
        return choiceOfDiscipline;
    }

    public double abcValuesForCalculatingScore(int row, int column) {

        return calculatingScoreValues[row][column];
    }

}