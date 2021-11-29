package com.practica.cajablanca;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import java.io.File;

import org.junit.jupiter.api.Test;

import com.cajanegra.EmptyCollectionException;

class mayorLongitud {

	@Test
	void test1()  throws EmptyCollectionException{
		Editor editor = new Editor();
		//File archivo = new File ("C:\\Users\\bp0198\\Documents\\fichero.txt");
		Assertions.assertNull(editor.mayorLongitud());
	}
	@Test
	void test2()  throws EmptyCollectionException{
		Editor editor = new Editor();
		editor.leerFichero("src/main/java/com/practica/cajablanca/prueba.txt");
		Assertions.assertEquals(editor.mayorLongitud(), "H");
	}

}
