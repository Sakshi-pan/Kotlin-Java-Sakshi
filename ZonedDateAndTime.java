package DateAndTime;
import java.time.*;
import java.util.Set;
public class ZonedDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime now=ZonedDateTime.now();
		System.out.println(now);
		Set<String> available=ZoneId.getAvailableZoneIds();
		System.out.println(available);
	}

}
