package common;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalcTrackAndFieldTest {

    @Test
    public void testCalculateTrack()
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
}