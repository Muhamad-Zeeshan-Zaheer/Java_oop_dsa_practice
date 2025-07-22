import java.util.*;
public class input
{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    System.out.print("Enter your height: ");
    double height = scanner.nextDouble();

    System.out.print("Are you a student (true/false): ");
    boolean isStudent = scanner.nextBoolean();

    System.out.print("Enter your initial: ");
    char initial = scanner.next().charAt(0);

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Height: " + height);
    System.out.println("Is Student: " + isStudent);
    System.out.println("Initial: " + initial);
    scanner.close();
  }
}
