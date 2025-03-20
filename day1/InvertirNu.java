import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        scanner.close();

        int invertido = invertirNumero(numero);
        System.out.println("El número invertido es: " + invertido);
    }
    public static int invertirNumero(int num) {
        int invertido = 0;
        while (num > 0) {
            invertido = (invertido * 10) + (num % 10);
            num /= 10;
        }
        return invertido;
    }  
}