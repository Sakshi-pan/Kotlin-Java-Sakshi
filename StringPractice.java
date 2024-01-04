package PracticeQuestion;
import io.reactivex.rxjava3.core.Observable;
public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observable<String> str=Observable.just("Sakshi","Pandey","Ayush","Sam");
		str.map(x->x.length()).sorted().subscribe(System.out::println);

	}

}
