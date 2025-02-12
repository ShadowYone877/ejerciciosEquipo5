import java.util.Scanner;

class SumaFuncion {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        System.out.println("\n---------------SUMA--------------- ");

        System.out.print("\nIngrese el primer número: ");
        int num1 = op.nextInt();

        System.out.print("\nIngrese el segundo número: ");
        int num2 = op.nextInt();

        int r = suma(num1, num2);

        System.out.println("\n" + num1 + " + " + num2 + " = " + r + "\n");

    }

    public static int suma(int a, int b) {

        return a + b;

    }

}