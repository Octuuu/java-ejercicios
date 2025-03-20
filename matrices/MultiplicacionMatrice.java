package matrices;

public class MultiplicacionMatrice {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };

        int[][] B = {
            {5, 6},
            {7, 8}
        };

        int[][] c = new int[2][2];

        // multiplication
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    c[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // mostrar la matriz resultante

        System.out.println("La matriz resultante es: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*Multiplicación de dos matrices
Descripción: Multiplicar dos matrices de 2x2. */