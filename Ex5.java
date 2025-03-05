// Gerador da sequência dada por:
// F(1) = 1
// F(2) = 2
// F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2).

import java.util.Scanner;

public class Ex5 {
    public static int gerar(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            if (n == 2) {
                return 2;
            }
            else {
                return 2 * gerar(n - 1) + 3 * gerar(n - 2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número do termo da sequência que deseja saber: ");
        int n = in.nextInt();
        System.out.println("O " + n + "º termo da sequência é: " + gerar(n));
        in.close();
    }
}
