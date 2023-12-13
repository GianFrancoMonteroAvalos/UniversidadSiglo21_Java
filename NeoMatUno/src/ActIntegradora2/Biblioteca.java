package ActIntegradora2;

import java.util.*;
import javax.swing.JOptionPane;

public class Biblioteca {
    private static ArrayList<Libro> libros;
    private static ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }
    
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        inicializarLibros();
        inicio();
        
    }
    private static void inicializarLibros() {
    
    Libro libro1 = new Libro("Clean Code", "Robert C. Martin", "Programación", true);
    Libro libro2 = new Libro("The Pragmatic Programmer", "Andrew Hunt, David Thomas", "Programación", true);
    Libro libro3 = new Libro("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", "Programación", true);
    Libro libro4 = new Libro("Code: The Hidden Language of Computer Hardware and Software", "Charles Petzold", "Ciencias de la Computación", true);
    Libro libro5 = new Libro("The Mythical Man-Month: Essays on Software Engineering", "Frederick P. Brooks Jr.", "Ingenieria de Software", true);
    Libro libro6 = new Libro("Structure and Interpretation of Computer Programs", "Harold Abelson, Gerald Jay Sussman", "Programación", true);
    Libro libro7 = new Libro("Introduction to the Theory of Computation", "Michael Sipser", "Computational Theory", true);
    Libro libro8 = new Libro("Head First Design Patterns", "Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra", "Diseño de software", true);
    libros.add(libro1);
    libros.add(libro2);
    libros.add(libro3);
    libros.add(libro4);
    libros.add(libro5);
    libros.add(libro6);
    libros.add(libro7);
    libros.add(libro8);
}
    
    private static void inicio(){   

         boolean continuar = true;
        
        while(continuar) {
            String opcion = JOptionPane.showInputDialog("Seleccione una opción:\n"+
                    "1. Registrar nueva persona\n" +
                    "2. Ya estas registrado\n" +
                    "3. Salir");
            switch (opcion) {
                case "1":
                    registrarUsuarioNuevo();
                    break;
                case "2":
                    validarUsuarioExistente();
                    break;
                case "3":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
            }
        }
    }
    
    private static void registrarUsuarioNuevo(){
    
        String nombre = JOptionPane.showInputDialog(null, "Registre el nombre:").toUpperCase();
    String apellido = JOptionPane.showInputDialog(null, "Registre el apellido:").toUpperCase();
    String dniStr = JOptionPane.showInputDialog(null, "Registre el DNI (8 dígitos sin puntos):");

    if (validarNombre(nombre) && validarApellido(apellido) && validarDni(dniStr)) {
        int dni = Integer.parseInt(dniStr);
        Usuario nuevoUser = new Usuario(nombre, apellido, dni);
        usuarios.add(nuevoUser);
        JOptionPane.showMessageDialog(null, "Usuario registrado con éxito.");
    } else {
        JOptionPane.showMessageDialog(null, "Ocurrió un error con alguno de los datos. El usuario no pudo ser registrado.");
    }
}
    
    private static boolean validarNombre (String nombre){
        return !nombre.isBlank() && nombre.matches("[a-zA-ZñÑ]+"); 
    }
    
     private static boolean validarApellido (String apellido){
        return !apellido.isBlank() && apellido.matches("[a-zA-ZñÑ]+"); 
    }
    
    private static boolean validarDni(String dniStr){ 
        return dniStr.length() == 8 && dniStr.matches("\\d{8}");
    }


    private static void validarUsuarioExistente(){
    
      String dniStr = JOptionPane.showInputDialog(null, "Ingrese con su DNI (8 dígitos sin puntos):");

    if (validarDni(dniStr)) {
        int dni = Integer.parseInt(dniStr);
        if (buscarUsuarioPorDni(usuarios, dni)) {
            JOptionPane.showMessageDialog(null, "¡Bienvenido, ingresaste con éxito!" );
            logeado();
        } else {
            int opcion = JOptionPane.showConfirmDialog(null, "Usuario no registrado. ¿Desea registrarse?");
            if (opcion == JOptionPane.YES_OPTION) {
                registrarUsuarioNuevo();
            } else {
                JOptionPane.showMessageDialog(null, "Para utilizar el servicio, es necesario registrarse.");
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "El DNI no es numérico o no posee 8 dígitos. Intente nuevamente.");
    }
}  
    private static boolean buscarUsuarioPorDni(ArrayList<Usuario> usuarios, int dni){
        for (Usuario usuario : usuarios) {
            if (usuario.getDni() == dni) {
                return true;  
            }
        }
        return false; 
    }
    
    private static void logeado(){

           int opcionUser = 0;

    do {
        String menu = "Seleccione una opción:\n" +
                      "1 - Agregar un libro\n" +
                      "2 - Eliminar un libro\n" +
                      "3 - Alquilar un libro\n" +
                      "4 - Devolver un libro\n" +
                      "5 - Buscar un libro\n" +
                      "6 - Mostrar los libros\n" +
                      "7 - Volver al menu principal\n" +
                      "8 - Salir\n\n" +
                      "Seleccione una opcion:";
        
        String userInput = JOptionPane.showInputDialog(null, menu);
        
        try {
            opcionUser = Integer.parseInt(userInput);
            switch (opcionUser) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    eliminarLibro();
                    break;
                case 3:
                    alquilarLibro();
                    break;
                case 4:
                    devolverLibro();
                    break;
                case 5:
                    buscarLibro();
                    break;
                case 6:
                    listarLibros();
                    break;
                case 7:
                    
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "LA OPCION INGRESADA NO ES UN NUMERO VALIDO, INTENTE NUEVAMENTE...");
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "LA OPCION INGRESADA NO ES UN NUMERO, INTENTE NUEVAMENTE...");
        }
    } while (opcionUser != 7);
}
    
    
    private static void agregarLibro(){
    
        String titulo = JOptionPane.showInputDialog(null, "Ingrese el titulo del libro:").toUpperCase();
    String autor = JOptionPane.showInputDialog(null, "Ingrese el nombre del autor del libro:").toUpperCase();
    String genero = JOptionPane.showInputDialog(null, "Ingrese el genero del libro:").toUpperCase();
    
    boolean disponible = true;
    
    if (complete(titulo) && complete(autor) && complete(genero)) {
        if (!libroRepetido(libros, titulo)) {
            Libro nuevoLibro = new Libro(titulo, autor, genero, disponible); 
            libros.add(nuevoLibro);
            JOptionPane.showMessageDialog(null, "Libro agregado con exito.");
        } else {
            JOptionPane.showMessageDialog(null, "El libro que intentas agregar ya existe, intenta con otro");
        } 
    } else {
        JOptionPane.showMessageDialog(null, "Alguno de los datos estaba en blanco. El libro no pudo ser agregado.");
    }
}
    
    private static boolean complete(String palabra){
        return !palabra.isBlank();
    }
    
    private static boolean libroRepetido (ArrayList<Libro> libros, String titulo){
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return true; 
            }
        }
        return false; 
    }
    
    private static void eliminarLibro(){
    
         String titulo = JOptionPane.showInputDialog(null, "Ingrese el titulo del libro a eliminar:").toUpperCase();
    
    boolean libroEncontrado = false;
    for (Libro libro : libros){
        if (libro.getTitulo().equals(titulo)){
            libros.remove(libro);
            JOptionPane.showMessageDialog(null, "Libro '" + titulo + "' eliminado con exito");
            libroEncontrado = true;
            break;
        } 
    }
    
    if (!libroEncontrado) {
        JOptionPane.showMessageDialog(null, "Libro '" + titulo + "' no encontrado en la lista");
    }
}
    
    private static void listarLibros(){
        StringBuilder librosTexto = new StringBuilder();
    for (Libro libro : libros) {
        librosTexto.append(libro.toString()).append("\n");
    }

    if (librosTexto.length() > 0) {
        JOptionPane.showMessageDialog(null, librosTexto.toString(), "Lista de Libros", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "No hay libros para mostrar", "Lista de Libros", JOptionPane.INFORMATION_MESSAGE);
    }
}
    private static void alquilarLibro(){
    
         String titulo = JOptionPane.showInputDialog(null, "Ingrese el titulo del libro que quisiera alquilar:").toUpperCase();
    boolean libroEncontrado = false;

    for (Libro libro : libros) {
        if (libro.getTitulo().equals(titulo) && libro.isDisponible()) {
            libro.setDisponible(false);
            JOptionPane.showMessageDialog(null, "Libro '" + titulo + "' alquilado con exito");
            libroEncontrado = true;
            return;
        }
    }

    if (!libroEncontrado) {
        JOptionPane.showMessageDialog(null, "Libro '" + titulo + "' no encontrado o alquilado. No se pudo alquilar");
    }
}
    
    private static void devolverLibro(){
    
    String titulo = JOptionPane.showInputDialog(null, "Ingrese el titulo del libro que quisiera devolver:").toUpperCase();
    boolean libroEncontrado = false;

    for (Libro libro : libros) {
        if (libro.getTitulo().equals(titulo) && !libro.isDisponible()) {
            libro.setDisponible(true);
            JOptionPane.showMessageDialog(null, "Libro '" + titulo + "' devuelto con exito");
            libroEncontrado = true;
            return;
        }
    }

    if (!libroEncontrado) {
        JOptionPane.showMessageDialog(null, "Libro '" + titulo + "' no encontrado o ya existente. No se pudo devolver");
    }
}
        
private static void buscarLibro() {
    int opcion;
    
    do {
        String menu = "Seleccione una opción:\n" +
                      "1 - Buscar por titulo\n" +
                      "2 - Buscar por autor\n" +
                      "3 - Buscar por genero\n" +
                      "4 - Volver al menu de usuarios\n" +
                      "5 - Salir\n\n" +
                      "Seleccione una opcion:";
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

        switch (opcion) {
            case 1 -> busquedaPorTitulo();
            case 2 -> busquedaPorAutor();
            case 3 -> busquedaPorGenero();
            case 4 -> JOptionPane.showMessageDialog(null, " ");
            case 5 -> {
                JOptionPane.showMessageDialog(null, "Saliendo...");
                System.exit(0);
            }
            default -> JOptionPane.showMessageDialog(null, "LA OPCION INGRESADA NO ES UN NUMERO VALIDO, INTENTE NUEVAMENTE...");
        }
    } while (opcion != 4);
}

private static void busquedaPorTitulo() {
    String titulo = JOptionPane.showInputDialog(null, "Ingrese el titulo del libro que quisiera buscar:").toUpperCase();
    boolean libroEncontrado = false;

    for (Libro libro : libros) {
        if (libro.getTitulo().equals(titulo)) {
            JOptionPane.showMessageDialog(null, libro);
            libroEncontrado = true;
            return;
        }
    }

    if (!libroEncontrado) {
        JOptionPane.showMessageDialog(null, "No hay libros para mostrar");
    }
}

private static void busquedaPorAutor() {
    String autor = JOptionPane.showInputDialog(null, "Ingrese el autor que quisiera buscar:").toUpperCase();
    int flag = 0;

    for (Libro libro : libros) {
        if (libro.getAutor().equals(autor)) {
            JOptionPane.showMessageDialog(null, libro);
            flag = 1;
        }
    }

    if (flag == 0) {
        JOptionPane.showMessageDialog(null, "No hay libros para mostrar");
    }
}

private static void busquedaPorGenero() {
    String genero = JOptionPane.showInputDialog(null, "Ingrese el genero que quisiera buscar:").toUpperCase();
    int flag = 0;

    for (Libro libro : libros) {
        if (libro.getGenero().equals(genero)) {
            JOptionPane.showMessageDialog(null, libro);
            flag = 1;
        }
    }

    if (flag == 0) {
        JOptionPane.showMessageDialog(null, "No hay libros para mostrar");
    }
}

    
    
}