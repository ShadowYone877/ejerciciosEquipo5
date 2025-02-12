
import java.util.Scanner;

class DivisionF {

    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        double numero1 = opc.nextDouble();
        System.out.println("Ingresa otro número");
        double numero2 = opc.nextDouble();
        System.out.println("La división de los números es: " + dividir(numero1, numero2));
    }

    public static double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }
}
