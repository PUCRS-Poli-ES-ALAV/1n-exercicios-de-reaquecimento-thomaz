import java.util.Scanner;

// Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4)
public class Ex1 {
    // Função recursiva de multiplicação
    public static int multiplicar(int a, int b) {
        if (a == 0 || b == 0) { // Se a ou b for igual a 0, o resultado é 0 (n*0 = 0)
            return 0;
        } else {
            return a + multiplicar(a, b - 1); // Vai somando a com b, até que b seja igual a 0
        }
    }

    // Função principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = scanner.nextInt();
        System.out.println("O resultado da multiplicação é: " + multiplicar(a, b));
        scanner.close();
    }
}