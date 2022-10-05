package common;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class InputNameTest {

    @Test
    public void testInputName (){

        //Arrange
        ByteArrayInputStream in = new ByteArrayInputStream("Kalle Anka".getBytes());
        System.setIn(in);

        InputName myInput = new InputName();

        //Act
        String actual = myInput.addCompetitor();

        //Assert
        String expected = "Kalle Anka";
        Assertions.assertEquals(expected, actual);




    }

}



