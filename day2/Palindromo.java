package day2;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();
        scanner.close();

        String invertida = new StringBuilder(palabra).reverse().toString();

        if (palabra.equals(invertida)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }
}
