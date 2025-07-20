package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//HashMap is derived from Map interface 

/*
 * data is stored in form of key-value pairs
 * key is unique. but we can have duplicate values.
 * Insertion order not preserved(Index not followed)
 */
public class HashMaps {

	public static void main(String[] args) {
//		declaration
		HashMap <Integer,String> hm=new HashMap <Integer,String>();
//		Map hm = new HashMap();
//		HashMap hm = new HashMap();
		
		
//		adding pairs--[duplicates will be automatically removed(if we added)]
		hm.put(1, "john");
		hm.put(2, "sam");
		hm.put(3,"gds");
		hm.put(3, "dss");
		System.out.println(hm);  //{1=john, 2=sam, 3=dss}
		
//		size
		System.out.println("size :"+ hm.size());
		
		
//		remove one pair
		hm.remove(2);
		System.out.println("after removing: "+hm);  //after removing: {1=john, 3=dss}
		
//		access value of key
		System.out.println(hm.get(3));
		
//		getting all keys from hashmap
		System.out.println(hm.keySet()); //[1, 3]
		
//		getting all values 
		System.out.println(hm.values());   //[john, dss]
		
//		to print keys along with values
		System.out.println(hm.entrySet());  //[1=john, 3=dss]
		
//		reading data from hashmap
//		using for each[enhanced for loop]
		for(int k:hm.keySet())
		{
			System.out.println(k+" "+hm.get(k));
		}
		
//		using iterator
		Iterator <Entry<Integer, String>> it = hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry <Integer,String> entry = it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
//		clear all
		hm.clear();
		System.out.println(hm.isEmpty());

	}

}
