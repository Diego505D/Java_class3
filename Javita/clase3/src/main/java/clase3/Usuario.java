
package clase3;

public class Usuario {

    private String idUsuario;
    private String nombre;
    private String correoElectronico;
    private int librosPrestados;

    public Usuario() {

    }

    public Usuario(String idUsuario, String nombre,
                   String correoElectronico, int librosPrestados) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.librosPrestados = librosPrestados;
    }

    public Usuario(int librosPrestados, String correoElectronico) {
        this.librosPrestados = librosPrestados;
        this.correoElectronico = correoElectronico;
    }

    public Usuario(String idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        if (idUsuario == null) {
            System.out.print("Error: El ID del usuario no puede ser null");
        } else {
            this.idUsuario = idUsuario;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            System.out.print("Error: El nombre no puede ser null");
        } else {
            this.nombre = nombre;
        }
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico == null) {
            System.out.print("Error: El correo no puede ser null");
        } else {
            this.correoElectronico = correoElectronico;
        }
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(int librosPrestados) {
        if (librosPrestados < 0) {
            System.out.print("Error: Los libros prestados no pueden ser negativos");
        } else {
            this.librosPrestados = librosPrestados;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario='" + idUsuario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", librosPrestados=" + librosPrestados +
                '}';
    }
}
