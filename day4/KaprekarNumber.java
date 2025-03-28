package day4;

public class KaprekarNumber {
    public static boolean esKaprekar(int n) {
        int cuadrado = n * n;
        String strCuadrado = String.valueOf(cuadrado);
        int len = strCuadrado.length();

        for (int i = 1; i < len; i++) {
            int izquierda = Integer.parseInt(strCuadrado.substring(0, i));
            int derecha = Integer.parseInt(strCuadrado.substring(i));

            if (izquierda + derecha == n) {
                return true;
            }
        }
        return n == 1;
    }


    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (esKaprekar(i)) {
                System.out.println(i);
            }
        }
    }
}

/*
Número Kaprekar
Un número Kaprekar es un número cuyo cuadrado, al ser dividido en dos partes, suma el mismo número.

*/