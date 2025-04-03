package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
      Calculator calc;

@BeforeEach
void setup() {
      calc = new Calculator();
}

@Test
@DisplayName("testAddNormalValues()")
void testAddition() {
 assertEquals(5, calc.add(2,3));
}

@Test
@DisplayName("testAddWithZero()")
void testAdditionWithZero(){
 assertEquals(0, calc.add(0,0));
}

@Test
@DisplayName("testAddWithNegative()")
void testAddWithNegative(){
      assertEquals(1, calc.add(-2,3));
}

@Test
@DisplayName("testDivideNormalValues()")
void testDivideNormalValues(){
      assertEquals(5, calc.divide(10,2));
} 

@Test
@DisplayName("testDivideByZero()")
void testDivideByZero(){
      assertThrows(ArithmeticException.class, () -> {
             calc.divide(10, 0);
             });
}

@Test
@DisplayName("testDivideWithZero")
void testDivideWithZero(){
      assertEquals(0, calc.divide(0, 10));
}

@Test
@DisplayName("testMuliplyNormalValues()")
void testMuliplyNormalValues(){
      assertEquals(20, calc.multiply(5, 4));
}

@Test
@DisplayName("testMultiplycommutative")
void testMultiplycommutative(){
      assertEquals(calc.multiply(4, 2), calc.multiply(2, 4));
}

@Test
@DisplayName("testMultiplyWithZero")
void testMultiplyWithZero(){
      assertEquals(0, calc.multiply(100, 0));
}

@Test
@DisplayName("testMinusNormalValues")
void testMinusNormalValues(){
      assertEquals(10, calc.minus(20, 10));
}

@Test
@DisplayName("testMinusWihtZero")
void testMinusWihtZero(){
      assertEquals(-10, calc.minus(0, 10));
}

@Test
@DisplayName("testMinusNegatives")
void testMinusNegatives(){
      assertEquals(-20, calc.minus(-10, 10));
}

@Test
@DisplayName("testFactorialwithvalues")
void testfactorial(){
      assertEquals(120, calc.factorial(5));
}

@Test
@DisplayName("testFactorialwithNegatives")
void testFactorialwithNegatives(){
      assertEquals(1, calc.factorial(-5));
}

@Test
@DisplayName("testFactorialwithZero")
public void testFactorialwithZero() {
    assertEquals(1, calc.factorial(0));
}


}




