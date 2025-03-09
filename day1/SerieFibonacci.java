import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de términos de la serie Fibonacci: ");
        int n = sc.nextInt();
        sc.close();
        
        int a = 0, b = 1, c;
        System.out.print("Serie Fibonacci: " + a + ", " + b);
        
        while(true) { 
            c = a + b;
            if (c > n ) break;
            System.out.print(", " + c);
            a = b;
            b = c;  
        }
    }
}
