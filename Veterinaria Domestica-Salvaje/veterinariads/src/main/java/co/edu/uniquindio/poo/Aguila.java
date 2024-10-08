package co.edu.uniquindio.poo;

public class Aguila extends Animal{

    private double envergadura;
    private Acciones acciones; 

    public Aguila(String nombre, String edad, String peso, double envergadura, Acciones acciones) {
        super(nombre, edad, peso);
        this.envergadura = envergadura;
        this.acciones = acciones; 
    }

    public double getEnvergadura() {
        return envergadura;
    }

    public void setEnvergadura(double envergadura) {
        this.envergadura = envergadura;
    }

    @Override
    public String toString() {
        return "\n\n AGUILAS:  \n Nombre: " + nombre + "\n Envergadura: " + envergadura + "\n Edad: " + edad + "\n Peso: " + peso + "\n Acciones: " + acciones; 
    }
    

    public Acciones getAcciones() {
        return acciones;
    }

    public void setAcciones(Acciones acciones) {
        this.acciones = acciones;
    }
    
}
