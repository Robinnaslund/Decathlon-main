package common;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalcTrackAndFieldTest {

    @Test
    public void testCalculateDeca100M()
    {
        //Arrange
        double A = 25.4347;
        double B = 18;
        double C = 1.81;
        double time =  11.0;
        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateTrack(A, B, C, time);

        //Assert
        int expected = 861;
        assertEquals (expected, actual);

    }

    @Test
    public void testCalculateHeptaShotPut()
    {
        //Arrange
        double A = 56.0211;
        double B = 1.5;
        double C = 1.05;
        double meters =  16.5;
        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateField(A, B, C, meters);

        //Assert
        int expected = 962;
        assertEquals (expected, actual);

    }

    @Test
    public void testCalculateDeca100MZeroResult()
    {
        //Arrange
        double A = 25.4347;
        double B = 18;
        double C = 1.81;
        double time =  0;
        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateTrack(A, B, C, time);

        //Assert
        int expected = 0;
        assertEquals (expected, actual);

    }
    @Test
    public void testCalculateHeptaShotPutZeroResult()
    {
        //Arrange
        double A = 56.0211;
        double B = 1.5;
        double C = 1.05;
        double meters =  0;
        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateField(A, B, C, meters);

        //Assert
        int expected = 0;
        assertEquals (expected, actual);

    }

    @Test
    public void testCalculateHeptaShotPutVeryLogShot()
    {
        //Arrange
        double A = 56.0211;
        double B = 1.5;
        double C = 1.05;
        double meters =  100;
        CalcTrackAndField calc = new CalcTrackAndField();

        //Act
        int actual = calc.calculateField(A, B, C, meters);

        //Assert
        int expected = 0;
        assertEquals (expected, actual);

    }
}