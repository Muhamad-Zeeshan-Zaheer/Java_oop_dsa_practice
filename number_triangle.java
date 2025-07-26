import java.util.Scanner;

public class number_triangle {
  public static void main(String[] args) {
    int i,j;
    Scanner s =new Scanner(System.in);

    System.out.println("Enter the number of rows: ");
    i=s.nextInt();

    System.out.println("Enter the number of columns: ");
    j= s.nextInt();


    for(int k=1;k <=i; k++){
      for(int l=0; l<k; l++ )
      {
        System.out.print(l);
      }
      System.out.println("\n");
    }
  }
}
