package ActIntegradora1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;


public class GestorPersonas {
    private Set<Persona> listaPersonas;
    
    public GestorPersonas(){
        listaPersonas = new HashSet<>();
    }
    
    
     public boolean isNull(Object valueField) {
        return valueField == null || (valueField instanceof String && ((String) valueField).isEmpty());
    }
     
    public void Login() {
        
        String nombre = "";
        String apellido = "";
        int dni = 0;
        LocalDate fechaNacimiento = null;

        while (nombre.isEmpty() || apellido.isEmpty() || dni == 0 || fechaNacimiento == null) {
            nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
            apellido = JOptionPane.showInputDialog("Ingrese el apellido: ");

            try {
                String dniStr = JOptionPane.showInputDialog("Ingrese el DNI (8 dígitos): ");
                dni = Integer.parseInt(dniStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El DNI debe ser un número válido.");
                continue;
            }

            String fechaNacimientoStr = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (dd/mm/yyyy): ");
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                fechaNacimiento = LocalDate.parse(fechaNacimientoStr, formatter);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Ingrese la fecha en formato (dd/mm/yyyy).");
            }
        }
        
        Persona nuevaPersona = new Persona (nombre, apellido, dni, fechaNacimiento);
        if (listaPersonas.add(nuevaPersona)) {
        JOptionPane.showMessageDialog(null, "Persona registrada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "La persona ya está registrada.");
        }
    }
        public void mostrarPersonas(){
            String mensaje = "Personas registradas:\n";
            for(Persona persona : listaPersonas){
                mensaje += persona.toString() + "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje);
         
        
    }
}