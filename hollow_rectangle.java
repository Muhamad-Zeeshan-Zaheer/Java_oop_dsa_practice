import java.util.Scanner;

public class hollow_rectangle {

  public static void main(String [] args)
  {
    int m,n;
    Scanner s= new Scanner(System.in);

    System.out.println("Enter the value of m: ");
    m = s.nextInt();

    System.out.println("Enter the value of n: ");
    n = s.nextInt();
    s.close();

    for(int i = 0; i< m; i++)
    {
      for(int j= 0;j< n; j++)
      {
        if(i == 0 || i == m - 1 || j == 0 || j == n - 1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.print("\n");
    }

  }
}
