import java.util.Scanner;

public class factorial {
  public static int fac(int  a){

    int factorial=1;
    for(int i=a;i>=1;i--){
      factorial= factorial*i;
    }
    return factorial;


  }
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the number do you want to find factorial");
    int a= s.nextInt();

    System.out.println("The factorial of number is "+fac(a));


  }

}
