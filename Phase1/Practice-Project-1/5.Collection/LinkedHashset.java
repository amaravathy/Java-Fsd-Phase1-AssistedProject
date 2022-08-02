package Collection;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashset {
	public static void main(String args[])
	{
	LinkedHashSet <Integer> linkedhashset=new LinkedHashSet<Integer>();
	
	//adding in linkedhashset
	linkedhashset.add(10);
	linkedhashset.add(34);
	linkedhashset.add(89);
	linkedhashset.add(78);
	linkedhashset.add(98);
	linkedhashset.add(34);
	linkedhashset.add(null);
	linkedhashset.add(34);//do not allow duplicate value
	
	//print after adding linkedhashset size
    System.out.println("After adding elements:" +linkedhashset.size());
    
	//print after adding linkedhashset size
	System.out.println(linkedhashset);
	
	//removing null
	linkedhashset.remove(null);
	System.out.println(linkedhashset);
	
	//check using contain
	System.out.println("it contains 34?" +linkedhashset.contains(34));
	
	//iterate using for loop
		for(int S:linkedhashset)
		{
			System.out.println("For loop:" +S);
		
		}
		
		//iterate using iterator
		Iterator<Integer>itr=linkedhashset.iterator();
		while(itr.hasNext())
		{
			System.out.println("Iterator:" +itr.next());
					
		}
	
	}
}
