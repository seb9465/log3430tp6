package TP6;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.LinkedList;
import main.LinkedListInterface;
import main.MyList;
import main.MyListInterface;

public class TP6 {

	MyListInterface uneListe;
	LinkedListInterface uneListeChainee;
	ArrayList<Object> listeEntiers1;
	ArrayList<Object> listeEntiers2;
	
	@Before
	public void setUp() throws Exception {
		uneListe = new MyList();
		uneListeChainee = new LinkedList();
		listeEntiers1 = new ArrayList<Object>();
		listeEntiers2 = new ArrayList<Object>();
		
		listeEntiers1.add(10);
		listeEntiers1.add(25);
		listeEntiers1.add(4);
		listeEntiers1.add(1);
		listeEntiers1.add(1);
		listeEntiers1.add(2);
		
		listeEntiers2.add(1);
		listeEntiers2.add(1);
		listeEntiers2.add(5);
		listeEntiers2.add(5);
	}

	@After
	public void tearDown() throws Exception {
	}

	// ============== TESTS DE LA CLASSE LINKEDLIST ==============
	
	@Test
	public void test() {
		assertEquals(6, listeEntiers1.size());
	}

	// ============== TESTS DE LA CLASSE SETCALCULATOR ==============
	
}
