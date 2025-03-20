package matrices;
import java.util.Scanner;

public class BuscarNumeroMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
            {10, 15, 20},
            {25, 30, 35},
            {40, 45, 50}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número a buscar: ");
        int num = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == num) {
                    System.out.println("Número encontrado en la posición: [" + i + "][" + j + "]");
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) break;
        }

        if (!encontrado) {
            System.out.println("Número no encontrado en la matriz.");
        }

        scanner.close();
    }
}



/*Buscar un número en una matriz
Descripción: Se busca un número dentro de una matriz e indicar su posición si existe. */