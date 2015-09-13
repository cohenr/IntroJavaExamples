import java.util.Scanner;

/**
 * Simple Integer Calculator
 * @author Robert Cohen
 */
public class SimpleCalculator {
 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter the first integer: ");
    int x = input.nextInt();
    System.out.print("Enter the second integer: ");
    int y = input.nextInt();
    
    System.out.println( x + " + " + y + " = " + (x+y));
    System.out.println( x + " - " + y + " = " + (x-y));
    System.out.println( x + " * " + y + " = " + (x*y));
    System.out.println( x + " / " + y + " = " + (x/y));
    System.out.println( x + " % " + y + " = " + (x%y));
  }
  
}
