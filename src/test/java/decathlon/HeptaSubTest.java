package decathlon;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HeptaSubTest {

    @Test
    public void usingHeptahlonSubClass() {
        //Arrange

        HeptaSub sub = new HeptaSub();

        //Act
        String actual = sub.WhereAmI();

        //Assert
        String expected = "You are using the HeptaSub Class";
        assertEquals(expected, actual);
    }

    @Test
    public void chooseHeptathlonDiscipline100MHurdles() {
        //Arrange

        HeptaSub sub = new HeptaSub();

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
        HeptaSub sub = new HeptaSub();

        //Act
        double actual = sub.abcValuesForCalculatingScore(0, 1);


        //Assert
        double expected = 26.7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateScoreHeptaHighJUmp() {

        //arrange
        HeptaSub heptaHighJump = new HeptaSub();

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
        HeptaSub heptaLongJump = new HeptaSub();

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
        HeptaSub sub = new HeptaSub();

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
        HeptaSub sub = new HeptaSub();

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
        HeptaSub sub = new HeptaSub();

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
}
