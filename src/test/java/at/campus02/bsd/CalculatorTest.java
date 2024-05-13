package at.campus02.bsd;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    // Test cases for the add method
    @Test
    public void testAddPositiveNumbers() {
        assertEquals(8, calculator.add(5, 3), "Adding 5 and 3 should equal 8");
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-8, calculator.add(-5, -3), "Adding -5 and -3 should equal -8");
    }

    @Test
    public void testAddZero() {
        assertEquals(5, calculator.add(5, 0), "Adding 5 and 0 should equal 5");
    }

    // Test cases for the subtract method
    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(2, calculator.subtract(5, 3), "Subtracting 3 from 5 should equal 2");
    }

    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals(-2, calculator.subtract(-5, -3), "Subtracting -3 from -5 should equal -2");
    }

    @Test
    public void testSubtractZero() {
        assertEquals(5, calculator.subtract(5, 0), "Subtracting 0 from 5 should equal 5");
    }

    // Test cases for the multiply method
    @Test
    public void testMultiplyWithPositiveNumbers() {
        assertEquals(15, calculator.multiply(5, 3), "Multiplying 5 by 3 should equal 15");
    }

    @Test
    public void testMultiplyWithNegativeNumbers() {
        assertEquals(15, calculator.multiply(-5, -3), "Multiplying -5 by -3 should equal 15");
    }

    @Test
    public void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(5, 0), "Multiplying 5 by 0 should equal 0");
    }

    // Test cases for the divide method
    @Test
    public void testDivideWithPositiveNumbers() {
        assertEquals(1.66667, calculator.divide(5, 3), 0.00001, "Dividing 5 by 3 should be approximately 1.66667");
    }

    @Test
    public void testDivideWithNegativeNumbers() {
        assertEquals(1.66667, calculator.divide(-5, -3), 0.00001, "Dividing -5 by -3 should be approximately 1.66667");
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0), "Dividing by zero should throw ArithmeticException");
    }
}
