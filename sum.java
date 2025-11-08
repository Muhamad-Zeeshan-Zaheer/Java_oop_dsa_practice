import java.util.Scanner;

public class sum {
  public static void main(String[] args) {
    int a, b;
    Scanner s = new Scanner(System.in);

    System.out.print("Enter the value for a: ");
    a = s.nextInt();

    System.out.print("Enter the value for b:");
    b = s.nextInt();

    s.close();

    a = a+b;

    System.out.println("The sum of 2 numbers is " +a);

  }

}
