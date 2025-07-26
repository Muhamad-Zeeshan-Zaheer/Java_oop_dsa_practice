import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    int number;
    int factorial = 1;
    Scanner s = new Scanner(System.in);
    s.close();

    System.out.print("Enter the number of which you want to find factorial: ");
    number = s.nextInt();

    for (int i = number; i >= 1; i--) {
      factorial *= i;
    }

    System.out.println("The factorial of " + number + " is: " + factorial);
  }
}
