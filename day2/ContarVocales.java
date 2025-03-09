package day2;

import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine().toLowerCase();
        scanner.close();

        int contador = 0;
        for (char c : frase.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }

        System.out.println("Número de vocales en la frase: " + contador);
    }
}
