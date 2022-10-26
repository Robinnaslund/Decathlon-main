package competition;

import common.*;


public class Competition {

    //Definierar tillstånden/attributen
    public double[][] calculatingScoreValues;
    int score = 0;
    int[] scoreList; // private int [] scores;
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
        int calculatedScore = 0;


        if (competition.toLowerCase().equals("deca")) {

            if (choiceOfDiscipline > 0 && choiceOfDiscipline < 5) {

                calculatedScore = calc.calculateTrack(valueA, valueB, valueC, runningTimeOrDistance);
                addScore(calculatedScore);

            } else {

                calculatedScore = calc.calculateField(valueA, valueB, valueC, runningTimeOrDistance);
                addScore(calculatedScore);
            }
        } else if (competition.equalsIgnoreCase("hepta")) {

            if (choiceOfDiscipline > 0 && choiceOfDiscipline < 4) {

                calculatedScore = calc.calculateTrack(valueA, valueB, valueC, runningTimeOrDistance);
                addScore(calculatedScore);

            } else {

                calculatedScore = calc.calculateField(valueA, valueB, valueC, runningTimeOrDistance);
                addScore(calculatedScore);

            }
        }

    }

    public int getScore() {

        return score;

    }

    public int[] getListOfScores() {

        return scoreList;
    }

    public void printDisciplines() {

    }

    public int getChoiceOfDiscipline() {
        return choiceOfDiscipline;
    }

    public double abcValuesForCalculatingScore(int row, int column) {

        return calculatingScoreValues[row][column];
    }

    public void addScore(int calculatedScore) {

        for (int i = 0; i < scoreList.length; i++) {

            if (scoreList[i] == 0) {

                scoreList[i] = calculatedScore;
                i = scoreList.length;
            }
        }
    }
}