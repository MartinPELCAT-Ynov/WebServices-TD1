package ex2;

public class App {
    public static void main(String[] args) {
        System.out.println(isPair(447));
        System.out.println(isPair(876));
        System.out.println(isImpaire(234));
        System.out.println(isImpaire(3));
    }


    public static boolean isPair(long n) {
        return n % 2 == 0;
    }

    public static boolean isImpaire(long n) {
        return !isPair(n);
    }
}
