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
    void test1camino1() throws EmptyCollectionException{
        assertNull(editor.mayorLongitud());
    }
    
    @Test
    void test2camino4() throws EmptyCollectionException {
        editor.leerFichero("src/test/ficheros/FicherosMayorLong/TextoTest2");
        assertEquals("Hola", editor.mayorLongitud());
    }
    
    @Test
    void test3camino5_1() throws EmptyCollectionException {
        editor.leerFichero("src/test/ficheros/FicherosMayorLong/TextoTest3");
        assertEquals("hola", editor.mayorLongitud());
    }
    
    @Test
    void test4camino6_1() throws EmptyCollectionException {
        editor.leerFichero("src/test/ficheros/FicherosMayorLong/TextoTest4");
        assertEquals("holas", editor.mayorLongitud());
    }
}
