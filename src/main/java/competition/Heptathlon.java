package competition;

public class Heptathlon extends Competition {

    public Heptathlon() {
        calculatingScoreValues = new double[][]{
                {9.23076, 26.7, 1.835},    //Hep100MHurdles
                {4.99087, 42.5, 1.81},     //Hep200M
                {0.11193, 254, 1.88},      //Hep800M
                {1.84523, 75, 1.348},      //HepHightJump
                {15.9803, 3.8, 1.04},      //HeptJavelinThrow
                {0.188807, 210, 1.41},    //HepLongJump
                {56.0211, 1.5, 1.05}};    //HepShotPut

    }

    public String WhereAmI() {

        return "You are using the HeptaSub Class";
    }

}
