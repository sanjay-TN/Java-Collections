package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
//		declaring
//		LinkedList l = new LinkedList();  // store heterogeneus data
//		LinkedList <Integer> l = new LinkedList <Integer>(); // stores only homogeneous [integer] data
		
		LinkedList l = new LinkedList();
//		add elements to list
		l.add(100);
		l.add("s");
		l.add('d');
		System.out.println(l);
		
//		find size
		System.out.println(l.size());
		
//		removing objects[use index ]
		l.remove(2);
		System.out.println("after removing:"+l);
		
//		to insert element
		l.add(2, "sa");
		System.out.println("after inserting element:"+l);
		
//		Retrieving value
		System.out.println(l.get(2));
		
// 		change the value
		l.set(2, "adf");
		System.out.println("after changing:"+l);
		
//		l.contains(value);
//		l.isEmpty();
//		l.clear();
		
//		reading elements using for loop
//		for(int i=0;i<l.size();i++)
//		{
//			System.out.println(l.get(i));
//		}
		
//		using for each loop
//		for(Object e:l)
//		{
//			System.out.println(e);
//		}
		
//		using iterator()
//		Iterator i =  l.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
//		adding multiple objects to linkedlist
		LinkedList l1 = new LinkedList();
		l1.addAll(l);
		System.out.println("after adding l to l1: "+l1);
		
//		removing all objects
		l1.removeAll(l);
		System.out.println("after removing from l1:"+l1);
		
//		first element,last element
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
	}

}
