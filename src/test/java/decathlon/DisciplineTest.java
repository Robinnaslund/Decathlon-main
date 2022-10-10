package decathlon;

import common.CalcTrackAndField;
import org.junit.Test;

import static java.lang.Double.parseDouble;
import static org.junit.jupiter.api.Assertions.*;

public class DisciplineTest {

    @Test
    public void calculateScoreTrackDiscipline(){

    //arrange
    Discipline deca100 = new Discipline();

    //act
    double runningTime100Meters = 11.0;
    int choiceOfDiscipline = 1;
    deca100.setChoiceOfDiscipline(choiceOfDiscipline);
    deca100.calculateResult(runningTime100Meters);

    double actual= deca100.getScore();
    System.out.println(actual);
    //assert
    double expected = 861;
    assertEquals(expected,actual);
}

   @Test
    public void calculateScoreFieldDiscipline(){

        //arrange
        Discipline deca100 = new Discipline();

        //act
        double shotPutDistancceInMeters = 16.5;
        int choiceOfDiscipline = 17;
        deca100.setChoiceOfDiscipline(choiceOfDiscipline);
        deca100.calculateResult(shotPutDistancceInMeters);

        double actual= deca100.getScore();
        System.out.println(actual);
        //assert
        double expected = 962;
        assertEquals(expected,actual);
    }
    @Test
    public void calculateScoreFieldDisciplineZero(){

        //arrange
        Discipline decaHighJump = new Discipline();

        //act
        double highjumpDistancceInMeters = 0;
        int choiceOfDiscipline = 6;
        decaHighJump.setChoiceOfDiscipline(choiceOfDiscipline);
        decaHighJump.calculateResult(highjumpDistancceInMeters);

        double actual= decaHighJump.getScore();
        System.out.println(actual);
        //assert
        String expected = "Please write your result";
        assertEquals(expected,actual);
    }
    @Test
    public void calculateScoreFieldDisciplineLetters(){

        //arrange
        Discipline heptaLongJump = new Discipline();

        //act
        String longjump = "abcd";
        int choiceOfDiscipline = 16;
        heptaLongJump.setChoiceOfDiscipline(choiceOfDiscipline);
        //heptaLongJump.calculateResult(longjumpDistanceInMeters,true);

        double actual= heptaLongJump.getScore();
        System.out.println(actual);
        //assert
        String expected = "Only numbers as result please!";
        assertEquals(expected,actual);

    }


    @Test
    public void calculateScoreTrackDiscipline200mFast(){

        //arrange
        Discipline hepta200m = new Discipline();

        //act
        double RunningTimehepta200m = 2;
        int choiceOfDiscipline = 12;
        hepta200m.setChoiceOfDiscipline(choiceOfDiscipline);
        hepta200m.calculateResult(RunningTimehepta200m);

        double actual= hepta200m.getScore();
        System.out.println(actual);
        //assert
        String expected = "Please input another result";
        assertEquals(expected,actual);
    }

    @Test
    public void calculateScoreTrackDisciplinehep800mSlow(){

        //arrange
        Discipline hepta800m = new Discipline();

        //act
        double hepta800 = 1000;
        int choiceOfDiscipline = 12;
        hepta800m.setChoiceOfDiscipline(choiceOfDiscipline);
        hepta800m.calculateResult(hepta800);

        double actual= hepta800m.getScore();
        System.out.println(actual);
        //assert
        String expected = "Please input another result";
        assertEquals(expected,actual);
    }

    @Test
    public void calculateScoreTrackDisciplinehep800mSpecialCharacter(){

        //arrange
        Discipline hepta800m = new Discipline();

        //act
        String hepta800 = "!#&?";
        int choiceOfDiscipline = 12;
        hepta800m.setChoiceOfDiscipline(choiceOfDiscipline);
        //hepta800m.calculateResult(hepta800);

        double actual= hepta800m.getScore();
        System.out.println(actual);
        //assert
        String expected = "Please input numbers as result";
        assertEquals(expected,actual);
    }

}