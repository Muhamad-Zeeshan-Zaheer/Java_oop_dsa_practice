import java.util.Scanner;

public class functions {
  public static void PrintMyName(String name) {
    System.out.println("the name is " + name);
    return;
  }

  public static int add(int a, int b) {
    return a+b;
  }
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = s.nextLine();
    PrintMyName(name);

    System.out.println("enter the number 1");
    int a = s.nextInt();
    System.out.println("enter the number 2");
    int b = s.nextInt();
    s.close();

    System.out.println("the value of sum is ");
    int c;
    c = add(a ,b);
    System.out.println("The sum is " + c);
  }

}
