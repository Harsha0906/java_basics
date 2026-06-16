public class arithmatic14 {
    public static void main(String[] args) {
        int num = 450;
        int a = num % 10;
        int b = (num / 10) % 10;
        int c = num / 100;
        int sum = a + b + c;
        System.out.println("Sum of digits: " + sum);
    }
}