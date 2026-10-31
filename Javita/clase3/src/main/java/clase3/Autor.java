package clase3;

public class Autor {   
    private String idAutor;
    private String nombre;
    private String nacionalidad;
    private int añoNacimiento;

public Autor (){
        
}
public Autor(String idAutor, String nombre, String nacionalidad, int añoNacimiento) {
    this.idAutor = idAutor;
    this.nombre = nombre;
    this.nacionalidad = nacionalidad;
    this.añoNacimiento = añoNacimiento;
}
public Autor(String nombre, String nacionalidad){
    this.nombre = nombre;
    this.nacionalidad = nacionalidad;
}
public Autor (String idAutor, int añoNacimiento){
    this.idAutor = idAutor;
    this.añoNacimiento = añoNacimiento;
}

public String getIdAutor(){
    return idAutor;

}

public void setIdAutor(String idAutor) {
    if (idAutor == null) {
        System.out.println("Error: El ID no puede ser null");
    } else {
        this.idAutor = idAutor;
    }
}
 public String getNacionalidad() {
        return nacionalidad;
    }

public  void setNacionalidad(String nacionalidad){
    if (nacionalidad == null){
        System.out.print("Error: La nacionalidad no pueder ser vacio");

    }else{
        this.nacionalidad = nacionalidad;
    }
}

public int getAñonacimiento(){
    return añoNacimiento;
}

public void setAñonacimiento(int añoNacimiento){
    if (añoNacimiento < 0){
        System.out.print("El año de nacimiento  invalido");
    }else{
        this.añoNacimiento = añoNacimiento;
    }

}

public String getNombre(){
    return nombre;
}

public void setNombre (String nombre){
    if (nombre == null){
        System.out.print("El nombre no puede estar vacio");

    }else{
        this.nombre = nombre;
    }
}
  @Override
    public String toString() {
        return "Autor{" +
                "ID='" + idAutor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                '}';
    }
}







