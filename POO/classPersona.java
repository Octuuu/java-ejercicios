package POO;

class Persona {
    String nombre;
    int edad;

    // constructor 
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // metodo para mostrar informacion
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class classPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Octa", 20);
        persona1.mostrarInfo();
    }
}

/*Crear una clase Persona
Descripción:
Crear una clase Persona con atributos nombre y edad, y un método que muestre su información. */