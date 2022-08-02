package Innerclass;

public class MainMethodouter {
	//Outer class
		int a=45;
		String b="Hai";
		//inner class
		class Inner
		{
			public void display()
			{
				System.out.println("Value of a:  " +a);
				System.out.println("Value of b:  " +b);
			}
		}
	
	public static void main(String args[])
	{
		//access inner class from main method
		MainMethodouter outer=new MainMethodouter();
		MainMethodouter.Inner inner = outer.new Inner();
		inner.display();
	}

}
