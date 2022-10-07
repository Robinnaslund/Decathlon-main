package decathlon;

import common.*;


public class Discipline {

    //Definierar tillstånden/attributen
    private double[][] decaMatrix;
    int score = 0;
    int choiceOfDiscipline = 0;

    //Definiera konstruktorn, inparametrar som konstruktorn behöver är de attributen som objektet ska få.
    public Discipline() {
        //Deklarera en flerdimensionell array, stoppar in alla decathlon värden/attributen i
        decaMatrix = new double[][]{
                {25.4347, 18, 1.81},  //Deca100M
                {5.74352, 28.5, 1.92},  //Deca110MHurdles
                {1.53775, 82, 1.81},    //Deca400M
                {0.03768, 480, 1.85},   //Deca1500M
                {12.91, 4, 1.1},        //DecaDiscusThrow
                {0.8465, 75, 1.42},     //DecaHighJump
                {10.14, 7, 1.08},       //DecaJavelinThrow
                {0.14354, 220, 1.4},    //DecaLongJump
                {0.2797, 100, 1.35},    //DecaPoleVault
                {51.39, 1.5, 1.05},        //DecaShotPut
                {9.23076, 26.7, 1.835},    //Hep100MHurdles
                {4.99087, 42.5, 1.81},     //Hep200M
                {0.11193, 254, 1.88},      //Hep800M
                {1.84523, 75, 1.348},      //HepHightJump
                {15.9803, 3.8, 1.04},      //HeptJavelinThrow
                {0.188807, 210, 1.41},    //HepLongJump
                {56.0211, 1.5, 1.05}};    //HepShotPut

        }

        //Skapar objekt av klassen CalcTrackAndField
        CalcTrackAndField calc = new CalcTrackAndField();

        public void setChoiceOfDiscipline ( int choiceOfDiscipline){

            this.choiceOfDiscipline = choiceOfDiscipline;

        }

        // Beräkna poängen baserat på tid. Alla löparevenemang.
        public void calculateResult ( double runningTimeOrDistance, boolean isTrackDiscipline){

            double valueA = decaMatrix[choiceOfDiscipline - 1][0];
            double valueB = decaMatrix[choiceOfDiscipline - 1][1];
            double valueC = decaMatrix[choiceOfDiscipline - 1][2];

            if (isTrackDiscipline) {
                score = calc.calculateTrack(valueA, valueB, valueC, runningTimeOrDistance);

            } else {

                score = calc.calculateField(valueA, valueB, valueC, runningTimeOrDistance);
            }

        }

        public int getScore () {

            return score;
        }


    }