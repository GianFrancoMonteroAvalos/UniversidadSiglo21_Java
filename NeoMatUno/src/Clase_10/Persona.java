package Clase_10;

//Creamos una clase destinada a realizar el objeto Persona
public class Persona {
    
    //Establecemos los atributos/características
    
    
    //Palabra reservada private genera un encapsulamiento
    private int edad;
    
    private final String nombre;
    
    private String apellido;
    
    private String direccion;
    
    private double altura;
    
    public Persona(int edad, String nombre, String apellido, String direccion, double altura){
        this.edad = edad;
        this.nombre = nombre; 
        this.apellido = apellido;
        this.direccion = direccion;
        this.altura = altura;   
    }
    
    //Método setter -> establecemos la edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    //Método getter -> Obtener la edad
    public int getEdad(){
        return edad;
    }
    
    public void setApellido(){
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre + " su apellido es: " + apellido);
        System.out.println("Tiene la edad de: " + edad + "su direccin de domicilio es: " + direccion);
        System.out.println("Tiene una altura de:" + altura);
    }
    
    public static void main(String [] args){
        Persona persona1 = new Persona(31, "Gian", "perez", "Kame House 45454", 1.80);
        
        persona1.mostrarDatos();
    }
}
