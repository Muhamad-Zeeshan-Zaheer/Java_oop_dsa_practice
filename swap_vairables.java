import java.util.Scanner;

public class swap_vairables {
  public static void main(String[] args) {
    int number1, number2, temp;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the first number");
    number1=s.nextInt();
    System.out.println("Enter the first number");
    number2=s.nextInt();
    s.close();

    temp=number1;
    number1=number2;
    number2=temp;

    System.out.println("the value after swaping is" +number1);
    System.out.println("The value after swapping is "+number2);
  }

}
