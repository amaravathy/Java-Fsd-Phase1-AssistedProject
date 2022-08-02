package Collection;

import java.util.LinkedList;
import java.util.Iterator;

public class Colleclinkedlist {
	public static void main(String args[])
	{
	LinkedList<String> linkedlist=new LinkedList<String>();
	//Default linked size
	System.out.println("Default size:" +linkedlist.size());
	
	//adding in linkedlist
	linkedlist.add("Bike");
	linkedlist.add("Car");
	linkedlist.add(null);
	linkedlist.add("Cycle");
	linkedlist.add("Bus");
	linkedlist.add("Train");
	
	//print after adding linkedlist size
	System.out.println("After adding elements:" +linkedlist.size());
	
	//To display elements in linkedlist
	System.out.println(linkedlist);
	
	//Get a specific element using index
	System.out.println("Elements in 3:" +linkedlist.get(3));
	
	//adding elements in linkedlist
	linkedlist.add("Flight");
	System.out.println(linkedlist);
	
	linkedlist.add(3,"Helicopter");
	System.out.println(linkedlist);
	
	//Check specific element is contain in linkedlist
	System.out.println("First element:" +linkedlist.getFirst());
	System.out.println("Last element:" +linkedlist.getLast());
	
	//TO remove an element in a list
	linkedlist.remove(1);
	
	//To remove null
	linkedlist.remove(null);
	
	System.out.println(linkedlist);
	
	//iterate using for loop
	for(String S:linkedlist)
	{
		System.out.println("For loop:" +S);
	
	}
	
	//iterate using iterator
	Iterator<String>itr=linkedlist.iterator();
	while(itr.hasNext())
	{
		System.out.println("Iterator:" +itr.next());
				
	}	
	
}

}
