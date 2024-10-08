package co.edu.uniquindio.poo;

public class Perro extends Animal {

    private String raza;
    private Acciones acciones; 

    public Perro(String nombre, String edad, String peso, String raza, Acciones acciones) {
        super(nombre, edad, peso);
        this.raza = raza;
        this.acciones = acciones; 
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public Acciones getAcciones() {
        return acciones;
    }

    public void setAcciones(Acciones acciones) {
        this.acciones = acciones;
    }

    @Override
    public String toString() {
        return "\n PERROS \n\n Nombre: " + nombre + "\n Raza: " + raza + "\n Edad: " + edad + "\n Peso: " + peso;  
    } 

    
}
