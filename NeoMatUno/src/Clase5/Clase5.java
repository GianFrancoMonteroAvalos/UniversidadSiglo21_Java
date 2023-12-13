
package Clase5;

import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane;


public class Clase5 {
    
    public static void main(String[] args){
      /* 
        //Ejemplo 1
        
        //Solicitar al usuario que ingrese un númeo y guardarlo en una variable
        
        String numeroString = JOptionPane.showInputDialog("Ingrese un número");
        
        int numero = Integer.parseInt(numeroString);
        
        //Comprobar si el número es par o impar
        
        if(numero % 2 == 0){
            JOptionPane.showMessageDialog(null, "El número es  par");
        
        }else {
            JOptionPane.showMessageDialog(null, "El número es  impar");
        }

*/
      /*
      //Ejemplo 2
      
      String calificacion = JOptionPane.showInputDialog("Ingrese un número");
      
      int nota = Integer.parseInt(calificacion);
      
      if(nota > 60){
          JOptionPane.showMessageDialog(null, "Tu examen fue aprobado");
      }else{
        JOptionPane.showMessageDialog(null, "Tu examen fue desaprobado");
      }
      */
     /*
      //Ejemplo 3
      
      String num1 = JOptionPane.showInputDialog("Ingrese el primer número");
      
      String num2 = JOptionPane.showInputDialog("Ingrese el segundo número");
      
      String num3 = JOptionPane.showInputDialog("Ingrese el tercer número");
      
      //Iniciliazar una variable para almacenar el número mayor 
      
      double mayor = Double.parseDouble(num1);
      
      //Comprobar si el segundo número es mayor que el actual número mayor
      if(Double.parseDouble(num2)>mayor){
          mayor = Double.parseDouble(num2);
    }

    //Comprobar si el tercer número es mayor que el número mayor
      if(Double.parseDouble(num3)>mayor){
        mayor = Double.parseDouble(num3);

}   
    JOptionPane.showMessageDialog(null,"El número mayor es: " + mayor);
    }
¨*/
     //Solicitamos 2 números y una operación
     String num1 = JOptionPane.showInputDialog("Ingrese el primer número");
     
     String num2 = JOptionPane.showInputDialog("Ingrese el segundo número");
     
     String operacion = JOptionPane.showInputDialog("Ingrese la operación a ingresar a realizar");
     
     
     //Inicializar una variable para el resultado
     double resultado = 0;
     
     //Realizar la operación correspondiente según la entrada del usuario
     
     switch(operacion){
         case "+" -> resultado = Double.parseDouble(num1) + Double.parseDouble(num2);
         case "-" -> resultado = Double.parseDouble(num1) - Double.parseDouble(num2);
         case "/" -> resultado = Double.parseDouble(num1) / Double.parseDouble(num2);
         case "*" -> resultado = Double.parseDouble(num1) * Double.parseDouble(num2);
         default -> JOptionPane.showMessageDialog(null, "Error en la operación");
     }
  JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}
