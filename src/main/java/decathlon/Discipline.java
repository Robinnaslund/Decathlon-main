package decathlon;

import common.*;


public class Discipline {

    //Definierar tillstånden/attributen
    private double A;
    private double B;
    private double C;
    private double[][] decaMatrix;
    int score = 0;
    int choiceOfDiscipline = 0;

    //Definiera konstruktorn, inparametrar som konstruktorn behöver är de attributen som objektet ska få.
    public Discipline() {
        //Deklarera en flerdimensionell array, stoppar in alla decathlon värden/attributen i
        decaMatrix = new double[][]{{25.4347, 18, 1.81},  //Deca100M
                {5.74352, 28.5, 1.92},  //Deca110MHurdles
                {1.53775, 82, 1.81},    //Deca400M
                {0.03768, 480, 1.85},   //Deca1500M
                {12.91, 4, 1.1},        //DecaDiscusThrow
                {0.8465, 75, 1.42},     //DecaHighJump
                {10.14, 7, 1.08},       //DecaJavelinThrow
                {0.14354, 220, 1.4},    //DecaLongJump
                {0.2797, 100, 1.35},    //DecaPoleVault
                {51.39, 1.5, 1.05}};        //DecaShotPut

    }

    //Skapar objekt av klassen CalcTrackAndField
    CalcTrackAndField calc = new CalcTrackAndField();
    //Skapar objekt av klassen InputResult
    InputResult inputResult = new InputResult();


    public void setChoiceOfDiscipline(int choiceOfDiscipline){

        this.choiceOfDiscipline = choiceOfDiscipline;

    }
    // Beräkna poängen baserat på tid. Alla löparevenemang.
    public void calculateResult(double runningTime, double distance) {


        score = calc.calculateTrack(A, B, C, runningTime);

        score = calc.calculateField(A, B, C, distance);

    }

    public int getScore(){

        return score;
    }


}