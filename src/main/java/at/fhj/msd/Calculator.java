package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
      Logger logger = LogManager.getLogger(Calculator.class);
      public double add(double number1, double number2)
      {
            logger.info("added number 1: " + number1 + " and number 2:" + number2);
             return number1 + number2;  
      }
      public double minus(double number1, double number2)
      {
            logger.info("subtracted number 1: " + number1 + " and number 2:" + number2);
             return number1 - number2; 
      }
      public double divide(double number1, double number2)
      { 
            logger.info("divide called with: number1 =" + number1 + ", number2 =" + number2);
            if (number2 == 0)
            {
                  logger.error("Division called with 0!");
                  throw new ArithmeticException("Division by 0 not possible");
            }
            return number1 / number2;
      
      }

      public double multiply(double number1, double number2)
      {
            logger.info("Multiplied number 1: " + number1 + " and number 2:" + number2);
             return number1 * number2; 
      }

      public int factorial(int n) {
            logger.info("Factorial of:" + n);
            return (n <= 1) ? 1 : n * factorial(n - 1);
           }
}
