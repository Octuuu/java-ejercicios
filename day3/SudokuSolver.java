package day3;
public class SudokuSolver {
    private static final int N = 9;

    public static boolean esSeguro(int[][] tablero, int fila, int col, int num) {
        for (int x = 0; x < N; x++)
            if (tablero[fila][x] == num || tablero[x][col] == num) return false;

        int inicioFila = fila - fila % 3, inicioCol = col - col % 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (tablero[i + inicioFila][j + inicioCol] == num) return false;

        return true;
    }

    public static boolean resolverSudoku(int[][] tablero, int fila, int col) {
        if (fila == N - 1 && col == N) return true;
        if (col == N) { fila++; col = 0; }
        if (tablero[fila][col] != 0) return resolverSudoku(tablero, fila, col + 1);

        for (int num = 1; num <= 9; num++) {
            if (esSeguro(tablero, fila, col, num)) {
                tablero[fila][col] = num;
                if (resolverSudoku(tablero, fila, col + 1)) return true;
                tablero[fila][col] = 0;
            }
        }
        return false;
    }

    public static void imprimirTablero(int[][] tablero) {
        for (int[] fila : tablero) {
            for (int num : fila) System.out.print(num + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] tablero = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (resolverSudoku(tablero, 0, 0)) {
            imprimirTablero(tablero);
        } else {
            System.out.println("No tiene solución.");
        }
    }
}
