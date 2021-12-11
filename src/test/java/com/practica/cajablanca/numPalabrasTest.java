package com.practica.cajablanca;

import static org.junit.jupiter.api.Assertions.*;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Assertions;
import java.io.File;

import org.junit.jupiter.api.Test;

import com.cajanegra.EmptyCollectionException;
public class numPalabrasTest {
    private SingleLinkedListImpl<String> editor;

    //Test para el camino 1: inicio menor o igual que cero
    @Test
    public void test1Camino1 (){
        Editor editor = new Editor();
        assertThrows(IllegalArgumentException.class, () -> {editor.numPalabras(0, 1, "coche");});
    }

    //Test para el camino 2: fin no puede ser mayor que el tamaño de editor
    @Test
    public void test2Camino2 (){
        Editor editor = new Editor();
        assertThrows(IllegalArgumentException.class, () -> {editor.numPalabras(1, 1, "coche");});
    }

    //Test para el camino 3: tamaño de editor igual a cero
    @Test
    public void test3Camino3 (){
        Editor editor = new Editor();
        assertEquals(0, editor.numPalabras(1, 0, "coche"));
    }

    //Test para el camino 4: tamaño de editor mayor que 0 e inicio = fin
    @Test
    public void test4Camino4 (){
        Editor editor = new Editor();
        editor.leerFichero("src/test/ficheros/numPalabras/textoTest4");
        assertEquals(0, editor.numPalabras(1,1, "coche"));
    }

   
    //Camino 5 no valido
    //Test para el camino 6: tamaño de editor mayor que 0, inicio menor que fin, pos menor o igual
    //que tamaño lista, fin - inicio = 1, editor.getAtPos(inicio) != palabra
    @Test
    public void test5Camino6 (){
        Editor editor = new Editor();
        editor.leerFichero("src/test/ficheros/numPalabras/textoTest5");
        assertEquals(0, editor.numPalabras(1,2, "coche"));
    }

    //Test para el camino 7: tamaño de editor mayor que 0, inicio menor que fin, pos menor o igual
    //que tamaño lista, editor.getAtPos(inicio) == palabra
    @Test
    public void test6Camino7 (){
        Editor editor = new Editor();
        editor.leerFichero("src/test/ficheros/numPalabras/textoTest6");
        assertEquals(1, editor.numPalabras(1,2, "coche"));
    }
}
