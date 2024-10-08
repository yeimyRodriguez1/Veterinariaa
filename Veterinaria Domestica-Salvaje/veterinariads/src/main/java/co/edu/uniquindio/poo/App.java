package co.edu.uniquindio.poo;

public class App {

    public static void main(String[] args) {
  
    //Creacion clinica Veterinaria 

    Veterinaria veterinaria = new Veterinaria("Salud Animal", "Cra 22", "3172732713"); 
    Veterinaria.mostrarMensaje(veterinaria.toString());

    //Creacion de los dueños

    Dueño dueño1 = new Dueño("Daniela", "31542");
    Dueño dueño2 = new Dueño("Michael", "318755");

    //Creacion de perros
    Perro perro1 = new Perro("pepe", "1", "15.5", "mestizo", Acciones.COMER);
    Perro perro2 = new Perro("Pepa", "2", "25", "Nose", Acciones.DORMIR); 
    
    //Creacion de gatos 

    Gato gato1 = new Gato("Gea", "2", "12", "Gris", Acciones.COMER); 
    Gato gato2 = new Gato("Pacho", "3", "6", "Amarillo", Acciones.DORMIR); 

    //Creacion aguila 

    Aguila aguila = new Aguila("Desconocido", "5", "37", 45.4, Acciones.COMER); 

    //Creacion canario 

    Canario canario = new Canario("Desconocido", "1", "1", "", Acciones.DORMIR); 


    //Creacion leon 

    Leon leon = new Leon("Zimba", "8", "120", "Amarilla", Acciones.COMER); 

    //Agregacion dueño a mascota
    dueño1.agregarMascota(gato1); 
    dueño2.agregarMascota(perro1); 


    Veterinaria.mostrarMensaje(perro1.toString());
    Veterinaria.mostrarMensaje(perro2.toString());
    Veterinaria.mostrarMensaje(gato2.toString());
    Veterinaria.mostrarMensaje(gato1.toString());
    Veterinaria.mostrarMensaje(aguila.toString());
    Veterinaria.mostrarMensaje(canario.toString());
    Veterinaria.mostrarMensaje(leon.toString());
    Veterinaria.mostrarMensaje(dueño1.toString());
    Veterinaria.mostrarMensaje(dueño2.toString());

    }
}