package deik;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorExampleTest {
    private CalculatorExample calculatorExample = new CalculatorExample();
    @Test
    public void firstTest() {
        //Given
        //When
        double result = calculatorExample.calc(1,2,"x");
        //Then
        assertEquals(result, Double.NaN);
    }
}
