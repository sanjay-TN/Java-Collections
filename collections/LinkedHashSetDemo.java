package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
//		LinkedHashSet <Integer> lset = new LinkedHashSet <Integer> (); // homogeneous data
		LinkedHashSet lhs = new LinkedHashSet(); // heterogeneous data
		
		lhs.add(22);
		lhs.add(332);
		lhs.add(23);
		System.out.println(lhs);
		
	}

}
