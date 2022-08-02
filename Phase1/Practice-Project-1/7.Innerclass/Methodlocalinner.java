package Innerclass;

public class Methodlocalinner {
	//outer class
	public void display()
	{
		//inner class
		class Inner{
			int a=90;
			void print()
			{
				System.out.println("Method of inner class\nvalue of a:" +a);
			}
		}
		//inner class object
		Inner inner=new Inner();
		inner.print();
		
	}
	public static void main(String args[])
	{
		//outer class object
		Methodlocalinner outer=new Methodlocalinner();
		outer.display();
	}

}
