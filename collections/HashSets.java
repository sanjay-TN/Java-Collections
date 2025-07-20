package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.List;

//HashSet -- a class implemented set interface.[it will automatically remove duplicates]

//	1)Heterogeneous data -- allowed
//	2)Insertion Order -- Not preserved(index not supported)
//	3)duplicate elements -- not allowed
//	4)Multiple nulls -- not allowed [only single nulls are allowed]

public class HashSets {

	public static void main(String[] args) {
//	declarations
		HashSet myhash= new HashSet();  // heterogeneous data 
//		Set myhash = new HashSet();    heterogeneous data
		
//		adding elements to hashsets [.add].
//		[it will automatically remove duplicates]
		myhash.add("a100");
		myhash.add("a100");
		myhash.add("a1000");
		myhash.add("a");
		myhash.add("a");
		myhash.add(null);
		myhash.add(null);
		System.out.println(myhash); //[null, a, a100, a1000]
		
//		Remove specific value from the hashset
		myhash.remove("a100");
		System.out.println("after removing"+myhash);
		
//		find the size of hashset
		System.out.println(myhash.size());
		
//		to print values
		System.out.println(myhash);
		
		
//		Insertion is not possible
		
//		retreiving / accessing specific element not possible but after convert it to set list, we can access elements.
		ArrayList al = new ArrayList(myhash);
		System.out.println(al);
		
		al.add(1,34);
		System.out.println(al);
		
//		Read all the elements using enhanced for loop
		for(Object h:myhash)
		{
			System.out.println("printing:"+h);
		}
		
//		using iterator
		Iterator <Object> i = myhash.iterator();
		while(i.hasNext())
				{
					System.out.println("iterating:"+i.next());
				}
		
//		clearing all the elements
		myhash.clear();
		System.out.println(myhash.isEmpty());
		
		
//		other set methods union[set1.addAll(set2)],intersection[set1.retainAll(set2)],difference[set1.removeAll(set2)].
	}

}
