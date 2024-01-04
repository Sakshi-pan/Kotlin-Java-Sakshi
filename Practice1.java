package PracticeQuestion;
import io.reactivex.rxjava3.core.Observable;
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observable<Integer> number=Observable.range(1,20);
		number.filter(n->n%2==0).map(x->x*x).reduce((a,b)->a+b).subscribe(
				result->System.out.println(result),
				throwable->System.out.println("Error occured"+throwable),
				()->System.out.println("Process completed")
				);
		

	}

}
