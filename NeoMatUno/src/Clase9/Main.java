package Clase9;

public class Main {
      public static void main(String[]args){
        
        //Instanciamos  y creamos un objeto a ejecutar
        Auto a1 = new Auto("Volkswagen", "Gol", "Azul");
        Auto a2 = new Auto("Toyota", "Corolla", "Rojo");
        Auto a3 = new Auto("Chevrolet", "Onix", "Amarillo");
        Auto a4 = new Auto("Fiat", "Cronos", "Azul");
        
        a1.acelerar();
        a1.frenar();
        a2.acelerar();
        a2.frenar();
        a3.acelerar();
        a3.frenar();
        a4.acelerar();
        a4.frenar();
    }
}
