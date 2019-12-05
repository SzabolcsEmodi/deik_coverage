package deik;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CoverageExampleTest {
    CoverageExample coverageExample = new CoverageExample();

    @Test
    public void firstTest() {
        //Given
        //When
        int i = coverageExample.decision(354,4,2);
        //Then
        assertEquals(i, 2);
    }


    @Test
    public void secondTest() {
        //Given
        //When
        int i = coverageExample.decision(354,2,4);
        //Then
        assertEquals(i, 2);
    }

    @Test
    public void thirdTest() {
        //Given
        //When
        int i = coverageExample.decision(1,13,7);
        //Then
        assertEquals(i, 1);
    }
}
