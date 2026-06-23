
import java.util.*;

public class conditional4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("b is larger than a");
        } else if (a > b) {
            System.out.println("a is larger than b");
        } else {
            System.out.println("they are equal");
        }
    }
}
