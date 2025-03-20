package POO;

class Coche {
    private String marca;
    private int velocidad;

    public Coche(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }
 
    public String getMarca() {
        return marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidad += incremento;
        }
    }

    public void frenar(int decremento) {
        if (decremento < 0 && velocidad - decremento >= 0) {
            velocidad -= decremento;
        }
    }
}

public class Encapsulamiento {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Toyota");
        miCoche.acelerar(50);
        System.out.println("Marca: " + miCoche.getMarca() + ", Velocidad: " + miCoche.getVelocidad() + " km/h");
        miCoche.frenar(20);
        System.out.println("Velocidad después de frenar: " + miCoche.getVelocidad() + " km/h");
    }
}

/*Clase Coche con Encapsulamiento
Descripción:
Crear una clase Coche con atributos privados y métodos getters y setters. */