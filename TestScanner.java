import java.util.Scanner;

public class TestScanner {
  
  
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    String line = input.nextLine();
    int i = input.nextInt();
    String word = input.next();
    System.out.println(line);
    System.out.println(i);
    System.out.println(word);
    
  }
  
}
