package Exceptionhandling;

public class Customexception extends Exception {
	private String msg;

	public Customexception(String msg) {
		 
		this.msg = msg;
		
	}

	@Override
	public String toString() {
		return "AgeNotValidExecption [message=" + msg + "]";

}
}
