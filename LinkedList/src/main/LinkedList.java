/**
 * @class			: LinkedList
 * @interface		: LinkedListInterface
 * @author	 		: Ons mlouki
 * 					  Ons.mlouki@gmail.com
 */
package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class LinkedList implements LinkedListInterface {

	public MyListInterface build(int op, ArrayList<Object> val1, ArrayList<Object> val2, boolean tri) throws IOException{


		StringBuilder chaineContent=new StringBuilder();

		MyListInterface list = new MyList();	

		list.add(val1);
		chaineContent.append("" + val1);

		list.add(val2);
		chaineContent.append(" " + val2);

		SetCalculatorInterface myCalculator= new SetCalculator();

		int i = 1;

		switch (op) {

		case 1:{
			list.add(myCalculator.union(list.getAt(i-1), list.getAt(i)));
			i++;
			chaineContent.append(" " + list.getAt(i)); 
		}; break;

		case 2:{
			list.add(myCalculator.intersection(list.getAt(i-1), list.getAt(i)));
			i++;
			chaineContent.append(" " + list.getAt(i)); 
		}; break;

		case 3:{
			list.add(myCalculator.difference(list.getAt(i-1), list.getAt(i)));
			i++;
			chaineContent.append(" " + list.getAt(i)); 
		}; break;

		case 4:{
			list.add(myCalculator.symDifference(list.getAt(i-1), list.getAt(i)));
			i++;
			chaineContent.append(" " + list.getAt(i));
		}; break;

		default:
			System.out.println("Unindentified operator " + op + ". Refer to «Operator.java» for the complete list of available operators");
			break;
		}
		
		ArrayList<Object> listeCourante = retirerDoublons(list, i);
		listeCourante = trier(listeCourante, tri);
		list.setAt(listeCourante, i);
		
		return list;
	}
	
	public ArrayList<Object> retirerDoublons(MyListInterface liste, int indice) {
		ArrayList<Object> listeCourante = liste.getAt(indice);
		Set<Object> unHashSet = new HashSet<Object>();
		
		unHashSet.addAll(listeCourante);
		listeCourante.clear();
		listeCourante.addAll(unHashSet);
		
		return listeCourante;
	}
	
	public ArrayList<Object> trier(ArrayList<Object> liste, boolean tri) {
	    Comparator<Object> comparateur = tri ? 
	    			new CompareObjectCroissant() :
	    			new CompareObjectDecroissant();
	    
	    liste.sort(comparateur);
	    
	    return liste;
	}
}
