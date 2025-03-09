import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        sc.close();

        if (esPrimo(num)) {
            System.out.println(num + " es un numero primo ");
        } else {
            System.out.println(num + " no es un numero primo ");      
        }
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}  