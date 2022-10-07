package decathlon;

import common.CalcTrackAndField;
import org.junit.Test;

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
    deca100.calculateResult(runningTime100Meters,true);

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
        deca100.calculateResult(shotPutDistancceInMeters,false);

        double actual= deca100.getScore();
        System.out.println(actual);
        //assert
        double expected = 962;
        assertEquals(expected,actual);
    }

}