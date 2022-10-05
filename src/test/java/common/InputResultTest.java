package common;

import decathlon.Deca100M;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;


public class InputResultTest {

    @Test
    public void testDeca100M (){

        //Arrange
        ByteArrayInputStream in = new ByteArrayInputStream("11.0".getBytes());
        System.setIn(in);

        Deca100M myRace = new Deca100M();

        //Act
        myRace.calculateResult(11.0);
        double actual = myRace.returnResult();

        //Assert
        String expected = "The result is 962";
        Assertions.assertEquals(expected, actual);




    }
}