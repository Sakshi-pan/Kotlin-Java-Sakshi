package Java8;
import java.util.stream.IntStream;
public class ImperativeVsDeclareative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Imperative or normal style of coding
		int evenSum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				evenSum+=i;
			}
		}
		System.out.println(evenSum);
		int evenOfSum = IntStream.rangeClosed(0, 100)
	            .filter(i -> i % 2 == 0)
	            .reduce((x, y) -> x + y)
	            .getAsInt();
	    System.out.println("Declarative Sum: " + evenOfSum);

	}
	//Declarative or Functional
	
	

}
