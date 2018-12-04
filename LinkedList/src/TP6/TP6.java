package TP6;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
		
		Set<Object> unHashSet = new HashSet<Object>(resultatUnion);
		assertTrue("Il ne devrait pas existe de valeurs dupliquees dans le tableau des resultats de l'union.", 
				resultatUnion.size() == unHashSet.size());
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
		
		Set<Object> unHashSet = new HashSet<Object>(resultatUnion);
		assertTrue("Il ne devrait pas existe de valeurs dupliquees dans le tableau des resultats de l'union.", 
				resultatUnion.size() == unHashSet.size());
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
		
		ArrayList<Object> resultatIntersection = resultat.getAt(2);
		assertTrue("Les valeurs du resultat de l'intersection devrait etre en ordre croissant.",
				resultatIntersection.get(0).hashCode() < resultatIntersection.get(resultatIntersection.size() - 1).hashCode());
		
		Set<Object> unHashSet = new HashSet<Object>(resultatIntersection);
		assertTrue("Il ne devrait pas existe de valeurs dupliquees dans le tableau des resultats de l'intersection.", 
				resultatIntersection.size() == unHashSet.size());
	}
	
	/**
	 * Classe : LinkedList
	 * Methode : build
	 * 		- Operator 	: INTERSECTION
	 * 		- Tri		: Decroissant
	 * La liste chainee devrait avoir des valeurs decroissantes.
	 */
	@Test
	public void test4() throws IOException {
		MyListInterface resultat = uneListeChainee.build(2, listeEntiers1, listeEntiers2, false);
		
		assertNotNull("Le resultat ne devrait pas etre null.", resultat);
		assertEquals("Le resultat devrait contenir trois tableaux.", 3, resultat.getSize());
		
		ArrayList<Object> resultatIntersection = resultat.getAt(2);
		assertTrue("Les valeurs du resultat de l'intersection devrait etre en ordre decroissant.",
				resultatIntersection.get(0).hashCode() > resultatIntersection.get(resultatIntersection.size() - 1).hashCode());
		
		Set<Object> unHashSet = new HashSet<Object>(resultatIntersection);
		assertTrue("Il ne devrait pas existe de valeurs dupliquees dans le tableau des resultats de l'intersection.", 
				resultatIntersection.size() == unHashSet.size());
	}
	
	/**
	 * Classe : LinkedList
	 * Methode : build
	 * 		- Operator 	: DIFFERENCE
	 * 		- Tri		: Croissant
	 * La liste chainee devrait avoir des valeurs croissantes.
	 */
	@Test
	public void test5() throws IOException {
		MyListInterface resultat = uneListeChainee.build(3, listeEntiers1, listeEntiers2, true);
		
		assertNotNull("Le resultat ne devrait pas etre null.", resultat);
		assertEquals("Le resultat devrait contenir trois tableaux.", 3, resultat.getSize());
		
		ArrayList<Object> resultatDifference = resultat.getAt(2);
		assertTrue("Les valeurs du resultat de la difference devrait etre en ordre croissant.",
				resultatDifference.get(0).hashCode() < resultatDifference.get(resultatDifference.size() - 1).hashCode());
		
		Set<Object> unHashSet = new HashSet<Object>(resultatDifference);
		assertTrue("Il ne devrait pas existe de valeurs dupliquees dans le tableau des resultats de la difference.", 
				resultatDifference.size() == unHashSet.size());
	}
	
	/**
	 * Classe : LinkedList
	 * Methode : build
	 * 		- Operator 	: DIFFERENCE
	 * 		- Tri		: Decroissant
	 * La liste chainee devrait avoir des valeurs decroissantes.
	 */
	@Test
	public void test6() throws IOException {
		MyListInterface resultat = uneListeChainee.build(3, listeEntiers1, listeEntiers2, false);
		
		assertNotNull("Le resultat ne devrait pas etre null.", resultat);
		assertEquals("Le resultat devrait contenir trois tableaux.", 3, resultat.getSize());
		
		ArrayList<Object> resultatDifference = resultat.getAt(2);
		assertTrue("Les valeurs du resultat de la difference devrait etre en ordre decroissant.",
				resultatDifference.get(0).hashCode() > resultatDifference.get(resultatDifference.size() - 1).hashCode());
		
		Set<Object> unHashSet = new HashSet<Object>(resultatDifference);
		assertTrue("Il ne devrait pas existe de valeurs dupliquees dans le tableau des resultats de la difference.", 
				resultatDifference.size() == unHashSet.size());
	}
	
	/**
	 * Classe : LinkedList
	 * Methode : build
	 * 		- Operator 	: SYMMETRIC_DIFFERENCE
	 * 		- Tri		: Croissant
	 * La liste chainee devrait avoir des valeurs croissantes.
	 */
	@Test
	public void test7() throws IOException {
		MyListInterface resultat = uneListeChainee.build(4, listeEntiers1, listeEntiers2, true);
		
		assertNotNull("Le resultat ne devrait pas etre null.", resultat);
		assertEquals("Le resultat devrait contenir trois tableaux.", 3, resultat.getSize());
		
		ArrayList<Object> resultatDifferenceSym = resultat.getAt(2);
		assertTrue("Les valeurs du resultat de la difference symetrique devrait etre en ordre croissant.",
				resultatDifferenceSym.get(0).hashCode() < resultatDifferenceSym.get(resultatDifferenceSym.size() - 1).hashCode());
		
		Set<Object> unHashSet = new HashSet<Object>(resultatDifferenceSym);
		assertTrue("Il ne devrait pas existe de valeurs dupliquees dans le tableau des resultats de la difference symetrique.", 
				resultatDifferenceSym.size() == unHashSet.size());
	}
	
	/**
	 * Classe : LinkedList
	 * Methode : build
	 * 		- Operator 	: SYMMETRIC_DIFFERENCE
	 * 		- Tri		: Decroissant
	 * La liste chainee devrait avoir des valeurs decroissantes.
	 */
	@Test
	public void test8() throws IOException {
		MyListInterface resultat = uneListeChainee.build(4, listeEntiers1, listeEntiers2, false);
		
		assertNotNull("Le resultat ne devrait pas etre null.", resultat);
		assertEquals("Le resultat devrait contenir trois tableaux.", 3, resultat.getSize());
		
		ArrayList<Object> resultatDifferenceSym = resultat.getAt(2);
		assertTrue("Les valeurs du resultat de la difference symetrique devrait etre en ordre decroissant.",
				resultatDifferenceSym.get(0).hashCode() > resultatDifferenceSym.get(resultatDifferenceSym.size() - 1).hashCode());
		
		Set<Object> unHashSet = new HashSet<Object>(resultatDifferenceSym);
		assertTrue("Il ne devrait pas existe de valeurs dupliquees dans le tableau des resultats de la difference symetrique.", 
				resultatDifferenceSym.size() == unHashSet.size());
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
	
	/**
	 * Les tests ci-haut couvrent l'entierete de la classe LinkedList.
	 * C'est-a-dire que par les tests de la fonction build, les methodes retirerDoublons et trier
	 * sont egalement testees.
	 */

	// ============== TESTS DE LA CLASSE SETCALCULATOR ==============
	
//	StringBuilder stringContent = new StringBuilder();
//	
//	for(int i = 0; i < resultat.getSize(); i++){
//		stringContent.append(" " + resultat.getAt(i));
//	}	
//	
//	System.out.println("My List : " + stringContent);
}
