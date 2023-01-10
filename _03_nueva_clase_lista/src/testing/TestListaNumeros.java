package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import _03_nueva_clase_lista.ListaNumeros;

class TestListaNumeros {
	ListaNumeros lista;
	

	@BeforeEach
	void setUp() throws Exception {
		lista=new ListaNumeros();
	}

	@Test
	void testFirst() {
		lista.add(25);
		lista.add(35);
		assertEquals(25, lista.first());
	}

	@Test
	void testLast() {
		lista.add(25);
		lista.add(35);
		assertEquals(35, lista.last());
	}

	@Test
	void testSum() {
		lista.add(25);
		lista.add(35);
		assertEquals(60, lista.sum());
		
	}

	@Test
	void testAddInteger() {
		lista.add(5);
		lista.add(10);
		assertFalse(lista.add(5));
		assertEquals(2,lista.size());
	}

}
