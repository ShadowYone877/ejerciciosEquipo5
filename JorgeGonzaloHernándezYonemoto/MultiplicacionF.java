
import java.util.Scanner;

class MultiplicacionF {

    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero1 = opc.nextInt();
        System.out.println("Ingresa otro número");
        int numero2 = opc.nextInt();
        System.out.println("La multiplicación de los números es: " + multiplicar(numero1, numero2));
    }

    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }
}
