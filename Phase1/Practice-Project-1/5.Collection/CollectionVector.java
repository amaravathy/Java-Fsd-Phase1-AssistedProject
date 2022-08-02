package Collection;

import java.util.Vector;
import java.util.Iterator;

public class CollectionVector {
	public static void main(String args[])
	{
		Vector<String> vectorlist=new Vector<String>();
		//Default vector size
		System.out.println("Default size:" +vectorlist.size());
		
		//adding in vectorlist
		vectorlist.add("Bike");
		vectorlist.add("Car");
		vectorlist.add(null);
		vectorlist.add("Cycle");
		vectorlist.add("Bus");
		vectorlist.add("Train");
		
		//print after adding vectorlist size
		System.out.println("After adding elements:" +vectorlist.size());
		
		//To display elements in vectorlist
		System.out.println(vectorlist);
		
		//Get a specific element using index
		System.out.println("Elements in 3:" +vectorlist.get(3));
		
		//adding elements in vectorlist
		vectorlist.add("Flight");
		System.out.println(vectorlist);
		
		//Check specific element is contain in vectorlist
		System.out.println("List contains Car?:" +vectorlist.contains("car"));
		System.out.println("List contains Car?:" +vectorlist.contains("Car"));
		
		//TO remove an element in a list
		vectorlist.remove(1);
		
		//To remove null
		vectorlist.remove(null);
		
		System.out.println(vectorlist);
		
		//iterate using for loop
		for(String S:vectorlist)
		{
			System.out.println("For loop:" +S);
		
		}
		
		//iterate using iterator
		Iterator<String>itr=vectorlist.iterator();
		while(itr.hasNext())
		{
			System.out.println("Iterator:" +itr.next());
					
		}	
		
	}

}
