import java.util.Scanner;

public class number_equal {
  public static void main(String[] args) {
    double a,b;
    Scanner s = new Scanner(System.in);

    System.out.print("Enter the value of a:");
    a = s.nextInt();

    System.out.print("Enter the value of b:");
    b = s.nextInt();

    s.close();

    if(a == b ){
      System.out.print("numbers are equal");
    }

    else if(a > b){
      System.out.print("a is greater");
    }

    else{
      System.out.print("a is lesser");
    }

  }
}
