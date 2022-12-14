package competition;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class HeptathlonTest {

    @Test
    public void usingHeptahlonSubClass() {
        //Arrange

        Heptathlon sub = new Heptathlon();

        //Act
        String actual = sub.WhereAmI();

        //Assert
        String expected = "You are using the HeptaSub Class";
        assertEquals(expected, actual);
    }

    @Test
    public void chooseHeptathlonDiscipline100MHurdles() {
        //Arrange

        Heptathlon sub = new Heptathlon();

        //Act
        sub.setChoiceOfDiscipline(1);
        int actual = sub.getChoiceOfDiscipline();
        //Assert
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testUsingSubClassHeptaSub() {
        //Arrange
        Heptathlon sub = new Heptathlon();

        //Act
        double actual = sub.abcValuesForCalculatingScore(0, 1);


        //Assert
        double expected = 26.7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateScoreHeptaHighJUmp() {

        //arrange
        Heptathlon heptaHighJump = new Heptathlon();

        //act
        double heigtHighJump = 182;
        int choiceOfDiscipline = 4;
        heptaHighJump.setChoiceOfDiscipline(choiceOfDiscipline);
        heptaHighJump.calculateScore(heigtHighJump, "hepta");

        double actual = heptaHighJump.getScore();
        System.out.println(actual);
        //assert
        double expected = 1000;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateScoreHeptaLongJump() {

        //arrange
        Heptathlon heptaLongJump = new Heptathlon();

        //act

        double heigtLongJump = 648;
        int choiceOfDiscipline = 6;
        heptaLongJump.setChoiceOfDiscipline(choiceOfDiscipline);
        heptaLongJump.calculateScore(heigtLongJump, "hepta");

        double actual = heptaLongJump.getScore();
        System.out.println(actual);
        //assert
        double expected = 1000;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateScoreHepta200M() {

        //arrange
        Heptathlon sub = new Heptathlon();

        //act
        double Hepta200Meter = 23.8;
        int choiceOfDiscipline = 2;
        sub.setChoiceOfDiscipline(choiceOfDiscipline);
        sub.calculateScore(Hepta200Meter, "hepta");

        double actual = sub.getScore();
        System.out.println(actual);
        //assert
        double expected = 1000;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateScoreHepta800M() {

        //arrange
        Heptathlon sub = new Heptathlon();

        //act
        double Hepta800Meters = 127.63;
        int choiceOfDiscipline = 3;
        sub.setChoiceOfDiscipline(choiceOfDiscipline);
        sub.calculateScore(Hepta800Meters, "hepta");

        double actual = sub.getScore();
        System.out.println(actual);
        //assert
        double expected = 1000;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateScoreHepta100MHUrdles() {

        //arrange
        Heptathlon sub = new Heptathlon();

        //act
        double Hepta100Meters = 13.85;
        int choiceOfDiscipline = 1;
        sub.setChoiceOfDiscipline(choiceOfDiscipline);
        sub.calculateScore(Hepta100Meters, "hepta");

        double actual = sub.getScore();
        System.out.println(actual);
        //assert
        double expected = 1000;
        Assertions.assertEquals(expected, actual);
    }

  /*  @Test
    public void saveMultipleScores(){

        Heptathlon myHepta = new Heptathlon();

        int firstScore = 1001;
        int secondScore = 1238;

        myHepta.addScore(firstScore);
        myHepta.addScore(secondScore);

        int [] actual = myHepta.getListOfScores();

        int [] expected = {1001, 1238,0,0,0,0};

        assertArrayEquals(expected,actual);

    }

    @Test
    public void saveScoresForEveryDisciplineInHeptathlon(){

        Heptathlon myHepta = new Heptathlon();

        int score100MHurdles = 1093;
        int scoreHighJump = 1171;
        int scoreShotPut = 863;
        int score200M = 944;
        int scoreLongJump = 1036;
        int scoreJavelinThrow = 919;
        int score800M = 921;

        myHepta.addScore(score100MHurdles);
        myHepta.addScore(scoreHighJump);
        myHepta.addScore(scoreShotPut);
        myHepta.addScore(score200M);
        myHepta.addScore(scoreLongJump);
        myHepta.addScore(scoreJavelinThrow);
        myHepta.addScore(score800M);

        int [] actual = myHepta.getListOfScores();

        int [] expected = {1093, 1171,863,944,1036,919,921};

        assertArrayEquals(expected,actual);

    }

    @Test
    public void calculateMultipleScores(){

        Heptathlon myHepta = new Heptathlon();

        double longJumpResult = 648;
        double result100M = 13.85;

        myHepta.setChoiceOfDiscipline(6);
        myHepta.calculateScore(longJumpResult, "hepta");
        myHepta.setChoiceOfDiscipline(1);
        myHepta.calculateScore(result100M, "hepta");



        int [] actual = myHepta.getListOfScores();

        int [] expected = {1001, 1000,0,0,0,0,0};

        assertArrayEquals(expected,actual);

    }


   */

}
