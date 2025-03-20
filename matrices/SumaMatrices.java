package matrices;

public class SumaMatrices {
    public static void main(String[] args) {
        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    
        int[][] matrizB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] resultado = new int[3][3];

        // sumar matrices 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // mostramos el resultado
        System.out.println("Matriz resultante ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}



/*Suma de dos matrices
Descripción: Se piden dos matrices de 3x3 y se suman elemento por elemento. */