public class Ex3 {
    public static int somaedivide(int a) {
        if (a == 0) {
            return 0;
        }
        else {
            return 1 + somaedivide(1/a);
            
        }
    }
}
