import java.util.Scanner;

public class FlapTriangle {
  public static void main(String[] args) {
    int rows;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    rows = s.nextInt();

    for (int i = 1; i <= rows; i++) {
      // Print spaces
      for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
      }

      // Print stars
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }

      // Move to the next line
      System.out.println();
    }

    s.close();
  }
}

