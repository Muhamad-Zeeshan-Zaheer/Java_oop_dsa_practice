import java.util.Scanner;

public class factorial {

  public static int factori(int n) {
    int a = 1;

    for (int i = n; i >= 1; i--) {
      a = a * i;
    }

    if (n == 0) {
      a = 1;
    }

    return a;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = s.nextInt();
    s.close();

    int result = factori(number);
    System.out.println("Factorial of " + number + " is: " + result);
  }
}
