package at.fhj.msd;

/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Casper Zielinski");

        System.out.println(calc.add(7, 21));
        System.out.println(calc.minus(7, 21));
        System.out.println(calc.divide(7, 21));
        System.out.println(calc.multiply(21, 7));
    }
}
