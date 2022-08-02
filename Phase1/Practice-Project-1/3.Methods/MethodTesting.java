package Method1;

public class MethodTesting {
	public void show()
	{
		System.out.println("Method without return type and parameter ");
	}
	
	//with 1 parameter
	public void display(String name)
	{
		System.out.println("My name is"+name);
	}
	
	//method with return type and parameter
	public int cube(int n)
	{
		return n*n*n;
	}
	
    //method with two parameter
	public String fullname(String fname,String lname)
	{
	return fname+ " " +lname;
	
	}
	
	public static void main(String args[])
	{
		MethodTesting obj=new MethodTesting();
		obj.show();
		obj.display("Amar");
		int cube=obj.cube(5);
		System.out.println("Cube of 5 is:" +cube);
		String fullname=obj.fullname("amar","p");
		System.out.println("fullname is" +fullname);
	}
}
