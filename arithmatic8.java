public class arithmatic8{
    public static void main(String[] args) {
        int num = 123;
        int a = num % 10;
        int b = (num / 10) % 10;
        int c = num / 100;
        int reverse = a * 100 + b * 10 + c;
        System.out.println("reverse = "+ reverse);

    }
}