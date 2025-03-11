package day3;

public class Amstrong {
    public static boolean esAmstrong(int numero){
        int suma = 0, temp = numero;
        int digitos = String.valueOf(numero).length();

        while (temp > 0){
            int digito = temp % 10;
            suma += Math.pow(digito, digitos);
            temp /= 10;
        }
        return numero == suma; 
    }

    public static void main(String[] args) {
        int numero = 153;
        System.out.println(esAmstrong(numero)? numero + " es un número amstrong" : numero + " no es un número amstrong");
    }
}
