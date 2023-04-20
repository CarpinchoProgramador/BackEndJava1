package ejercicio2guia8practica;

import java.util.Scanner;
//Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
//
//Método servirTaza(int): se pide el tamaño de una taza vacía, 
//el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
//Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
//El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
//
//Método vaciarCafetera(): pone la cantidad de café actual en cero. 
//
//Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a 
//la cafetera la cantidad de café indicada.

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cafetera caf = new Cafetera();
    int tamTaza;

    public Cafetera llenarCafetera() {
        caf.setCapacidadMaxima(10);
        caf.setCantidadActual(caf.getCapacidadMaxima());
        return caf;
    }

    public int servirTaza(Cafetera caf) {
        System.out.println("Ingrese el tamaño de la taza(Coloque 1 / 2 / 3): ");
        tamTaza = leer.nextInt();
        if (tamTaza > caf.getCantidadActual()) {
            System.out.println("La taza se servira con el restante que queda en la cafetera: " + caf.getCantidadActual());
            caf.setCantidadActual(0);
            System.out.println("La cantidad de cafe restante es de: " + caf.getCantidadActual());
        } else if (tamTaza <= caf.getCantidadActual() && tamTaza == 1 || tamTaza == 2 || tamTaza == 3) {
            System.out.println("Se servirá su café en taza tamaño: " + tamTaza);
            caf.setCantidadActual(caf.getCantidadActual() - tamTaza);
            System.out.println("La cantidad de cafe restante es de: " + caf.getCantidadActual());
        } else {
            System.out.println("rompiste el codigo, como todo en tu vida. Felicdades.");
        }
        return tamTaza;
    }
    
    public void vaciarCafetera() {
        System.out.println("Se vació la cafetera.");
        caf.setCantidadActual(0);
    }
    
    public int agregarCafe(Cafetera caf) {
        System.out.println("Ingrese la cantidad de café a agregar");
        int cafeAgr = leer.nextInt();
        if (cafeAgr < 0) {
            System.out.println("No se puede quitar café");
        } else if (cafeAgr >= 0 && cafeAgr <= caf.getCapacidadMaxima() && (caf.getCantidadActual() + cafeAgr) <= caf.getCapacidadMaxima() ) {
            System.out.println("Agregando: " + cafeAgr + " de cafe");
            caf.setCantidadActual(tamTaza);
            System.out.println("La cantidad de cafe restante es de: " + caf.getCantidadActual());
        } else {
            System.out.println("rompiste todo de nuevo, espero que estes orgulloso");
        }
        return cafeAgr;
    }
}
