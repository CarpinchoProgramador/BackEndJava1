package ejercicio3guia8practica;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona x = new Persona();

    public Persona crearPersona() {
        System.out.println("Ingrese su nombre: ");
        x.setNombre(leer.nextLine());
        System.out.println("Ingrese su edad: ");
        x.setEdad(leer.nextInt());
        while (x.getNombre().toLowerCase() != "h" || x.getNombre().toLowerCase() != "m" || x.getNombre().toLowerCase() != "o") {
            System.out.println("Ingrese su sexo: ");
            System.out.println("H: Hombre");
            System.out.println("M: Mujer");
            System.out.println("O: Otro");
            x.setSexo(leer.nextLine());
        }
        System.out.println("Ingrese su peso(KG): ");
        x.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura(Cms): ");
        x.setAltura(leer.nextDouble());
        return x;
    }

    public boolean esMayor(Persona x) {
        boolean mayor = false;
        if (x.getEdad() >= 18) {
            mayor = true;
        }
        return mayor;
    }
    
    public double calcularIMC(Persona x) {
        double pesoIdeal = (x.getPeso()/(x.getAltura()*x.getAltura()));
        int valid;
        
        
                
    }
    
}
