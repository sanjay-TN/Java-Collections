package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//ArrayList -- it is a class which implemented list interface
//-----
//1-Heterogeneous data --allowed[objects type data]
//2-insertion order -----preserved(index)[maintains same order]
//3-duplicate elements --allowed
//4-multiple nulls ------allowed


public class ArrayListDemo {

	public static void main(String[] args) {
		// Declaration 
		
//		ArrayList mylist=new ArrayList(); heterogeneous data 
//		List mylist=new ArrayList(); heterogeneous data
		  
		
//		if we want to store homogenious data in arraylist, we have to use wrapper class
//		ArrayList<Integer> myList=new ArrayList<Integer>(); // stores only integer values
		
//		adding data into arraylist[.add]
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add('a');
		al.add("ssd");
		al.add(null);
		
		// to find the size of arraylist[.size()]
		System.out.println(al.size());
		
		
		//to print values
		System.out.println(al);
		
		
		// to remove element from arraylist[give index element]
		System.out.println(al.remove(1));
		System.out.println("after removing:"+al);
		
		
		// to insert element in the middle [add(position,value)]
		al.add(1,400);
		System.out.println("after insertion"+al);
		
		
		// modify element  [.set(index,value to be replaced)]
		al.set(1,"java");
		System.out.println("after replacing"+al);
		
		
		// retrive/access specific element
		System.out.println("third element is:"+al.get(3));
		
		//checking arraylist is empty or false
		System.out.println(al.isEmpty());
		
	
		
		
		
		// reading data
/*		 1)using for loop
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		2)using enhanced for loop or for each loop
		for(Object x:al)
		{
			System.out.println(x);
		}
*/		
//		3)using iterator---supported for all kinds of collections  [if we used iterator method, use while loop]
//		---use a Iterator variable 
		Iterator <Object> i =al.iterator();
//		if collection contain only integer values then,  Iterator<Integer> i =al.iterator();
		while(i.hasNext())
		{
			System.out.println("after iteration:"+i.next());
		}
		
		// remove all elements from arraylist
//		first create a new list then, add the elements to the new list that u want to delete from another list.
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add("java");
		al.removeAll(al1);
		System.out.println("after removeAll:"+al);
		
		// remove all elements[clear]
		al.clear();
		System.err.println("after clearing:"+al.isEmpty());

		
		
	}

}
