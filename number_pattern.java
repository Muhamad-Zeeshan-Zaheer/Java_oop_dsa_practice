import java.util.Scanner;

public class number_pattern {
  public static void main(String[] args){
    int n;
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    n=s.nextInt();
    for(int i =0; i<=n; i++)
    {
      for(int j = 0; j<n-i+1;j++ )
      {
        System.out.print(j);
      }
      System.out.println();
    }

  }

}
