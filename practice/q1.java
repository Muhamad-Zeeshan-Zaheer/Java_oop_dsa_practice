import java.util.Scanner;

public class q1 {

  public static double oddsum(double a, double b, double c) {
    double sum, avg;
    sum = a + b + c;
    avg = sum / 3;
    return avg; // You must return a value
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double a, b, c;

    System.out.print("Enter the first number: ");
    a = s.nextDouble();

    System.out.print("Enter the second number: ");
    b = s.nextDouble();

    System.out.print("Enter the third number: ");
    c = s.nextDouble();

    s.close();

    System.out.println("The average of the numbers is: " + oddsum(a, b, c));
  }
}
