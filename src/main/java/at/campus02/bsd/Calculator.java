package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The {@code Calculator} class provides basic arithmetic operations including addition,
 * subtraction, multiplication, division, and factorial computation.
 * <p>
 * It uses Log4j for logging various operations and results, or errors during the calculations.
 * </p>
 */
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    /**
     * Adds two numbers.
     *
     * @param num1 the first number to add
     * @param num2 the second number to add
     * @return the sum of {@code num1} and {@code num2}
     */
    public double add(double num1, double num2) {
        logger.debug("Adding " + num1 + " and " + num2);
        return num1 + num2;
    }

    /**
     * Subtracts one number from another.
     *
     * @param num1 the number from which {@code num2} is subtracted
     * @param num2 the number to subtract from {@code num1}
     * @return the difference of {@code num1} and {@code num2}
     */
    public double subtract(double num1, double num2) {
        logger.debug("Subtracting " + num2 + " from " + num1);
        return num1 - num2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param num1 the first number to multiply
     * @param num2 the second number to multiply
     * @return the product of {@code num1} and {@code num2}
     */
    public double multiply(double num1, double num2) {
        logger.debug("Multiplying " + num1 + " and " + num2);
        return num1 * num2;
    }

    /**
     * Divides one number by another.
     *
     * @param num1 the dividend
     * @param num2 the divisor
     * @return the quotient of {@code num1} divided by {@code num2}
     * @throws ArithmeticException if {@code num2} is zero
     */
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            logger.error("Attempted to divide by zero");
            throw new ArithmeticException("Cannot divide by zero");
        }
        logger.debug("Dividing " + num1 + " by " + num2);
        return num1 / num2;
    }

    /**
     * Computes the factorial of a non-negative integer.
     *
     * @param n the non-negative integer
     * @return the factorial of {@code n}, or {@code 0} if {@code n} is negative
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public double factorial(int n) {
        if (n < 0) {
            logger.error("Attempted to compute factorial of a negative number");
            throw new IllegalArgumentException("Factorial of negative number is not defined");
        }
        logger.debug("Computing factorial of " + n);
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
