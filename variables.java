import java.util.Scanner;

public class variables {
  public static void main(String[] args) {
    System.out.println("hello_world with java");
    System.out.println("hello world with java programming");
    System.out.println("Welcome to the programming world");
    System.out.println();

    //using single line to use print an output
    System.out.print("The output using single print statement\nHello world with java\nHello world with java programming\nWelcome to the programming world");
    System.out.print("pattern using print statement\n*\n**\n***\n****\n");

    int a=4, b=4, c;
    double price = 23.34;
    String name= "Muhammad Zeeshan Zaheer", city;

    Scanner s = new Scanner(System.in);
    System.out.print("enter the value of a: ");
    c = s.nextInt();

    System.out.print("Enter the value of the city");
    city =s.next();
    System.out.println("the value of a is" +a);
    System.out.println("the value of b is " +b);
    System.out.println("the value of c is" +c);
    System.out.println("the value of price is" +price);
    System.out.println("the value of name is " +name);
    System.out.println("The city is " + city);

    s.close();

  }

}
