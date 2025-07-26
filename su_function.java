import java.util.Scanner;

public class su_function {
  public static double sum(double a, double b){
    double sum = a+b;
    return sum;
  }
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    double a,b;
    System.out.print("Enter first value: ");
    a=s.nextDouble();
    System.out.print("Enter second value: ");
    b=s.nextDouble();

    double c= sum(a,b);

    System.out.println(c);

  }

}
