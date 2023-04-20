package ejercicio2guia8practica;

import java.util.Scanner;

public class Ejercicio2Guia8Practica {

public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cafetera nespresso = new Cafetera();
    CafeteraServicio sc = new CafeteraServicio();
    
    nespresso = sc.llenarCafetera();
    sc.servirTaza(nespresso);
    sc.vaciarCafetera();
    sc.agregarCafe(nespresso);
    }
}
