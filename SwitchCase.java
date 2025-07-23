import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
    String button;
    Scanner s = new Scanner(System.in);

    System.out.print("Press the button: ");
    button = s.nextLine();

    switch (button) {
      case "green":
        System.out.println("Slam");
        break;

      case "red":
        System.out.println("hello");
        break;

      case "yellow":
        System.out.println("helloworld");
        break;

      default:
        System.out.println("you pressed wrong");
        break;
    }

    s.close(); // Optional: close the scanner to avoid resource leak
  }
}
