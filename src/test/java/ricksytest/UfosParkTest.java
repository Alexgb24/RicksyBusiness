package edu.elsmancs.ricksytest.domain;


import org.junit.Test;
import static org.junit.Assert.*;



public class UfosParkTest {

    UfosPark ufos = null;
    String[] ovnis = { "unx", "dox", "trex" };

    /**
     * Testea el metodo a�adir ovni 
     * a la flota de ufos
     */
    @Test
    public void addUfoTest() {
    }

    /**
     * Testea el metodo reservar ovni 
     * y cargar el pago en la tarjeta 
     * de cr�dito.
     * El cr�dito de la tarjeta var�a.
     */
    @Test
    public void dispatchTest() {
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si no hay cr�dito suficiente en la tarjeta.
     * El cr�dito de la tarjeta no var�a.
     */
    @Test
    public void dispatchNoCreditTest() {
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si ya existe un ovni reservado para esa tarjeta.
     * El cr�dito de la tarjeta no var�a.
     */
    @Test
    public void dispatchUfoAlreadyReservedTest() {
    }

    /**
     * Testea que no se pueda reservar un ovni 
     * si no existe ninguno disponible (sin reservar).
     * El cr�dito de la tarjeta no var�a.
     */
    @Test
    public void dispatchNoUfoAvaliableTest() {
    }

    /**
     * Devuelve el UFO reservado para la tarjeta.
     */
    @Test
    public void getUfoOfTest() {
    }
}