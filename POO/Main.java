package POO;

class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

class Estudiante extends Persona {
    double notaFinal;

    public Estudiante(String nombre, int edad, double notaFinal) {
        super(nombre, edad);
        this.notaFinal = notaFinal;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Nota Final: " + notaFinal);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Ana", 20, 8.5);
        estudiante1.mostrarInfo();
    }
}

/*Herencia (Clase Estudiante que hereda de Persona)
Descripción:
Crear una clase Estudiante que herede de Persona y tenga un atributo notaFinal. */