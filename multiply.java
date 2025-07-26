import java.util.Scanner;

public class multiply {
  public static double multiply(double a, double b){
    double d= a*b;
    return d;
  }
  public static void main(String[] args) {
    double a, b;
    Scanner s= new Scanner(System.in);

    System.out.print("Enter the first value: ");
    a = s.nextDouble();

    System.out.print("Enter the second value: ");
    b = s.nextDouble();

    System.out.println("The result of multipication is "+ multiply(a, b));



  }

}
