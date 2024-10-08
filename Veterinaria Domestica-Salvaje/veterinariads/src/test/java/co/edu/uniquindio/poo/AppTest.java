package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    private Veterinaria veterinaria;
    private Dueño dueño;
    private Perro perro;
    private Gato gato;
    private Aguila aguila;
    private Leon leon;
    private Canario canario;

    @BeforeEach
    public void setUp() {
        veterinaria = new Veterinaria("Salud Animal", "Cra 22", "3172732713");
        dueño = new Dueño("Daniela", "31542");
        perro = new Perro("Pepe", "1", "15.5", "mestizo", Acciones.COMER);
        gato = new Gato("Gea", "2", "12", "Gris", Acciones.COMER);
        aguila = new Aguila("Desconocido", "5", "37", 45.4, Acciones.COMER);
        leon = new Leon("Simba", "3", "190", "Dorado", Acciones.COMER);
        canario = new Canario("Tweety", "1", "0.5", "Sí", Acciones.DORMIR);
    }

    @Test
    public void testVeterinariaToString() {
        String expected = "\n Bienvenidos a la clinica veterinaria Salud Animal donde atenderemos a tu animal de cualquier especie. \n\n Direccion: Cra 22\n Telefono: 3172732713";
        assertEquals(expected, veterinaria.toString());
    }

    @Test
    public void testAnimalGetters() {
        assertEquals("Pepe", perro.getNombre());
        assertEquals("1", perro.getEdad());
        assertEquals("15.5", perro.getPeso());
    }

    @Test
    public void testPerroToString() {
        String expected = "\n PERROS \n\n Nombre: Pepe\n Raza: mestizo\n Edad: 1\n Peso: 15.5";
        assertEquals(expected, perro.toString());
    }

    @Test
    public void testGatoToString() {
        String expected = "\n\n GATOS: \n\n Nombre: Gea\n Color Pelaje: Gris\n Edad: 2\n Peso: 12";
        assertEquals(expected, gato.toString());
    }
    @Test
    public void testAguilaToString() {
        String expected = "\n\n AGUILAS:  \n Nombre: Desconocido\n Envergadura: 45.4\n Edad: 5\n Peso: 37\n Acciones: " + Acciones.COMER; 
        assertEquals(expected, aguila.toString());
    }
    
    
    @Test
    public void testLeonToString() {
        String expected = "\n\n\n LEONES: \n Nombre: Simba\n Melena: Dorado\n Edad: 3\n Peso: 190"; 
        assertEquals(expected, leon.toString());
    }

    @Test
    public void testCanarioToString() {
        String expected = "\n\n CANARIOS: \n Nombre: Tweety\n Edad: 1\n Peso: 0.5";
        assertEquals(expected, canario.toString());
    }

    @Test
    public void testDueñoAgregarMascota() {
        dueño.agregarMascota(gato);
        dueño.agregarMascota(perro);
        assertEquals(1, dueño.getGatos().size());
        assertEquals(1, dueño.getPerros().size());
        assertEquals(gato, dueño.getGatos().get(0));
        assertEquals(perro, dueño.getPerros().get(0));
    }

    @Test
    public void testDueñoToString() {
        dueño.agregarMascota(gato);
        String expected = "\n\n\n DUEÑOS DE PERROS Y GATOS: \n Nombre: Daniela\n Cedula: 31542";
        assertEquals(expected, dueño.toString());
    }
}
