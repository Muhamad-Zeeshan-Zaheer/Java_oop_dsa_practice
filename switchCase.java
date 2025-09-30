import java.util.*;

public class switchCase {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);

        System.out.println("Press the button: 1 to print slam, 2 to print bonjour, 3 to print hello");
        a = s.nextInt();

        switch (a) {
            case 1:
                System.out.println("slam");
                break;
            case 2:
                System.out.println("bonjour");
                break;
            case 3:
                System.out.println("hello");
                break;
            default:
                System.out.println("invalid button pressed");
                break;
        }

        s.close();
    }
}
