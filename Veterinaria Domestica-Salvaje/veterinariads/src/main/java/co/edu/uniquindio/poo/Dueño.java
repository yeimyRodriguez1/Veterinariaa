package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Dueño {

    private String nombre; 
    private String cedula; 
    private LinkedList<Gato>gatos; 
    private LinkedList<Perro>perros;

    public Dueño(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.gatos = new LinkedList<>(); 
        this.perros = new LinkedList<>(); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public LinkedList<Gato> getGatos() {
        return gatos;
    }

    public void setGatos(LinkedList<Gato> gatos) {
        this.gatos = gatos;
    }

    public LinkedList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(LinkedList<Perro> perros) {
        this.perros = perros;
    }

    @Override
    public String toString() {
        return "\n\n\n DUEÑOS DE PERROS Y GATOS: \n Nombre: " + nombre + "\n Cedula: " + cedula;
    }
    
    public void agregarMascota(Gato gato){
        gatos.add(gato);
    }

    public void agregarMascota(Perro perro){
        perros.add(perro);
    }


    
    
}
