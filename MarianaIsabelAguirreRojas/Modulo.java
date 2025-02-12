import java.util.Scanner;

class ModuloF {

    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero = opc.nextInt();
        System.out.println("Ingresa el valor del módulo");
        int valorModulo = opc.nextInt();
        System.out.println("El módulo es: " + modulo(numero, valorModulo));
    }

    public static int modulo(int numero, int valorModulo) {
        return numero % valorModulo;
    }
}