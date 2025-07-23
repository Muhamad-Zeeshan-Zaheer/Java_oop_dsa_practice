import java.util.Scanner;

public class sum_loop {
  public static void main(String[] args) {
    int n,  sum = 0;


    Scanner s =new Scanner(System.in);
    System.out.println("Enter the number till you want to add the numbers");
    n = s.nextInt();
    s.close();

    for(int i=0;i<=n;i++){
      sum = sum + i;
      System.out.println(i);
    }
    System.out.println("The final result is: " + sum );
  }
}
