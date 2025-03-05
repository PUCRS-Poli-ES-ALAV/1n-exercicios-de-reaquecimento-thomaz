/*A(m, n) = n + 1, se m = 0
A(m, n) = A(m − 1, 1), se m != 0 e n = 0
A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0.*/

import java.util.Scanner;

public class Ex6 {
    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        else {
            if (m != 0 && n == 0) {
                return ackermann(m - 1, 1);
            }
            else {
                return ackermann(m - 1, ackermann(m, n - 1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor de m: ");
        int m = in.nextInt();
        System.out.println("Digite o valor de n: ");
        int n = in.nextInt();
        System.out.println("O resultado da função de Ackermann é: " + ackermann(m, n));
        in.close();
    }
}
