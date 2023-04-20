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
        leer.nextLine();
        do {
            System.out.println("Ingrese su sexo: ");
            System.out.println("H: Hombre");
            System.out.println("M: Mujer");
            System.out.println("O: Otro");
            x.setSexo(leer.nextLine());
        } while (!"h".equalsIgnoreCase(x.getSexo()) && !"m".equalsIgnoreCase(x.getSexo()) && !"o".equalsIgnoreCase(x.getSexo()));
        System.out.println("Ingrese su peso(KG): ");
        x.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura(Mts): ");
        x.setAltura(leer.nextDouble());
        leer.nextLine();
        return x;
    }

    public boolean esMayor(Persona x) {
        boolean mayor = false;
        if (x.getEdad() >= 18) {
            mayor = true;
        }
        return mayor;
    }

    public int calcularIMC(Persona x) {
        double pesoIdeal = (x.getPeso() / (x.getAltura() * x.getAltura()));
        int valid = 0;

        if (pesoIdeal < 20) {
            System.out.println(x.getNombre()+", usted esta por debajo del peso ideal.");
            valid = -1;
        } else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
            System.out.println(x.getNombre()+", usted esta en su peso ideal");
            valid = 0;
        } else if (pesoIdeal > 25) {
            System.out.println(x.getNombre()+", usted tiene sobrepeso.");
            valid = 1;
        }
        return valid;
    }

}
