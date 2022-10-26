package competition;

public class Heptathlon extends Competition {

    public Heptathlon() {

        scoreList = new int[7];

        calculatingScoreValues = new double[][]{
                {9.23076, 26.7, 1.835},    //Hep100MHurdles
                {4.99087, 42.5, 1.81},     //Hep200M
                {0.11193, 254, 1.88},      //Hep800M
                {1.84523, 75, 1.348},      //HepHightJump
                {15.9803, 3.8, 1.04},      //HeptJavelinThrow
                {0.188807, 210, 1.41},    //HepLongJump
                {56.0211, 1.5, 1.05}};    //HepShotPut

    }

    @Override
    public void printDisciplines() {
        super.printDisciplines();
        System.out.println("Below is a list of all disciplines, write in corresponding number for your choice.");
        System.out.println("1. Heptathlon 100 meters hurdles.");
        System.out.println("2. Heptathlon 200 meters.");
        System.out.println("3. Heptathlon 800 meters.");
        System.out.println("4. Heptathlon High Jump.");
        System.out.println("5. Heptathlon Javelin Throw.");
        System.out.println("6. Heptathlon Long Jump.");
        System.out.println("7. Heptathlon Shot Put.");

    }

    public String WhereAmI() {

        return "You are using the HeptaSub Class";
    }

}
