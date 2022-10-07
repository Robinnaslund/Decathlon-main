package common;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

public class InputResultTest {

    @Test
    public void tesinputResult() {

        //Arrange

        InputResult myInput = new InputResult();

        //Act
        myInput.enterResult(20);
        double actual = myInput.returnResult();

        //Assert
        double expected = 20.0;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void tesinputInCorrectResult() {

        //Arrange


        InputResult myInput = new InputResult();

        //Act
        myInput.enterResult(8.0);
        double actual = myInput.returnResult();

        //Assert
        double expected = 8.0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void tesinputResultZero() {

        //Arrange

        InputResult myInput = new InputResult();

        //Act
        //myInput.enterResult(0);
        //myInput.validateResultInput("f");
        boolean actual = myInput.validateResultInput("f");

        //Assert

        Assertions.assertEquals(false, actual);
    }

    @Test
    public void testinputResult100() {

        //Arrange

        InputResult myInput = new InputResult();

        //Act
        //myInput.enterResult(100);
       // myInput.validateResultInput("100");
        boolean actual = myInput.validateResultInput("100");

        //Assert
        Assertions.assertEquals(false, actual);
    }

}



