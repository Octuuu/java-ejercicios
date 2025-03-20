package POO;

class Circulo {
    private double radio;

    // constructor 
    public Circulo(double radio) {
        this.radio = radio;
    }

    // metodo para calcular el area
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    // metodo para calcular el perimetro
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

public class Circulo1 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(5);
        System.out.println("Área: " + c1.calcularArea());
        System.out.println("Perímetro: " + c1.calcularPerimetro());
    }
}



/*Clase Círculo con métodos
Descripción:
Crear una clase Circulo con radio y métodos para calcular el área y el perímetro. */