import java.util.Scanner;

public class pattern1 {
  public static void main(String[] args) {
    int i,j;
    Scanner s = new Scanner(System.in);

    System.out.print("Enter the number of rows: ");
    i = s.nextInt();

    System.out.print("Enter the number of columns: ");
    j = s.nextInt();

    s.close();

    for( int k =0 ;k <= i; k++){
      for(int l = 0; l <= j; l++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}
