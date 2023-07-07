import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {

    @Test
    void testGetBin() {
        //Given
       Bins testBins = new Bins(0,2);
       int expectedValue =0;
       //When
        int actualValue = testBins.getBin(0);
        //Then
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void testIncrementBin() {
        //given
        Bins testBins = new Bins(0,2);
        int expectedValue = 1;

        //when

        testBins.incrementBin(2);
        int actualValue = testBins.getBin(2);
        //then
        assertEquals(expectedValue, actualValue);
    }
}