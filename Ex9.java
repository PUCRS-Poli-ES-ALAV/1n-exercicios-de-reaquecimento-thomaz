/* Dado um número n, gere todas as possíveis combinações com as n primeiras letras do alfabeto. Ex.: n = 3. Resposta: 
ABC, ACB, BAC, BCA, CAB, CBA. */

import java.util.Scanner;

public class Ex9 {
    public static void combina(int n, String prefixo) {
        if (n == 0) {
            System.out.println(prefixo);
        } else {
            for (char i = 'A'; i < 'A' + n; i++) {
                combina(n - 1, prefixo + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número para gerar todas as possíveis combinações com as n primeiras letras do alfabeto");
        int n = in.nextInt();
        combina(n, "");
        in.close();
    }
}
