package POO;

abstract class Figura {
    public abstract double calcularArea();
}

class Rectangulo extends Figura {
    private double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(4, 5);
        Figura circulo = new Circulo(3);

        System.out.println("Área del Rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del Círculo: " + circulo.calcularArea());
    }
}



/*Polimorfismo (Figura, Rectángulo y Círculo)
Descripción:
Crear una clase Figura con un método calcularArea() y dos clases Rectangulo y Circulo que lo sobrescriban. */