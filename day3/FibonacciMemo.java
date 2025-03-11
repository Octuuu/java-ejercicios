package day3;
import java.util.HashMap;

public class FibonacciMemo {
    private static HashMap<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);

        long resultado = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, resultado); 
        return resultado;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("El " + n + "ésimo número de Fibonacci es: " + fibonacci(n));
    }
}
