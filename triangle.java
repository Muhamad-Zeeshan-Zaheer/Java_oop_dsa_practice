import java.util.Scanner;

public class triangle {
  public static void main(String[] args) {
    int i;
    Scanner s =new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    i = s.nextInt();
    
    s.close();
    for(int m = 0; m<i; m++){
      for(int k= 0; k<=m; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
