import java.util.Scanner;

public class Ex7 {
    public static int somavet(int[] vet, int indice) {
        // Caso base da recursão
        if (indice == vet.length) {
            return 0; 
        } else {
            return vet[indice] + somavet(vet, indice + 1);
        }
    }

    public static int prodvet(int[] vet, int indice) {
        // Caso base da recursão
        if (indice == vet.length) {
            return 1; 
        } else {
            return vet[indice] * prodvet(vet, indice + 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um tamanho para o vetor");
        int tamanho = in.nextInt();
        int[] vetor = new int[tamanho];
        for(int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o %d° item do vetor: \n", i + 1);
            vetor[i] = in.nextInt();
        }
        int soma = somavet(vetor,0);
        System.out.println("Soma dos elementos do vetor: " + soma);
        in.close();
        int prod = prodvet(vetor,1);
        System.out.println("Prod dos elementos do vetor: " + prod);
        in.close();
    }
}
