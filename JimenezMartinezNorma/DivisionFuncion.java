import java.util.Scanner;

class DivisionFuncion {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        System.out.println("\n---------------DIVISION--------------- ");

        System.out.print("\nIngrese el primer número: ");
        double num1 = op.nextDouble();

        System.out.print("\nIngrese el segundo número: ");
        double num2 = op.nextDouble();

        double r = division(num1, num2);

        System.out.println("\n" + num1 + " / " + num2 + " = " + r + "\n");

    }

    public static double division(double a, double b) {

        return a / b;

    }

}