// Cálculo de 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
import java.util.Scanner;
public class Ex3 {
    public static double somadiv(int a) {
        if (a == 1) {
            return 1.0;
        }
        else {
            return 1.0/a + somadiv(a - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int a = in.nextInt();
        double resultado = somadiv(a);
        System.out.printf("O resultado da soma é: %.6f. \n", resultado);
        in.close();
    }
}
