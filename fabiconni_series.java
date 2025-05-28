import java.util.Scanner;

public class fabiconni_series {
  public static void main(String[] args) {
    int n, first_number, second_number,next_number;

    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number till you want to print series");
    n=s.nextInt();
    System.out.println("Enter the first number fro which you want to start the series");
    first_number=s.nextInt();
    System.out.println("Enter the Second number next to it");
    second_number=s.nextInt();
    for(int i=0; i<=n; i++){
      System.out.print(first_number+ ",");
      next_number=first_number+second_number; //1+2 next_number=3
      first_number=second_number;
      second_number=next_number;
      s.close();;
    }

  }
}
