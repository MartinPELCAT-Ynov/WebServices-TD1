package ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorial(8));
    }

    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
