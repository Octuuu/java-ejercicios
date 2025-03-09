package day2;

import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        scanner.close();

        String invertida = new StringBuilder(palabra).reverse().toString();
        System.out.println("Palabra invertida: " + invertida);
    }
}
