package common;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InputNameTest {

    @Test
    public void addCompetitorName() {
        //Arrange
        Competitor addComp = new Competitor();

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
        Competitor addComp = new Competitor();

        //Act
        boolean actual = addComp.validateNameInput("Camilla");


        //Assert
        assertEquals(true, actual);

    }

    @Test
    public void validateInputNonValidInput() {
        //Arrange
        Competitor addComp = new Competitor();

        //Act
        boolean actual = addComp.validateNameInput("102");

        //Assert
        assertEquals(false, actual);

    }


    //Testet går igenom, vi får förväntad resultat
   @Test
    public void addCompetitorNameInvalidCharacters() {
        //Arrange
        Competitor addComp = new Competitor();

        //Act
        boolean actual = addComp.validateNameInput("Camill09");

        //Assert
       assertEquals(false, actual);

    }


    //Testet går inte igenom, vi får inte förväntad resultat
    @Test
    public void emptyInput() {
        //Arrange
        Competitor addComp = new Competitor();

        //Act
        addComp.addCompetitor("");
        String actual = addComp.readCompetitorName();

        //Assert
        String expected = "Please enter the competitor's name:";
        assertEquals(expected, actual);
    }



   //Denna test går inte igenom eftersom det är ok att skriva hur många tecken som helst,
   // vi får inte det förväntade resultatet
    @Test
    public void  longName() {
        //Arrange
        Competitor addComp = new Competitor();

        //Act
        addComp.addCompetitor("DuniaCamillaRobinTommiochhelaklassentestarvihär");
        String actual = addComp.readCompetitorName();


        //Assert
        String expected = "";
        assertEquals(expected, actual);

    }


}



