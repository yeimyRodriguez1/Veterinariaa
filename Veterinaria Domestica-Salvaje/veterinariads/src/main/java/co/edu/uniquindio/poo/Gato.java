package co.edu.uniquindio.poo;

public class Gato extends Animal {

    private String colorPelaje;
    private Acciones acciones; 

    public Gato(String nombre, String edad, String peso, String colorPelaje, Acciones acciones) {
        super(nombre, edad, peso);
        this.colorPelaje = colorPelaje;
        this.acciones = acciones; 
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    @Override
    public String toString() {
        return "\n\n GATOS: \n\n Nombre: " + nombre + "\n Color Pelaje: " + colorPelaje + "\n Edad: " + edad + "\n Peso: " + peso;
    } 

    public Acciones getAcciones() {
        return acciones;
    }

    public void setAcciones(Acciones acciones) {
        this.acciones = acciones;
    }

}