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

    // Test cases for the minus method
    @Test
    public void testMinusPositiveNumbers() {
        assertEquals(2, calculator.minus(5, 3), "Minus 3 from 5 should equal 2");
    }

    @Test
    public void testMinusNegativeNumbers() {
        assertEquals(-2, calculator.minus(-5, -3), "Minus -3 from -5 should equal -2");
    }

    @Test
    public void testMinusZero() {
        assertEquals(5, calculator.minus(5, 0), "Minus 0 from 5 should equal 5");
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

    @Test
    public void testDivideWithNegativeResult() {
        assertEquals(-2, calculator.divide(10, -5), "Dividing 10 by -5 should result in -2");
    }

    @Test
    public void testDivideByOne() {
        assertEquals(10, calculator.divide(10, 1), "Dividing 10 by 1 should result in 10");
    }

    @Test
    public void testDivideWithZeroNumerator() {
        assertEquals(0, calculator.divide(0, 5), "Dividing 0 by 5 should result in 0");
    }

    // Test cases for the factorial method
    @Test
    public void testFactorialPositive() {
        assertEquals(6, calculator.factorial(3), "Factorial of 3 should equal 6");
    }

    @Test
    public void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-5), "Factorial of a negative number is not defined");
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, calculator.factorial(0), "Factorial of 0 should equal 1");
    }
}
