package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Creates a logs Folder with a log file in it having the logger infos and errors 
 * documented in the log file of the Methods/Calculations runned in the Main Class/The Testing Class
 * 
 */

public class Calculator {
      Logger logger = LogManager.getLogger(Calculator.class);

      /**
      * A add() Method, which adds two double values and includes a logger info statement, which documents which values are being added
      *@param number1
      *@param number2
      *@return the sum of the two double values    
       */
      public double add(double number1, double number2)
      {
            logger.info("added number 1: " + number1 + " and number 2:" + number2);
             return number1 + number2;  
      }

      /**
       * A minus() Method, which subtracts two double values and includes a logger info statement, which documents which values are being subtracted
       * @param number1
       * @param number2
       * @return the difference between the number 2 and number 1
       */
      public double minus(double number1, double number2)
      {
            logger.info("subtracted number 1: " + number1 + " and number 2:" + number2);
             return number1 - number2; 
      }

      /**
       * A divide() Method, which divides two double values and includes a logger info statement and a logger error statement, which documents which values are 
       * being divided and if a division with number 2 = 0 is called, a logger error documents it with and clear statement.
       * @param number1
       * @param number2
       * @throws ArithmeticException
       * @return division between number 1 and number 2
       */
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

      /**
       * A multiply() Method, multiplying two double values and  includes a logger info statement, which documents which values are being multiplied
       * @param number1
       * @param number2
       * @return number 1 and number 2 multiplied
       */
      public double multiply(double number1, double number2)
      {
            logger.info("Multiplied number 1: " + number1 + " and number 2:" + number2);
             return number1 * number2; 
      }

      /**
       * A factorial Method, Calculating the factorial value of an interger. The Method also includs a logger info statement,
       * which documents which of which value is the factorial calculated
       * @param n
       * @return n factorial
       */
      public int factorial(int n) {
            logger.info("Factorial of:" + n);
            return (n <= 1) ? 1 : n * factorial(n - 1);
           }
}
