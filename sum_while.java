import java.util.Scanner;

public class sum_while {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int i = 0, sum = 0,n;

    System.out.println("Enter the number");
    n = s.nextInt();
    s.close();

    while(i < n)
    {
      sum = sum+ i;
      sum++;
      i++;
    }
    System.out.println(sum);
  }
}
