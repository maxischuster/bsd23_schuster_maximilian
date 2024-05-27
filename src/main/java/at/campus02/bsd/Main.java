package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double num1 = 10.5;
        double num2 = 5.2;


        logger.info("Starting the programm");

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        logger.error("ATTENTION: An error appeared");
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
        System.out.println("Maximilian Schuster");
    }
}
