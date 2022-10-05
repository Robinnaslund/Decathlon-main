package common;

import decathlon.Deca100M;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InputNameTest {

    @Test
    public void addCompetitorName() {
        //Arrange

        InputName addComp = new InputName();

        //Act


        addComp.addCompetitor("Camilla");
        String actual = addComp.readCompetitorName();


        //Assert
        String expected = "Camilla";
        assertEquals(expected, actual);

    }

    @Test
    public void validateInputCorrectInput() {
        //Arrange

        InputName addComp = new InputName();

        //Act

        boolean actual = addComp.validateNameData("Camilla");


        //Assert

        assertEquals(true, actual);

    }

    @Test
    public void validateInputNonValidInput() {
        //Arrange

        InputName addComp = new InputName();

        //Act

        boolean actual = addComp.validateNameData("102");


        //Assert

        assertEquals(false, actual);

    }

   /* @Test
    public void addCompetitorNameInvalidCharacters() {
        //Arrange

        InputName addComp = new InputName();

        //Act


        addComp.addCompetitor("Camill09");
        String actual = addComp.readCompetitorName();


        //Assert
        String expected = "";
        assertEquals(expected, actual);

    }*/
}



