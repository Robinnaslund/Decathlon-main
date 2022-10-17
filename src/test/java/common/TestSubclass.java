package common;
import decathlon.DecaSub;
import static org.junit.Assert.assertEquals;
import decathlon.Discipline;
import org.junit.Test;


public class TestSubclass {

    //Skapar subklassen Deca
    @Test
    public void testChoice() {
        //Arrange
        DecaSub sub = new DecaSub();

        //Act
        sub.setChoiceOfDiscipline(4);

        //Assert
        int actual = sub.getChoiceOfDiscipline();
        int expected = 4;
        assertEquals(expected, actual);
    }


}




