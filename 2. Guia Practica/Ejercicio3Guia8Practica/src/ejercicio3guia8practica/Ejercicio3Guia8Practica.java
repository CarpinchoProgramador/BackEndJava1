package ejercicio3guia8practica;

//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos 
//todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, 
//tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas 
//variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, 
//cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y 
//cuantos menores. Para esto, podemos crear unos métodos adicionales.
public class Ejercicio3Guia8Practica {

    public static void main(String[] args) {
        int[] imc = new int[4];
        boolean[] edad = new boolean[4];
        int cont1 = 0, cont2 = 0, cont3 = 0, contMayor = 0, contMenor = 0;
        

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        Servicio sc = new Servicio();

        p1 = sc.crearPersona();
        edad[0] = sc.esMayor(p1);
        imc[0] = sc.calcularIMC(p1);

        p2 = sc.crearPersona();
        edad[1] = sc.esMayor(p2);
        imc[1] = sc.calcularIMC(p2);

        p3 = sc.crearPersona();
        edad[2] = sc.esMayor(p3);
        imc[2] = sc.calcularIMC(p3);

        p4 = sc.crearPersona();
        edad[3] = sc.esMayor(p4);
        imc[3] = sc.calcularIMC(p4);
        
        for (int i = 0; i < imc.length; i++) {
            switch (imc[i]) {
                case -1:
                    cont1++;
                    break;
                case 0:
                    cont2++;
                    break;
                case 1:
                    cont3++;
                    break;
                default:
                    break;
            }
        }
        
        double porcentajePesoPorDebajo = ( cont1 * 100 ) / 4;
        double porcentajePesoIdeal = ( cont2 * 100 ) / 4;
        double porcentajePesoPorArriba = ( cont3 * 100 ) / 4;
        
        System.out.println("Porcentaje peso por debajo: %" + porcentajePesoPorDebajo);
        System.out.println("Porcentaje peso ideal: %" + porcentajePesoIdeal);
        System.out.println("Porcentaje sobrepeso: %"+ porcentajePesoPorArriba);
        
        for (int i = 0; i < edad.length; i++) {
            if (edad[i]) {
                contMayor++;
            } else{
                contMenor++;
            }
        }
        double porcentajeMayor = ( contMayor * 100 ) / 4;
        double porcentajeMenor = ( contMenor * 100 ) / 4;
        
        System.out.println("Mayores de edad: %" + porcentajeMayor);
        System.out.println("Menores de edad: %" + porcentajeMenor);
    }

}
