package Clase8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Clase8 {
    public static void main(String[] args){
      
        /*HashMap: es una implementación de la interfaz Map en Java. Representa 
        un basado en una estructura de tabla de dispersión,                                                                     //put= es para List y Set
        lo que significa que organiza los elementos en cubetas utilizando la
        función Hash de las clases. Nos proporciona un rendimiento rápido para operaciones de inserción, 
        eliminación y búsqueda
        */
        
        //Ejemplo 1: - HashMap básico
        //Crear un HashMap, agregar elementos y mostrarlo
        
        Map<String, Integer> miMapa = new HashMap<>();
        
        miMapa.put("Uno", 1);
        miMapa.put("Dos", 2);
        
        System.out.println("Ejemplo 1: " + miMapa);
        
        
        //Ejemplo 2: Acceder a un valor por clave
        //Obtener el valor asociado a la clave "Dos"
        
        int value = miMapa.get("Dos");
        System.out.println("Valor: " + value);
    
        //Ejemplo 3: - Verificar si una clave existe
        //Verificar si la clave "Tres" está presenta en el mapa
        
        boolean containsKey = miMapa.containsKey("Tres");
        System.out.println("containsKey = " + containsKey);
        
        
        //Ejemplo 4: Iterar sobre las claves y valores 
        //Mostrar todas las claves y valores del mapa
        
        for(Map.Entry<String, Integer> entry : miMapa.entrySet()){
            System.out.println("Clave = " + entry.getKey() + ", Valor: " + entry.getValue() );
        }
        
        //Ejemplo 5:
        
        //Declaren un LinkedHashMap, le agreguen 2 pares de clave-valor y que impriman
        //este LinkedHashMap
        
        //LinkedHashMap: es una implementación de la interfaz Map que mantiene el orden
        // de inserción de las claves. A diferencia del HashMap, donde el orden 
        //no está garantizado, LHM conserva el orden en que se insertaron las entradas.
        
        Map<String,Integer> lhm = new LinkedHashMap<>();
        
        lhm.put("Seis",6); 
        lhm.put("Siete",7); 
        
            System.out.println("Los valores del LinkedHashMap son: " + lhm); 
        
        //Ejemplo 6: TreeMap para ordenar las claves
        //Utilizar un TreeMap para ordenar las claves de forma natural (Alfabeticamente)
        
        Map<String, Integer> miTree = new TreeMap<>(miMapa);
        
        System.out.println("Ejemplo 6: " + miTree);
        
        int dato = miMapa.remove("Dos");
       
        System.out.println("dato =" + dato);
        
        //Tarea para ahora
        //De miMapa van a reemplazar el valor a la clave "Uno" con 10
        //Verificar si el mapa está vacio despues de eliminar todas las entradas
        
        miMapa.replace("Uno", 1, 10);
        System.out.println("El nuevo valor de miMapa es: " + miMapa);
                
        
        
    }
    
}
