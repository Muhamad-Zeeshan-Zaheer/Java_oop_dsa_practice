import java.util.Scanner;

public class swap {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int a,b;

    System.out.println("Enter the vlaue of a :");
    a =s.nextInt();

    System.out.println("Enter the value of b:");
    b= s.nextInt();
    s.close();

    System.out.println("the value of a is before swaping  " + a);
    System.out.println("the value of a is before swaping  " +b);

    a =a+b;   //1+2=3
    b =a-b;   //3-2=1
    a =a-b;   // 3-1=2
    System.out.println("------------------------------------------------------------------------------\n----------------------------------------------");
    System.out.println("The value of a after swapping     " +a);
    System.out.println("The value of b after swapping     " +b);
  }

}
