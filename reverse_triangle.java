import java.util.Scanner;

public class reverse_triangle {

  public static void main(String[] args) {
    int i;
    Scanner s = new Scanner(System.in);

    System.out.print("Enter the number of rows:");
    i=s.nextInt();
    s.close();

    for(int m=i; m >= 0; m--){
      for(int n=1; n <=m; n++)
      {
        System.out.print("*");
      }
      System.out.println();
    }

  }

}
/*
let user enter the m=5 n =4
loop starts
m= 5 n4

 */
