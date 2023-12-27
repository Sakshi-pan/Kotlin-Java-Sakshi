package DateAndTime;
import java.time.LocalTime;
public class LocalTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime now=LocalTime.now();
		System.out.println(now);
		LocalTime cust=LocalTime.of(14, 20,50);
		System.out.println(cust);
		LocalTime parse=LocalTime.parse("15:05:25");
		System.out.println(parse);
		
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		System.out.println(hour+","+minute+","+second);
		
		LocalTime futureTime = now.plusHours(2);
		LocalTime pastTime = now.minusMinutes(15);
		System.out.println(futureTime);
		System.out.println(pastTime);
		
		LocalTime time1 = LocalTime.of(10, 30);
		LocalTime time2 = LocalTime.of(12, 15);

		boolean isBefore = time1.isBefore(time2);
		boolean isAfter = time1.isAfter(time2);
		boolean isEqual = time1.equals(time2);
		
		System.out.println(isBefore);
		System.out.println(isAfter);
		System.out.println(isEqual);



	}

}
