import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    int a, b, sum, sub, mul, divide, remiander;
    Scanner s = new Scanner(System.in);

    System.out.print("Enter the value of a: ");
    a =s.nextInt();

    System.out.print("Enter the value of b: ");
    b = s.nextInt();
    s.close();
    sum = a+b;
    sub = a-b;
    mul = a*b;
    divide = a/b;
    remiander = a%b;

    System.out.println("The value of sum is " + sum);
    System.out.println("The value of subtract is " + sub);
    System.out.println("The value of multiply is " + mul);
    System.out.println("The value of divide is " + divide);
    System.out.println("The value of remiander is " + remiander);

  }
}
