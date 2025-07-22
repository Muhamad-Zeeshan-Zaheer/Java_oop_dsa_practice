import java.util.Scanner;

public class sum {
  public static void main(String[] args) {
    double a,b;
    Scanner s = new Scanner(System.in);

    System.out.println("Enter the value of a: ");
    a = s.nextDouble();

    System.out.println("Enter the value of b: ");
    b=s.nextDouble();
    s.close();
    
    a =a+b;

    System.out.println("Sum is" + a) ;
  }

}
