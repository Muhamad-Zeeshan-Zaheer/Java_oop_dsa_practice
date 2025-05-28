import java.util.Scanner;

public class swap_numbers_without_third_variable {
  public static void main(String[] args) {
    int number1, number2;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number 1");
    number1=s.nextInt();
    System.out.println("Enter the number 2");
    number2=s.nextInt();

    number1=number1+number2;
    number2=number1-number2;
    number1=number1-number2;

    System.out.println("the number 1 is "+number1);
    System.out.println("The number 2 is"+number2);
    s.close();

  }
}
/*
number 1=3
number 2=6
number1=number1+number2
9=3+6
number2=number1-number2
6=9-3
*/
