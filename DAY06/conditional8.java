
import java.util.*;

public class conditional8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bill = sc.nextDouble();
        double discount = 0;

        if (bill > 5000) {
            discount = bill * 0.2;
        } else if (bill > 3000) {
            discount = bill * 0.1;
        } else if (bill > 1000) {
            discount = bill * 0.05;
        }

        double finalBill = bill - discount;

        System.out.println("Original Bill: " + bill);
        System.out.println("Discount: " + discount);
        System.out.println("Final Bill: " + finalBill);

    }
}
