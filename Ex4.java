// Inversão de uma string
import java.util.Scanner;
public class Ex4 {
    public static String inverte(String s) {
        if (s.length() == 1) {
            return s;
        }
        else {
            return s.charAt(s.length() - 1) + inverte(s.substring(0, s.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String s = in.nextLine();
        String resultado = inverte(s);
        System.out.println("A string invertida é: " + resultado);
        in.close();
    }
}
