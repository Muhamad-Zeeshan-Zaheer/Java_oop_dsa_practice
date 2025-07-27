import java.util.Scanner;

public class countsum {
  public static int sum(int  n){
    int sum = 0, count = 0;
    for(int i= 0; i<=n; i++){
      if(i%2!=0){
        sum = sum+i;
        count++;

      }
    }
    System.out.println();
    System.out.println("Total odd numbers: " + count);
    System.out.print("The sum of odd numbers is:" );
    return sum;

  }
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.print("Enter the number till you want to cunt sum ");
    int n= s.nextInt();
    s.close();
    System.out.println(sum(n));
  }

}
