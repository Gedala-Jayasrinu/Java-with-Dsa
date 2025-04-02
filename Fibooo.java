

public class Fibooo {
    public static void main(String[] args) {
        long n = 50, f = 0, s = 1;
        System.out.println("Fibbonacci Num:");
        System.out.println(f);
        System.out.println(s);

        for (int i = 2; i <= n; i++) {
            long t = f + s;
            System.out.println(t);
            f = s;
            s = t;
        }
    }
}
