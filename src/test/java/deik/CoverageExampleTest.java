package deik;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CoverageExampleTest {
    CoverageExample coverageExample = new CoverageExample();

    @Test
    public void firstTest() {
        //Given
        //When
        int i = coverageExample.decision(1,2,3);
        //Then
        assertEquals(i, 0);
    }
}
