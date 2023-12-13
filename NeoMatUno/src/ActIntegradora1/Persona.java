package ActIntegradora1;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String apellido, int dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }
        
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"+
                "Apellido: " + apellido + "\n" +
                "DNI: " + dni + "\n" +
                "Fecha de Nacimiento: " + fechaNacimiento + "\n"+
                "------------------------------------------------";
    }
    }

    
    
