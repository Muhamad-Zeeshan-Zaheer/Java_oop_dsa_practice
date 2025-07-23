import java.util.Scanner;

public class tabl {
  public static void main(String[] args) {
    int number, starting_point, ending_point ;
    Scanner s = new Scanner(System.in);

    System.out.print("Enter the number do you want to print table: ");
    number =s.nextInt();

    System.out.print("Enter the starting point of number: ");
    starting_point =s.nextInt();

    System.out.print("Enter the ending point of number: ");
    ending_point = s.nextInt();
    s.close();

    System.out.println("The table of entered number is ");
    for(int i = starting_point; i <= ending_point; i++){
      System.out.println(  number +" " + "x" + " " + i + " "+ "="+ " " + number*i);
    }
  }

}
