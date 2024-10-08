package co.edu.uniquindio.poo;

public class Canario extends Animal{

    private String domestico;
    private Acciones acciones; 

    public Canario(String nombre, String edad, String peso, String domestico, Acciones acciones) {
        super(nombre, edad, peso);
        this.domestico = domestico;
        this.acciones = acciones; 
    }

    public String getDomestico() {
        return domestico;
    }

    public void setDomestico(String domestico) {
        this.domestico = domestico;
    }

    @Override
    public String toString() {
        return "\n\n CANARIOS: \n Nombre: " + nombre + "\n Edad: " + edad + "\n Peso: " + peso;
    } 

    public Acciones getAcciones() {
        return acciones;
    }

    public void setAcciones(Acciones acciones) {
        this.acciones = acciones;
    }

}
