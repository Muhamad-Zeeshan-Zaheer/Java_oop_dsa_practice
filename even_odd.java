import java.util.Scanner;

public class even_odd {
  public static void main(String[] args)
  {
    double number;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    number=sc.nextDouble();
    if (number % 2 == 0) {
      System.out.println("The number " + number + " is even.");
    } else {
      System.out.println("The number " + number + " is odd.");
    }
    sc.close();
  }

}
