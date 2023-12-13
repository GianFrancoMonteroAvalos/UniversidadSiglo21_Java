package Clase_14_Bis;

import java.util.ArrayList;
import java.util.List;


public class Main {
    
    public static void main(String[] args) {
        //Crear una lista de autos
        List<Auto>listaAutos = new ArrayList<>();
        
        listaAutos.add(new Auto("Porsche","McQueen"));
        listaAutos.add(new Auto("Fiat","Uno-S"));
        listaAutos.add(new Auto("Lamborghini","Spider"));
        listaAutos.add(new Auto("Rolls Royce","Phantom"));
        listaAutos.add(new Auto("Chevrolet","Corvette"));
        
        //Uso de stream para filtrar autos y mostrar los que estan en marcha
        System.out.println("Autos en marcha:");
        listaAutos.stream()
                .filter(Auto::isEnMarcha)//Filtramos los autos en marcha
        .forEach(System.out::println);
        
        //Cambiar el estado(enMarcha) de todos los autos a true usando streams
        System.out.println("\nArrancando los Autos: ");
        listaAutos.stream()
                .forEach(auto->auto.setEnMarcha(true));
    
    //Mostras todos los autos después de arrancarlos
        System.out.println("\nEstado de todos los autos después de arrancar");
        listaAutos.forEach(System.out::println);
    }
    
}
