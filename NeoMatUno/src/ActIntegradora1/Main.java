package ActIntegradora1;

import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        GestorPersonas gestor = new GestorPersonas();
        
        boolean continuar = true;
        
        while(continuar) {
            String opcion = JOptionPane.showInputDialog("Seleccione una opción:\n"+
                    "1. Registrar nueva persona\n" +
                    "2. Mostrar todas las personas registradas\n" +
                    "3. Salir");
            switch (opcion) {
                case "1":
                    gestor.Login();
                    break;
                case "2":
                    gestor.mostrarPersonas();
                    break;
                case "3":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
            }
        }
    }
}
