package ex2;

public class App {
    public static void main(String[] args) {
        System.out.println(isEvent(447));
        System.out.println(isEvent(876));
        System.out.println(isOdd(234));
        System.out.println(isOdd(3));
    }


    public static boolean isEvent(long n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(long n) {
        return !isEvent(n);
    }
}
