package Flux;
import reactor.core.publisher.Flux;
class BookRating{
	String bookId;
	double rating;
	String genre;
	
	BookRating(String bookId, double rating, String genre){
		this.bookId=bookId;
		this.rating=rating;
		this.bookId=bookId;
		
	}
	public String getbookId() {
		return bookId;
	}
	public double getrating() {
		return rating;
	}
	public String getgenre() {
		return genre;
	}
}
public class BookRatingProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flux<BookRating> bookRatingStream = rating("B1", 4.5, "Mystery", "B2", 3.0, "Romance", "B3", 5.0, "Mystery");
		bookRatingStream
        .filter(bookRating -> "Mystery".equals(bookRating.getgenre()))
        .map(bookRating -> new BookRating(bookRating.getbookId(), bookRating.getrating() * 2, bookRating.getgenre()))
        .subscribe(bookRating -> System.out.println("Book ID: " + bookRating.getbookId() + ", Doubled Rating: " + bookRating.getrating()));
	}
	static Flux<BookRating> rating(Object...objects){
		return Flux.create(emitter->{
			for(int i=0;i<objects.length;i+=3) {
				String bookId= (String)objects[i];
				double rating=(double) objects[i+1];
				String genre=(String) objects[i+2];
				emitter.next(new BookRating(bookId,rating,genre));
				
			}
			emitter.complete();
		});
	}

}
