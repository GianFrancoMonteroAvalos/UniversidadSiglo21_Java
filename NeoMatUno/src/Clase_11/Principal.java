package Clase_11;


public class Principal {

    public static void main(String[] args){

        //Instanciar Estudiantes
        Estudiantes estudiante = new Estudiantes("Gian", "Montero", 26, "Ingenieria en Software", 1500, 2024);
        
        estudiante.mostrarDatos();
        
        System.out.println("------------------------------");
        
        //Instanciar Profesor
        Profesor profesor = new Profesor("Franco", "Avalos", 47, "D", 32, true );
        
        profesor.mostrarDatos();
        
    }
}
