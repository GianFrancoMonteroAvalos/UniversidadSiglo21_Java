package Clase_11;


public class Profesor extends Persona {
    
    private String comision;
    
    private int cantAlumnos;
    
    private boolean identificacion = true;

    public Profesor(String nombre, String apellido, int edad, String comision, int cantAlumnos, boolean identificacion) {
        super(nombre, apellido, edad);
        this.comision = comision;
        this.cantAlumnos = cantAlumnos;
        this.identificacion = identificacion;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nEdad: " + getEdad() + "\nComision perteneciente: " + comision + "\nCantidad de alumnos por comision: " + cantAlumnos + "\nIdentificación: " + identificacion);
    }
    
        }
