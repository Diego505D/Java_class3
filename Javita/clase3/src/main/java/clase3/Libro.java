package clase3;




public class Libro {

    private String idLibro;
    private String titulo;
    private Autor autor;
    private String isbn;
    private int añoPublicado;
    private double precio;
    private int stock;

    public Libro() {

    }

    public Libro(String idLibro, String titulo, Autor autor,
                 String isbn, int añoPublicado, double precio, int stock) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.añoPublicado = añoPublicado;
        this.precio = precio;
        this.stock = stock;
    }

    public Libro(String titulo, Autor autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public Libro(String idLibro, String titulo) {
        this.idLibro = idLibro;
        this.titulo = titulo;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        if (idLibro == null) {
            System.out.print("Error: El ID del libro no puede ser null");
        } else {
            this.idLibro = idLibro;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null) {
            System.out.print("Error: El título no puede ser null");
        } else {
            this.titulo = titulo;
        }
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        if (autor == null) {
            System.out.print("Error: El autor no puede ser null");
        } else {
            this.autor = autor;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if (isbn == null) {
            System.out.print("Error: El ISBN no puede ser null");
        } else {
            this.isbn = isbn;
        }
    }

    public int getAñoPublicado() {
        return añoPublicado;
    }

    public void setAñoPublicado(int añoPublicado) {
        if (añoPublicado < 0) {
            System.out.print("Error: El año publicado es inválido");
        } else {
            this.añoPublicado = añoPublicado;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.print("Error: El precio no puede ser negativo");
        } else {
            this.precio = precio;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.print("Error: El stock no puede ser negativo");
        } else {
            this.stock = stock;
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "idLibro='" + idLibro + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", isbn='" + isbn + '\'' +
                ", añoPublicado=" + añoPublicado +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}
