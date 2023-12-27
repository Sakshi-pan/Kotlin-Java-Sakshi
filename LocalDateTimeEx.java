package DateAndTime;
import java.time.*;
public class LocalDateTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now=LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime cust=LocalDateTime.of(2022, 4, 8, 16, 50);
		System.out.println(cust);
		LocalDateTime parse=LocalDateTime.parse("2022-04-08T16:53");
		System.out.println(parse);
		
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		System.out.println(hour+","+minute+","+second);
		
		LocalDateTime futureTime = now.plusHours(2);
		LocalDateTime pastTime = now.minusMinutes(15);
		System.out.println(futureTime);
		System.out.println(pastTime);
		
		LocalDateTime time1 = LocalDateTime.of(2023,4,8,16,40,25);
		LocalDateTime time2 = LocalDateTime.of(2023,4,8,16,40,25);

		boolean isBefore = time1.isBefore(time2);
		boolean isAfter = time1.isAfter(time2);
		boolean isEqual = time1.equals(time2);
		
		System.out.println(isBefore);
		System.out.println(isAfter);
		System.out.println(isEqual);

	}

}
