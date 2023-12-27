package DateAndTime;
import java.time.LocalDate;
public class LocalDateEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//current date
		LocalDate now= LocalDate.now();
		System.out.println(now);
		
		//custom object
		LocalDate myDate=LocalDate.of(2023, 12, 4);
		System.out.println(myDate);
		
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getMonth());
		System.out.println(now.getYear());
		//in int it return
		System.out.println(now.getMonthValue());
		
		LocalDate yesterday= now.minusDays(1);
		System.out.println(yesterday);
		
		LocalDate prevMonth=now.minusMonths(2);
		System.out.println(prevMonth);
		
		if(now.isBefore(yesterday)) {
			System.out.println("Yes it is");
		}else {
			System.out.println("No it is not");
		}
		
		//parseDate
		LocalDate parsedDate = LocalDate.parse("2023-01-15");
		System.out.println(parsedDate);
		
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getDayOfYear());
		
		LocalDate futureDate = now.plusDays(7);
		System.out.println(futureDate);
		
		
	}

}
 