package co.edu.uniquindio.poo;

public class Veterinaria {

    private String nombre; 
    private String direccion; 
    private String telefono;

    public Veterinaria(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\n Bienvenidos a la clinica veterinaria " + nombre + " donde atenderemos a tu animal de cualquier especie. \n\n Direccion: " + direccion +
         "\n Telefono: " + telefono;
    } 

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
