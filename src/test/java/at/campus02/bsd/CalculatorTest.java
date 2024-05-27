package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculatorTest {

    private static final Logger logger = LogManager.getLogger(CalculatorTest.class);
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
        logger.info("Calculator instance created");
    }

    // Test cases for the add method
    @Test
    public void testAddPositiveNumbers() {
        logger.info("Testing addition of positive numbers: 5 + 3");
        assertEquals(8, calculator.add(5, 3), "Adding 5 and 3 should equal 8");
    }

    @Test
    public void testAddNegativeNumbers() {
        logger.info("Testing addition of negative numbers: -5 + -3");
        assertEquals(-8, calculator.add(-5, -3), "Adding -5 and -3 should equal -8");
    }

    @Test
    public void testAddZero() {
        logger.info("Testing addition with zero: 5 + 0");
        assertEquals(5, calculator.add(5, 0), "Adding 5 and 0 should equal 5");
    }

    // Test cases for the subtract method
    @Test
    public void testSubtractPositiveNumbers() {
        logger.info("Testing subtraction of positive numbers: 5 - 3");
        assertEquals(2, calculator.subtract(5, 3), "Subtracting 3 from 5 should equal 2");
    }

    @Test
    public void testSubtractNegativeNumbers() {
        logger.info("Testing subtraction of negative numbers: -5 - -3");
        assertEquals(-2, calculator.subtract(-5, -3), "Subtracting -3 from -5 should equal -2");
    }

    @Test
    public void testSubtractZero() {
        logger.info("Testing subtraction with zero: 5 - 0");
        assertEquals(5, calculator.subtract(5, 0), "Subtracting 0 from 5 should equal 5");
    }

    // Test cases for the multiply method
    @Test
    public void testMultiplyWithPositiveNumbers() {
        logger.info("Testing multiplication of positive numbers: 5 * 3");
        assertEquals(15, calculator.multiply(5, 3), "Multiplying 5 by 3 should equal 15");
    }

    @Test
    public void testMultiplyWithNegativeNumbers() {
        logger.info("Testing multiplication of negative numbers: -5 * -3");
        assertEquals(15, calculator.multiply(-5, -3), "Multiplying -5 by -3 should equal 15");
    }

    @Test
    public void testMultiplyWithZero() {
        logger.info("Testing multiplication with zero: 5 * 0");
        assertEquals(0, calculator.multiply(5, 0), "Multiplying 5 by 0 should equal 0");
    }

    // Test cases for the divide method
    @Test
    public void testDivideWithPositiveNumbers() {
        logger.info("Testing division of positive numbers: 5 / 3");
        assertEquals(1.66667, calculator.divide(5, 3), 0.00001, "Dividing 5 by 3 should be approximately 1.66667");
    }

    @Test
    public void testDivideWithNegativeNumbers() {
        logger.info("Testing division of negative numbers: -5 / -3");
        assertEquals(1.66667, calculator.divide(-5, -3), 0.00001, "Dividing -5 by -3 should be approximately 1.66667");
    }

    @Test
    public void testDivideByZero() {
        logger.info("Testing division by zero: 5 / 0");
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0), "Dividing by zero should throw ArithmeticException");
    }

    // Test cases for the factorial method
    @Test
    public void testFactorialPositive() {
        logger.info("Testing factorial of a positive number: 3");
        assertEquals(6, calculator.factorial(3), "Factorial of 3 should equal 6");
    }

    @Test
    public void testFactorialNegative() {
        logger.info("Testing factorial of a negative number: -5");
        assertEquals(0, calculator.factorial(-5), "Factorial of a negative number should equal 0");
    }

    @Test
    public void testFactorialZero() {
        logger.info("Testing factorial of zero");
        assertEquals(1, calculator.factorial(0), "Factorial of 0 should equal 1");
    }
}
