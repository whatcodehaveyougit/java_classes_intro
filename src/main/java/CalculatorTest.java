import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

//    Creating the variable calculator which follows the blueprint of Calculator
    private Calculator calculator;

//    Running this before all my tests
    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void add_function_works(){
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void subtract_function_works(){
        assertEquals(1, calculator.subtract(2, 1));
    }

    @Test
    public void multiply_function_works(){
        assertEquals(10,calculator.multiply(2,5));
    }

    @Test
    public void divide_function_works(){
        assertEquals(5, calculator.divide(10.0,2.0), 0.01 );
    }

}
