// Verifique se uma palavra é palíndromo (Ex. aba, abcba, xyzzyx).

import java.util.Scanner;

public class Ex8 {
    public static boolean palindromo(String palavra, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        } else {
            if (palavra.charAt(inicio) == palavra.charAt(fim)) {
                return palindromo(palavra, inicio + 1, fim - 1);
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma palavra para verificar se é palíndromo");
        String palavra = in.nextLine();
        if (palindromo(palavra, 0, palavra.length() - 1)) {
            System.out.println("A palavra " + palavra + " é palíndromo");
        } else {
            System.out.println("A palavra " + palavra + " não é palíndromo");
        }
        in.close();
    }
}
