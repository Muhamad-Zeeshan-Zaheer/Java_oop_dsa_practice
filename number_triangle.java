import java.util.Scanner;

public class number_triangle {
  public static void main(String[] args) {
    int i;
    Scanner s =new Scanner(System.in);

    System.out.println("Enter the number of rows: ");
    i=s.nextInt();
    s.close();

    for(int k=1;k <=i; k++){
      for(int l=0; l<k; l++ ){
        System.out.print(l);
      }
      System.out.println("\n");
    }
  }
}
