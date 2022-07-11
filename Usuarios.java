import javax.swing.*;

public class Usuarios {

    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int cedula;

    //CONSTRUCTOR

    public Usuarios(String nombre, String apellido, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }


    //ACCESORES


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    //ACCIONES PROPIAS

}
