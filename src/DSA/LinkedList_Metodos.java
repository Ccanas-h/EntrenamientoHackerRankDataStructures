package DSA;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Metodos {

	public static void main(String[] args) {
		int cinco = 0;
		LinkedList<Integer> linky = new LinkedList<Integer>();
		
		linky.add(13);
		linky.add(5);
		linky.add(1231231231);
		
		
		System.out.println(linky.get(2));

		Iterator it = linky.iterator();
		
		while (it.hasNext()) {
			if ((int) it.next() == 5) { //Hay que castearlo porque .next() return an Object, and
										// 5 es un int. 
				cinco = (int) it.next(); 
				System.out.println("We found= "+cinco); //Fijarse que aqui guardo el siguiente. 
			}
		}
	}

}
