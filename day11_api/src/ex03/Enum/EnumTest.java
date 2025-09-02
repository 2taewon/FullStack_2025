package ex03.Enum;

enum Day{
	SUNDAY, MONDAY,TUESDAY,WEDNESDAY,
	THURSDAY,FRIDAY,SATERDAY
}
public class EnumTest {
	Day day;
	
	public EnumTest(Day day) {
		this.day = day;
	}
	public void tell() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays ar bad.");
			break;
		case FRIDAY:
			System.out.println("FRIDAY ar Good.");
			break;
		case SATERDAY:
			System.out.println("SATERDAY ar best.");
			break;

		default:
			System.out.println("Midweek days are so-so");
			break;
		}
	}
	public static void main(String[] args) {
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tell();
	}
}