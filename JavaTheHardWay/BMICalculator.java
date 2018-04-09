import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double in, lb, bmi;

    System.out.print( "Your height in inches: ");
    in = keyboard.nextDouble();

    System.out.print( "Your weight in lb: ");
    lb = keyboard.nextDouble();

    bmi = lb / (in*in) * 703;

    System.out.println( "Your BMI is " + bmi );
  }
}
