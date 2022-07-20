package AnonymousInner;

public class AnonymousInner {

	public static void main(String[] args) {
		
		Car audiCustomModel= new Car() {
			public void start() {
				System.out.println("Special Implementaion of start");
			}
			public void stop() {
				System.out.println("Special implementation of stop");
			}
		};
		
		audiCustomModel.start();
		audiCustomModel.stop();
		
	}

}
