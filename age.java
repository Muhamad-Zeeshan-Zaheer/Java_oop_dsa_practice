import java.util.Scanner;

public class age {
  public static void main(String[] args) {
    int age;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the age: ");
    age = s.nextInt();
    s.close();

    if(age >= 18)
    {
      System.out.println("You can drive a car");
    }
    else
    {
      System.out.println("you cannot drive a car");
    }

  }

}
