public class arithmatic9 {
    public static void main(String[] args) {
        int seconds = 3672;

        int hours = seconds / 3600;

        int remaining = seconds % 3600;

        int minutes = remaining / 60;

        int sec = remaining % 60;

        System.out.println(hours + ":" + minutes + ":" + sec);
    }
}
    