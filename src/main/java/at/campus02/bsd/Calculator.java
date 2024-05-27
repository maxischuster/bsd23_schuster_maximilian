package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public double add(double num1, double num2) {
        logger.debug("Adding " + num1 + " and " + num2);
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        logger.debug("Subtracting " + num2 + " from " + num1);
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        logger.debug("Multiplying " + num1 + " and " + num2);
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            logger.error("Attempted to divide by zero");
            throw new ArithmeticException("Cannot divide by zero");
        }
        logger.debug("Dividing " + num1 + " by " + num2);
        return num1 / num2;
    }

    public double factorial(int n) {
        if (n < 0) {
            logger.error("Attempted to compute factorial of a negative number");
            return 0;
        }
        logger.debug("Computing factorial of " + n);
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
