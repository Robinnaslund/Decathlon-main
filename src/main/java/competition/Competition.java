package competition;

import common.*;


public class Competition {

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

    }

    public int getChoiceOfDiscipline() {
        return choiceOfDiscipline;
    }

    public double abcValuesForCalculatingScore(int row, int column) {

        return calculatingScoreValues[row][column];
    }



}

