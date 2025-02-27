// Soma de dois números naturais, através de incrementos sucessivos (Ex.: 3 + 2 = + + (+ + + 1)).
import java.util.Scanner;
public class Ex2 {
    public static int somar(int a, int b) {
        if (a ==0) {
            return b;
        }
        else {
            if (b == 0) {
                return a;
            }
            else {
                return 1 + somar(a, b - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = in.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = in.nextInt();
        System.out.println("O resultado da soma é: " + somar(a, b));
        in.close();
    }
}
