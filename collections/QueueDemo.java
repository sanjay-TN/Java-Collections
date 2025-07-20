package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue(); // only homogeneous data is allowed in PriorityQueue.
		
//		adding elements
		pq.add(1);
		pq.add(1);
		pq.add(33);
		pq.add(34);
//		pq.add('f'); not allowed 
		pq.offer(44);
		System.out.println(pq); //insertion order is preserved , duplication allowed.
		
//		getting head element from queue
		System.out.println(pq.element()); // [ if queue is empty then it will throws exception]
		System.out.println(pq.peek()); //[ if queue is empty then it will return null]
		
		Queue q= new PriorityQueue();
//		System.out.println(q.element()); raise exception 
		System.out.println(q.peek()); // return null
		
		
//		return and remove head element from queue
		System.out.println(pq.remove()); // return head and remove head element [queue empty = exception]
		System.out.println("after removing from queue:"+pq);
		System.out.println(pq.poll()); //return head and remove head element [queue empty = null]
		System.out.println(("after using poll():"+pq));
	
//		remove and roll() for empty queue
//		System.out.println(q.remove()); // throws exception
		System.out.println(q.poll()); // return null
		
//		read all methods from queue
//		Iterator itr = pq.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
//		using for each loop
		for(Object o:pq)
		{
			System.out.println(o);
		}
		
		LinkedList ll = new LinkedList();
		ll.add('s');
		ll.add(22);
		ll.add(22);
		ll.add("d");
		System.out.println("linked list:"+ll);
		System.out.println(ll.element()); // return head element 
		System.out.println(ll.peek()); // return head element 
		System.out.println(ll.remove()); // return head element  and remove head element
		System.out.println(ll.poll()); //return head element and remove head element
	
		/*
		LinkedList l1=new LinkedList();
		System.out.println(l1.element()); // raise exception 
		System.out.println(l1.peek()); // return null
		System.out.println(l1.remove()); // raise exception
		System.out.println(l1.poll()); // return null
		*/
		
//		read all elements
		
//		Iterator i1 = ll.iterator();
//		while(i1.hasNext())
//		{
//			System.out.println(i1.next());
//		}
		
//		using for each loop
		for(Object o1:ll)
		{
			System.out.println(o1);
		}
		
	}

}
