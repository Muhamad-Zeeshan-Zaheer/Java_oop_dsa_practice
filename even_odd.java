import java.util.Scanner;

public class even_odd {
  public static void main(String[] args) {
    double number;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number: ");
    number = s.nextDouble();
    s.close();

    if(number%2 == 0){
      System.out.println("Number is even number");
    }
    else {
      System.out.println("number is odd number");
    }
  }

}
