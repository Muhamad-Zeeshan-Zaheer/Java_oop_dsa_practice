import java.util.Scanner;

public class input {
  public static void main(String[] args)
  {
    int age;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the age");
    age=sc.nextInt();
    char u;
    System.out.println("Enter the character ");
    u=sc.next().charAt(0);

    System.out.println("Age is" +age);
    System.out.println("character is  " +u);
    sc.close();
  }


}
