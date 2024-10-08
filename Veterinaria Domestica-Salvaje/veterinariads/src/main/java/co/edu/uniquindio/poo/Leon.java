package co.edu.uniquindio.poo;

public class Leon extends Animal{

    private String melena;
    private Acciones acciones; 

    public Leon(String nombre, String edad, String peso, String melena, Acciones acciones) {
        super(nombre, edad, peso);
        this.melena = melena;
        this.acciones = acciones; 
    }

    public String getMelena() {
        return melena;
    }

    public void setMelena(String melena) {
        this.melena = melena;
    }

    @Override
    public String toString() {
        return "\n\n\n LEONES: \n Nombre: " + nombre + "\n Melena: " + melena + "\n Edad: " + edad + "\n Peso: " + peso;
    } 

    public Acciones getAcciones() {
        return acciones;
    }

    public void setAcciones(Acciones acciones) {
        this.acciones = acciones;
    }

}
