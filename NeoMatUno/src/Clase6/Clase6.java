package Clase6;

public class Clase6 {
    public static void main(String[] args) {
    /*
        
    //Matrinces
       
       //Declaramos un vector de enteros
       int[] vector = {1,2,3,4,5};
       
       //Inicializar una variable
       int suma = 0;
       
       //Recorrer el vector y sumar sus elementos
       for(int i  = 0; i < vector.length; i++){
           suma += vector[i];    
       }
       //Mostrar la suma en pantalla
        System.out.println("La suma total de los elementos en un vector es: " + suma);
      */
    /*
    //Ejemplo 2
    //Declaramos un vector de enteros
    int[] vector = {15,7,79,16,105,49};
    
    //Inicializamos una variable para almacenar el valor máximo
    int maximo = vector[0];
    
    //Recorrer el vector para encontrar el valor máximo
    for(int i = 1; i < vector.length; i++){
        if(vector[i]>maximo){
        maximo = vector[i];
        }
        
    }
    //Mostrar el valor máximo   
        System.out.println("El valor máximo en el vector es: " + maximo);
    */
    /*
    //Ejemplo 3
    //Encontrar el producto punto de dos vectores
    
    int[] vector1 = {2,1,4,5};
    
    int[] vector2 = {2,9,5,6};
    
    //Inicializamos el producto punto con una variable en 0
    int productoPunto = 0;
    
    //Calcular el producto punto de los dos valores
    
    for(int i = 0; i < vector1.length; i++){
        productoPunto += vector1[i] * vector2[i]; 
    }
    
        System.out.println("El producto punto de los vectores es: " + productoPunto);
    */
    
    //Ejemplo 4
    
    //Declaramos una matriz de enteros
    
    int[][] matriz = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int filas = matriz.length;
    int columnas = matriz[0].length;
    
    //Declarar una matriz para almacenar la matriz transpuesta
    int[][] matrizTranspuesta = new int[columnas][filas];
    
    //Calcular la matriz transpuesta 
    for(int i = 0; i<filas; i++){
        for(int j = 0; j<columnas; j++){
        matrizTranspuesta[j][i]=matriz[i][j];
                }
    }
     for(int i = 0; i<columnas; i++){
        for(int j = 0; j<filas; j++){
            System.out.println(matrizTranspuesta[i][j] + "");
                }
    }
    
    
    }
}
