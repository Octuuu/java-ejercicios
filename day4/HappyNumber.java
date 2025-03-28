package day4;
import java.util.HashSet;

public class HappyNumber {
    public static boolean esFeliz(int n) {
        HashSet<Integer> visitados = new HashSet<>();
        
        while (n != 1 && !visitados.contains(n)) {
            visitados.add(n);
            n = sumaCuadrados(n);
        }
        return n == 1;
    }

    private static int sumaCuadrados(int n) {
        int suma = 0;
        while (n > 0) {
            int digito = n % 10;
            suma += digito * digito;
            n /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        int num = 19;
        System.out.println(num + " es feliz? " + esFeliz(num));
    }
}

/*
Un número es feliz si sumamos los cuadrados de sus dígitos repetidamente hasta llegar a 1. Si entra en un ciclo infinito, no es feliz.
*/