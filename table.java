import java.util.Scanner;

public class table {
  public static void main(String[] args) {
    Scanner s = new  Scanner(System.in);
    int n, starting_point, ending_point;

    System.out.println("Enter the number to print its table");
    n = s.nextInt();

    System.out.println("Enter the starting point");
    starting_point = s.nextInt();

    System.out.println("Enter the ending point");
    ending_point = s.nextInt();
    s.close();

    for(int i = starting_point; i<=ending_point; i++){
      System.out.println(n + " x " + i + " = " + (n * i));
    }
  }

}
