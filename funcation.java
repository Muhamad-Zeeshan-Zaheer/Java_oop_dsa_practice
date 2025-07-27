import java.util.Scanner;

public class funcation {
  public static void printname(String name){

    System.out.println("The name is "+name);

  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String name = s.next();
    s.close();
    printname(name);

  }

}
