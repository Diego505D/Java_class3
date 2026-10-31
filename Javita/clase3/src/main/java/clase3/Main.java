
package clase3;

public class Main {
    public static void main(String[] args) {

        // OBJETO AUTOR
        Autor autor1 = new Autor(
            "A01", "Gabriel Garcia Marquez",
            "Colombiano", 1927
        );

        System.out.println("----- AUTOR -----");
        System.out.println(autor1);


        // OBJETO LIBRO
        Libro libro1 = new Libro(
            "L01", "Cien años de soledad",
            autor1, "9780307474728",
            1967, 50000, 10
        );

        System.out.println("----- LIBRO -----");
        System.out.println(libro1);


        // OBJETO USUARIO
        Usuario usuario1 = new Usuario(
            "U01", "Carlos",
            "carlos@gmail.com", 2
        );

        System.out.println("----- USUARIO -----");
        System.out.println(usuario1);

    }
}
