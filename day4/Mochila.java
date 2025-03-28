package day4;

public class Mochila {
    public static int knapsack(int[] pesos, int[] valores, int capacidad) {
        int n = valores.length;
        int[][] dp = new int[n + 1][capacidad + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacidad; w++) {
                if (pesos[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], valores[i - 1] + dp[i - 1][w - pesos[i - 1]]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][capacidad];
    }

    public static void main(String[] args) {
        int[] valores = {60, 100, 120};
        int[] pesos = {10, 20, 30};
        int capacidad = 50;

        System.out.println("Valor máximo en la mochila: " + knapsack(pesos, valores, capacidad));
    }
}



/*Problema de la Mochila (Knapsack Problem - Programación Dinámica)
Dado un conjunto de objetos con pesos y valores, encontrar la mejor combinación para maximizar el valor sin superar un peso máximo. */