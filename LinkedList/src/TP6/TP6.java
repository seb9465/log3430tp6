package TP6;

import static org.junit.Assert.*;

import java.io.IOException;
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
		listeEntiers1.add(5);
		
		listeEntiers2.add(1);
		listeEntiers2.add(1);
		listeEntiers2.add(5);
		listeEntiers2.add(5);
	}

	@After
	public void tearDown() throws Exception {
	}

	// ============== TESTS DE LA CLASSE LINKEDLIST ==============
	
	/**
	 * Classe : LinkedList
	 * Methode : build
	 * 		- Operator 	: UNION
	 * 		- Tri		: Croissant
	 * La liste chainee devrait avoir des valeurs croissantes.
	 */
	@Test
	public void test1() throws IOException {
		MyListInterface resultat = uneListeChainee.build(1, listeEntiers1, listeEntiers2, true);
		
		assertNotNull("Le resultat ne devrait pas etre null.", resultat);
		assertEquals("Le resultat devrait contenir trois tableaux.", 3, resultat.getSize());
		
		ArrayList<Object> resultatUnion = resultat.getAt(2);
		assertTrue("Les valeurs du resultat de l'union devrait etre en ordre croissant.", resultatUnion.get(0).hashCode() < resultatUnion.get(resultatUnion.size() - 1).hashCode());
	}
	
	/**
	 * Classe : LinkedList
	 * Methode : build
	 * 		- Operator 	: UNION
	 * 		- Tri		: Decroissant
	 * La liste chainee devrait avoir des valeurs decroissantes.
	 */
	@Test
	public void test2() throws IOException {
		MyListInterface resultat = uneListeChainee.build(1, listeEntiers1, listeEntiers2, false);
		
		assertNotNull("Le resultat ne devrait pas etre null.", resultat);
		assertEquals("Le resultat devrait contenir trois tableaux.", 3, resultat.getSize());
		
		ArrayList<Object> resultatUnion = resultat.getAt(2);
		assertTrue("Les valeurs du resultat de l'union devrait etre en ordre decroissant.", resultatUnion.get(0).hashCode() > resultatUnion.get(resultatUnion.size() - 1).hashCode());
	}
	
	/**
	 * Classe : LinkedList
	 * Methode : build
	 * 		- Operator 	: INTERSECTION
	 * 		- Tri		: Croissant
	 * La liste chainee devrait avoir des valeurs croissantes.
	 */
	@Test
	public void test3() throws IOException {
		MyListInterface resultat = uneListeChainee.build(2, listeEntiers1, listeEntiers2, true);
		
		assertNotNull("Le resultat ne devrait pas etre null.", resultat);
		assertEquals("Le resultat devrait contenir trois tableaux.", 3, resultat.getSize());
		
		ArrayList<Object> resultatUnion = resultat.getAt(2);
		assertTrue("Les valeurs du resultat de l'union devrait etre en ordre croissant.", resultatUnion.get(0).hashCode() < resultatUnion.get(resultatUnion.size() - 1).hashCode());
	}
	
	
	
	/**
	 * Classe : LinkedList
	 * Methode : build
	 * 		- Operator 	: IS_SUBSET
	 * 		- Tri		: Croissant
	 * La liste chainee devrait n'avoir aucune donnees concernant l'operateur.
	 */
	@Test()
	public void test9() throws IOException {
		MyListInterface resultat = uneListeChainee.build(5, listeEntiers1, listeEntiers2, true);

		assertEquals("Le resultat devrait contenir deux tableaux puisque l'operateur n'existe pas.", 2, resultat.getSize());
	}
	
	/**
	 * Classe : LinkedList
	 * Methode : build
	 * 		- Operator 	: IS_SUBSET
	 * 		- Tri		: Decroissant
	 * La liste chainee devrait n'avoir aucune donnees concernant l'operateur.
	 */
	@Test()
	public void test10() throws IOException {
		MyListInterface resultat = uneListeChainee.build(5, listeEntiers1, listeEntiers2, false);

		assertEquals("Le resultat devrait contenir deux tableaux puisque l'operateur n'existe pas.", 2, resultat.getSize());
	}
	
	/**
	 * Classe : LinkedList
	 * Methode : build
	 * 		- Operator 	: IS_SUPERSET
	 * 		- Tri		: Croissant
	 * La liste chainee devrait n'avoir aucune donnees concernant l'operateur.
	 */
	@Test()
	public void test11() throws IOException {
		MyListInterface resultat = uneListeChainee.build(6, listeEntiers1, listeEntiers2, true);

		assertEquals("Le resultat devrait contenir deux tableaux puisque l'operateur n'existe pas.", 2, resultat.getSize());
	}
	
	/**
	 * Classe : LinkedList
	 * Methode : build
	 * 		- Operator 	: IS_SUPERSET
	 * 		- Tri		: Decroissant
	 * La liste chainee devrait n'avoir aucune donnees concernant l'operateur.
	 */
	@Test()
	public void test12() throws IOException {
		MyListInterface resultat = uneListeChainee.build(6, listeEntiers1, listeEntiers2, false);

		assertEquals("Le resultat devrait contenir deux tableaux puisque l'operateur n'existe pas.", 2, resultat.getSize());
	}
	
//	StringBuilder stringContent = new StringBuilder();
//	
//	for(int i = 0; i < resultat.getSize(); i++){
//		stringContent.append(" " + resultat.getAt(i));
//	}	
//	
//	System.out.println("My List : " + stringContent);

	// ============== TESTS DE LA CLASSE SETCALCULATOR ==============
	
}
