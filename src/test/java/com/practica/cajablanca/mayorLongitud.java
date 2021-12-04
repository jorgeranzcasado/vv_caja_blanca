package com.practica.cajablanca;
import static org.junit.jupiter.api.Assertions.*;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class mayorlongitudTest {
    private Editor editor;
    @BeforeEach
    public void setUp(){
        this.editor = new Editor();
    }
    @Test
    void test1camino(){
        assertNull(editor.mayorLongitud());
    }
    @Test
    void test2camino() throws EmptyCollectionException {
        editor.leerFichero("src/test/ficheros/FicherosMayorLong/Texto2");
        assertEquals(editor.mayorLongitud(), "Pablito");
    }
}
