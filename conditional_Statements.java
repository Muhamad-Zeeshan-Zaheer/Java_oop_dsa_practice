import java.util.Scanner;

public class conditional_Statements {
  public static void main(String[] args) {
    int age, choice, number ,a,b;
    Scanner s =new Scanner(System.in);
    System.out.println("Enter 1 for checking whether person is adult or not or 2 for even odd and 3 for number greater smaller ");
    choice =s.nextInt();
    if(choice == 1){
      System.out.println("Enter the age: ");
      age =s.nextInt();
      if(age > 18){
        System.out.print("adult");
      }
      else{
        System.out.println("not adult ");
      }
    }
    else if(choice ==2){
      System.out.println("Enter the number");
      number = s.nextInt();

      if(number % 2 == 0){
        System.out.println(number + " is even number" );
      }
      else{
        System.out.println(number + " is odd number");
      }

    }
    else if(choice == 3 ){
      System.out.print("Enter the value of a: ");
      a = s.nextInt();

      System.out.print("Enter the value of b: ");
      b = s.nextInt();

      if(a > b)
      {
        System.out.println(a+ " is greater");
      }
      else if (a < b){
        System.out.println(b + " is greater");
      }

      else{
        System.out.println("numbers are equal");
      }

    }
    s.close();
  }

}
