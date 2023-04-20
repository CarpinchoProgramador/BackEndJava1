package ejercicio1guia8practica;

public class Ejercicio1Guia8Practica {

    public static void main(String[] args) {
        System.out.println("Bienvenido");
        System.out.println("-------------------------");
        CuentaBancaria user17 = new CuentaBancaria();
        Servicio sc = new Servicio();

        user17 = sc.crearCuenta();
        sc.ingresarDinero(user17);
        sc.extraccionRapida(user17);
        sc.consultarSaldo(user17);
        sc.consultarDatos(user17);
    }
}
