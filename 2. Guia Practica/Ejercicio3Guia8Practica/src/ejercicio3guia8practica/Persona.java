package ejercicio3guia8practica;

public class Persona {
    private int edad;
    private String nombre, sexo;
    private double peso, altura;

    public Persona() {
    }

    public Persona(int edad, String nombre, String sexo, double peso, double altura) {
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
}
