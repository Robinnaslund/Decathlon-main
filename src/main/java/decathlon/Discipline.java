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
        public void calculateResult (double runningTimeOrDistance){

            double valueA = decaMatrix[choiceOfDiscipline - 1][0];
            double valueB = decaMatrix[choiceOfDiscipline - 1][1];
            double valueC = decaMatrix[choiceOfDiscipline - 1][2];

            if (choiceOfDiscipline<5 || (choiceOfDiscipline >10 && choiceOfDiscipline <14)) {

                score = calc.calculateTrack(valueA, valueB, valueC, runningTimeOrDistance);

            } else {

                score = calc.calculateField(valueA, valueB, valueC, runningTimeOrDistance);
            }

        }

        public int getScore () {

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

    }