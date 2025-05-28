import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    int number;
    long factorial = 1;

    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of which you want to find factorial:");
    number = s.nextInt();

    if (number < 0) {
      System.out.println("Factorial is not defined for negative numbers.");
    }
    else {
      for (int i = 1; i <= number; i++)
      {
        factorial =factorial* i;
      }
      System.out.println("Factorial of " + number + " is: " + factorial);
    }
    s.close();
  }
}
