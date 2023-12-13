package ActIntegradora2;

import javax.swing.JOptionPane;

public class Usuario implements Notificacion{
    private String nombre, apellido;
    private int dni;

    public Usuario(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.nombre = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre +  "apellido=" + apellido + ", dni=" + dni + '}';
    }
   

        @Override
    public void notificarUsuario(Usuario usuario, String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje + " ¡Hola, " + nombre + "!");
    }
}
