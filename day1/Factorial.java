import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("El factorial de " + num + " es: " + calcularFactorial(num));
    }

    public static long calcularFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * calcularFactorial(num - 1);
    }
}
