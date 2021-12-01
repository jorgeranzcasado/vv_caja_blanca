package com.practica.cajablanca;
import static org.junit.jupiter.api.Assertions.*;

import com.cajanegra.AbstractSingleLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import java.io.File;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.cajanegra.EmptyCollectionException;

public class sustituirPalabra {
    private Editor editor;
    private AbstractSingleLinkedListImpl<String> lista;


    @BeforeEach
    public void setUp() {
        this.editor = new Editor();
    }

    @Test
    public void test1() throws EmptyCollectionException {
        this.editor.leerFichero("src/test/ficheros/sustituirPalabra/fich1");
        this.editor.sustituirPalabra("coche","camion");

        assertThrows(com.cajanegra.EmptyCollectionException.class, ()-> {
            this.editor.getLinea(1);
        } );
    }

    @Test
    public void test2() throws EmptyCollectionException {
        this.editor.leerFichero("src/test/ficheros/sustituirPalabra/fich2");
        this.editor.sustituirPalabra("coche","camion");

        // Comprueba si el contenido de la primera posicion de editor es igual a una lista vacia -> []
        assertEquals(this.editor.getLinea(1).toString(), "[]");

        System.out.println(this.editor.getLinea(1).toString()); //borrar esta linea luego
    }

    @Test
    public void test3() throws EmptyCollectionException {
        this.editor.leerFichero("src/test/ficheros/sustituirPalabra/fich3");
        this.editor.sustituirPalabra("coche","camion");

        // Comprueba si el contenido de la primera posicion de editor es igual a [camion]
        assertEquals(this.editor.getLinea(1).toString(), "[camion]");

        System.out.println(this.editor.getLinea(1).toString()); //borrar esta linea luego
    }

    @Test
    public void test4() throws EmptyCollectionException {
        this.editor.leerFichero("src/test/ficheros/sustituirPalabra/fich4");
        this.editor.sustituirPalabra("coche","camion");

        //Comprueba

        //borrar luego
        System.out.println(this.editor.getLinea(1).toString());
        System.out.println(this.editor.getLinea(2).toString());
    }

    @Test
    public void test5() throws EmptyCollectionException {
        this.editor.leerFichero("src/test/ficheros/sustituirPalabra/fich5");
        this.editor.sustituirPalabra("coche","camion");

        //Comprueba

        //borrar luego
        System.out.println(this.editor.getLinea(1).toString());
    }
}