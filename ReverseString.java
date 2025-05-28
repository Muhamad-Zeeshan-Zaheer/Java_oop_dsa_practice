import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {
    String s, reverse_string = "";
    char a;

    Scanner m = new Scanner(System.in);
    System.out.println("Enter the string you want to reverse:");
    s = m.nextLine();

    for (int i = 0; i < s.length(); i++) {
      a = s.charAt(i);
      reverse_string = a + reverse_string;
    }

    System.out.println("Reversed string is: " + reverse_string);
    m.close();
  }
  
}
