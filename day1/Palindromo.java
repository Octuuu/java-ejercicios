import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        sc.close();

        if (esPalindromo(palabra)) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String palabra) {
        palabra = palabra.toLowerCase().replaceAll("\\s+", "");
        String invertida = new StringBuilder(palabra).reverse().toString();
        return palabra.equals(invertida);
    }
}
