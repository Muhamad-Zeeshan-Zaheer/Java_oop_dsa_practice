import java.util.Scanner;
public class conditional_Statements {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter 1 to check even odd");

    int check,b,age;
    check = s.nextInt();

    if(check == 1)
    {
      System.out.println("Enter the number to check even or odd and 2 to check whether you are eligible to drive");
      b = s.nextInt();
      if(b % 2 == 0){
        System.out.println(b + " is even number");
      }
      else{
        System.out.println(b + " is odd number");
      }
      s.close();
    }
    else if(check == 2){
      System.out.println("Enter the age ");
      age = s.nextInt();

      if(age >= 18){
        System.out.println("you are eligible to drive");
      }
      else{
        System.out.println("you are not eligible to drive");
      }
    }

  }

}
