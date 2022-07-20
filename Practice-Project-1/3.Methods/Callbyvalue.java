package Method1;

public class Callbyvalue {
	//Class level variable,access using this keyword
	int num=60;
	public void operation(int num)
	
	{
		this.num=(num*10);
		
	}
	public static void main(String args[])
	{
		Callbyvalue obj=new Callbyvalue();
		
		//Before Call
		System.out.println("Value of num Before call "+obj.num);
		//After Call
		obj.operation(90);
		System.out.println("Value of num After call "+obj.num);
				
		
		
		
	}
}
