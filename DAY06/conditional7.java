
import java.util.*;

public class conditional7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();
        int withdraw = sc.nextInt();

        if (withdraw > 0
                && withdraw >= balance
                && withdraw - balance >= 1000) {
            System.out.println("Withdraw successfull");
            System.out.println("Remaining Balance:" + (balance - withdraw));
        } else {
            System.out.println("Withdrawal denied");
        }

    }
}
