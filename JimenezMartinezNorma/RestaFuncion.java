import java.util.Scanner;

class RestaFuncion {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        System.out.println("\n---------------RESTA--------------- ");

        System.out.print("\nIngrese el primer número: ");
        int num1 = op.nextInt();

        System.out.print("\nIngrese el segundo número: ");
        int num2 = op.nextInt();

        int r = resta(num1, num2);

        System.out.println("\n" + num1 + " - " + num2 + " = " + r + "\n");

    }

    public static int resta(int a, int b) {

        return a - b;

    }

}