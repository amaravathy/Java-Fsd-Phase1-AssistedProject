package Collection;

import java.util. *;


public class CollectionPriorityqueue {
	public static void main(String args[])
	{
	PriorityQueue <Integer> pqueue=new PriorityQueue<Integer>();
	
	//adding in priorityqueue
	pqueue.add(10);
	pqueue.add(23);
	pqueue.add(89);
	pqueue.add(78);
	pqueue.add(98);
	pqueue.add(34);
	
	//print after adding linkedlist size
	System.out.println(pqueue);
	
	//print the top element of priority queue
	System.out.println("Top element:" +pqueue.peek());
	System.out.println(pqueue);
	
	//printing the top element and removing
	System.out.println("printing top element and removing " +pqueue.poll());
	System.out.println(pqueue);
	
	//removing particular value
	pqueue.remove(34);
	System.out.println(pqueue);
	
	//iterate using for loop
		for(int S:pqueue)
		{
			System.out.println("For loop:" +S);
		
		}
		
		//iterate using iterator
		Iterator<Integer>itr=pqueue.iterator();
		while(itr.hasNext())
		{
			System.out.println("Iterator:" +itr.next());
					
		}
	}

}
