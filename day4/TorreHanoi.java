package day4;

public class TorreHanoi {
    public static void hanoi(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }
        hanoi(n - 1, origen, destino, auxiliar);
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        hanoi(n - 1, auxiliar, origen, destino);
    }

    public static void main(String[] args) {
        int discos = 3;
        hanoi(discos, 'A', 'B', 'C');
    }
}

/*Torre de Hanoi
Clásico problema de recursión con discos y tres torres. */