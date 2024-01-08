package Com;

public class GreetingService {
	String message;
	
	 public void setMessage(String message) {
	        this.message = message;
	    }
	
	public void getReceive() {
		System.out.println("This is "+message);
	}

}
