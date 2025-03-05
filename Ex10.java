/* Defina uma sequência de Fibonacci generalizada, de f0 a f1 como sequência fibg(f0, f1, 0), fibg(f0, f1, 1), fibg(f0, f1, 2), ..., onde:
fibg(f0, f1, 0) = f0
fibg(f0, f1, 1) = f1
fibg(f0, f1, n) = fibg(f0, f1, n − 1) + fibg(f0, f1, n − 2), se n > 1. */

public class Ex10 {
    public static int fibg(int f0, int f1, int n) {
        if (n == 0) {
            return f0;
        } else if (n == 1) {
            return f1;
        } else {
            return fibg(f0, f1, n - 1) + fibg(f0, f1, n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibg(0, 1, 0));
        System.out.println(fibg(0, 1, 1));
        System.out.println(fibg(0, 1, 2));
        System.out.println(fibg(0, 1, 3));
        System.out.println(fibg(0, 1, 4));
        System.out.println(fibg(0, 1, 5));
    }
}
