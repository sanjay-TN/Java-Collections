package collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable <Integer,String> hs = new Hashtable(); // capacity 11, load factor 0.75%
		hs.put(1, "sa");
		hs.put(2, "e");
		hs.put(3, "r");
		hs.put(4, "san");
//		hs.put(null, "sr"); // not allowed
//		hs.put(5, null); // not allowed
		System.out.println(hs);
		
//		getting value
		System.out.println(hs.get(1));
		
//		removing value
		System.out.println(hs.remove(1));
		System.out.println("after removing 1:"+hs);
		
//		conatins
		System.out.println(hs.contains(1)); //false
		System.out.println(hs.containsKey(1));//false
		System.out.println(hs.containsValue("sa"));//false
		
//		isEmpty()
		System.out.println(hs.isEmpty()); // false
		
//		getting all keys
		System.out.println(hs.keySet());
		
//		getting all values
		System.out.println(hs.values());
		
//		getting key along values
		System.out.println(hs.entrySet());
		
//		printing all data using loop
//		for(int k:hs.keySet())
//		{
//			System.out.println(k+"  "+hs.get(k));
//		}
		
		
//		printing all data using EntrySet
		for(Map.Entry  entry : hs.entrySet())
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
	}

}
