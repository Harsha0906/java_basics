
import java.util.Scanner;

public class loops10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        do {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        } while (num > 0);
        System.out.println("sum = " + sum);
    }
}
