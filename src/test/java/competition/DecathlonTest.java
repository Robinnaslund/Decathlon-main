package competition;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class DecathlonTest {

    //Skapar subklassen Deca
    @Test
    public void testChoice() {
        //Arrange
        Decathlon sub = new Decathlon();

        //Act
        sub.setChoiceOfDiscipline(4);

        //Assert
        int actual = sub.getChoiceOfDiscipline();
        int expected = 4;
        assertEquals(expected, actual);
    }
    @Test
    public void testUsingSubClassDecaSub() {
        //Arrange
        Decathlon sub = new Decathlon();

        //Act
        double actual = sub.abcValuesForCalculatingScore(0,1);


        //Assert
        double expected = 18;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void calculateScoreDeca100M(){

        //arrange
        Decathlon deca100 = new Decathlon();

        //act
        double runningTime100Meters = 11.0;
        int choiceOfDiscipline = 1;
        deca100.setChoiceOfDiscipline(choiceOfDiscipline);
        deca100.calculateScore(runningTime100Meters, "deca");

        double actual= deca100.getScore();
        System.out.println(actual);
        //assert
        double expected = 861;
        Assertions.assertEquals(expected, actual);
    }
}




