package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArraylist {
	public static void main(String args[])
	{
		ArrayList<String> arraylist=new ArrayList<String>();
		//Default array size
		System.out.println("Default size:" +arraylist.size());
		
		//adding in arraylist
		arraylist.add("Bike");
		arraylist.add("Car");
		arraylist.add(null);
		arraylist.add("Cycle");
		arraylist.add("Bus");
		arraylist.add("Train");
		
		//print after adding arraylist size
		System.out.println("After adding elements:" +arraylist.size());
		
		//To display elements in arraylist
		System.out.println(arraylist);
		
		//Get a specific element using index
		System.out.println("Elements in 3:" +arraylist.get(3));
		
		//adding elements in arraylist
		arraylist.add("Flight");
		System.out.println(arraylist);
		
		//Check specific element is contain in arraylist
		System.out.println("List contains Car?:" +arraylist.contains("car"));
		System.out.println("List contains Car?:" +arraylist.contains("Car"));
		
		//TO remove an element in a list
		arraylist.remove(1);
		
		//To remove null
		arraylist.remove(null);
		
		System.out.println(arraylist);
		
		//iterate using for loop
		for(String S:arraylist)
		{
			System.out.println("For loop:" +S);
		
		}
		
		//iterate using iterator
		Iterator<String>itr=arraylist.iterator();
		while(itr.hasNext())
		{
			System.out.println("Iterator:" +itr.next());
					
		}	
		
	}

}
