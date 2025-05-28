import java.util.Scanner;

public class prime_number {
  public static void main(String[] args) {
    int number, count=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number to check whether at");
    number=s.nextInt();

    for(int i=1;i<=number;i++){
      if(number%i==0){
        count++;

      }
    }
    if(count==2){
      System.out.println("number is prime number");

    }
    else{
      System.out.println("number is not prime number");
    }
    s.close();


  }

}
