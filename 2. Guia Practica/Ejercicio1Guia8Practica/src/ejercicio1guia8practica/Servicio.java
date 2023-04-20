package ejercicio1guia8practica;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CuentaBancaria cuenta1 = new CuentaBancaria();

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese numero de cuenta: ");
        cuenta1.setNumeroCuenta(leer.nextInt());
        System.out.println("-------------------------");
        System.out.println("Ingrese su DNI: ");
        cuenta1.setDniCliente(leer.nextLong());
        System.out.println("-------------------------");
        cuenta1.setSaldoActual(0);
        System.out.println("Su saldo es: $" + cuenta1.getSaldoActual());
        System.out.println("-------------------------");
        return cuenta1;
    }

    public double ingresarDinero(CuentaBancaria cuenta1) {
        double saldo = 0;
        System.out.print("Ingrese el saldo a ingresar: $");
        saldo = leer.nextDouble();
        if (saldo < 0) {
            System.out.println("No se puede realizar esta operacion.");
        } else if (saldo >= 0) {
            System.out.println("-------------------------");
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() + saldo);
            System.out.println("Su saldo actual es de: $" + cuenta1.getSaldoActual());
            System.out.println("-------------------------");
        }
        return cuenta1.getSaldoActual();
    }

    public double retirarDinero(CuentaBancaria cuenta1) {
        double saldo = 0;
        System.out.println("Su saldo es de: $" + cuenta1.getSaldoActual());
        System.out.print("Ingrese el saldo a retirar: $");
        saldo = leer.nextDouble();
        System.out.println("-------------------------");
        if (saldo > cuenta1.getSaldoActual()) {
            System.out.println("No puede retirar esta cantidad de dinero porque es mayor a la cantidad de dinero que posee en la cuenta...");
            System.out.println("Se retirará el total de: $" + cuenta1.getSaldoActual());
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - cuenta1.getSaldoActual());
            System.out.println("Ahora su saldo es de: $0");
            System.out.println("-------------------------");
        } else if (saldo < cuenta1.getSaldoActual() && saldo >= 0) {
            System.out.println("Se retiró correctamente la cantidad ingresada: $" + saldo);
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - saldo);
            System.out.println("Su saldo actual es de: " + cuenta1.getSaldoActual());
            System.out.println("-------------------------");
        } else {
            System.out.println("Operacion invalida");
            System.out.println("-------------------------");
        }
        return cuenta1.getSaldoActual();
    }

    public double extraccionRapida(CuentaBancaria cuenta1) {
        int eleccion;
        double saldito = cuenta1.getSaldoActual() * 0.20;
        double extraccion = 0;
        System.out.println("Usted seleccionó extraccion rapida del %20: ");
        System.out.println("Usted puede retirar un maximo de: $" + saldito);
        System.out.println("-------------------------");
        System.out.println("¿Desea continuar?");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.println("-------------------------");
        eleccion = leer.nextInt();

        switch (eleccion) {
            case 1:
                System.out.print("Ingrese la cantidad a retirar: $");
                extraccion = leer.nextDouble();
                if (extraccion >= saldito) {
                    System.out.println("------------------");
                    System.out.println("Se retiraron exitosamente: $" + cuenta1.getSaldoActual() * 0.20);
                    cuenta1.setSaldoActual(extraccion);
                    System.out.println("Su saldo actual ahora es de: $" + cuenta1.getSaldoActual());
                    System.out.println("-------------------------");
                } else {
                    System.out.println("No puede retirar esa cantidad de dinero.");
                    System.out.println("-------------------------");
                }
                break;
            case 2:
                System.out.println("Gracias por usar nuestros servicios");
                System.out.println("-------------------------");
                break;
            default:
                System.out.println("Operacion invalida");
                System.out.println("-------------------------");
                break;
        }
        return cuenta1.getSaldoActual();
    }

    public void consultarSaldo(CuentaBancaria cuenta1) {
        System.out.println("Su saldo actual es de: $" + cuenta1.getSaldoActual());
        System.out.println("-------------------------");
    }

    public void consultarDatos(CuentaBancaria cuenta1) {
        System.out.println("Sus datos son.");
        System.out.println("DNI: " + cuenta1.getDniCliente());
        System.out.println("Nro. Cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Saldo: $" + cuenta1.getSaldoActual());
        System.out.println("-------------------------");
    }
    
}
