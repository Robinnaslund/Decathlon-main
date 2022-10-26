package competition;


public class Decathlon extends Competition {
    public Decathlon() {

        scoreList = new int[10];

        calculatingScoreValues = new double[][]{
                {25.4347, 18, 1.81},  //Deca100M
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


    public void printDisciplines() {
        System.out.println("Below is a list of all disciplines, write in corresponding number for your choice.");
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
    }
}
