import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    int a, b;
    Scanner s = new Scanner(System.in);

    System.out.print("Enter the value of a: ");
    a =s.nextInt();

    System.out.print("Enter the value of b: ");
    b = s.nextInt();
    s.close();
    a = a+b;

    System.out.println("The value of sum is " +a);
  }
}
