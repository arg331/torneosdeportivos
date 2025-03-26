package org.ualhmis.torneos;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import java.time.LocalDate;

// Restricciones en los equipos (jugadores de la misma categoría y modalidad)

class JugadorTest {

    @Test
    void testCategoriaPorEdad() {
        Jugador jugador1 = new Jugador("Carlos", "Masculino", LocalDate.of(2015, 5, 10));
        assertEquals("Infantil", jugador1.getCategoria());

        Jugador jugador2 = new Jugador("Luis", "Masculino", LocalDate.of(2010, 3, 15));
        assertEquals("Cadete", jugador2.getCategoria());

        Jugador jugador3 = new Jugador("Ana", "Femenino", LocalDate.of(2005, 8, 22));
        assertEquals("Juvenil", jugador3.getCategoria());

        Jugador jugador4 = new Jugador("Pedro", "Masculino", LocalDate.of(2002, 1, 30));
        assertEquals("Junior", jugador4.getCategoria());

        Jugador jugador5 = new Jugador("Marta", "Femenino", LocalDate.of(1998, 6, 5));
        assertEquals("Absoluta", jugador5.getCategoria());
    }

    @Test
    void testCreacionJugadorInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Jugador("", "Masculino", LocalDate.of(2010, 1, 1)));
        assertThrows(IllegalArgumentException.class, () -> new Jugador("Juan", "", LocalDate.of(2010, 1, 1)));
        assertThrows(IllegalArgumentException.class, () -> new Jugador("Juan", "Masculino", null));
    }
    
    @Test
/*
 * testNombre
 */
    void testNombre(Jugador jugador) {
        if (jugador.getNombre().equals(null)) throw new IllegalArgumentException("Falta nombre");
    }
 @Test
 void testGenero(Jugador jugador){
    if (!jugador.getGenero().equals("femenino") && !jugador.getGenero().equals("masculino") ) throw new IllegalArgumentException("Género no válido");
 }
 void testFechaNacimiento(Jugador jugador) {
    if (!jugador.getFechaNacimiento().equals(null)) throw new IllegalArgumentException("Fecha de nacimiento no válida");
 }

 void testCategoria(Jugador jugador){
  int edad = jugador.calcularEdad();
  IllegalArgumentException e = new IllegalArgumentException("Categoría errónea");
  if (edad < 12 && !jugador.getCategoria().equals("Infantil")) throw e;
  else if (edad < 15 && !jugador.getCategoria().equals("Cadete")) throw e;
  else if (edad < 18 && !jugador.getCategoria().equals("Juvenil")) throw e;
  else if (edad < 21 && !jugador.getCategoria().equals("Junior")) throw e;
  else if (edad > 20 && !jugador.getCategoria().equals("Absoluta")) throw e;

 }

}
