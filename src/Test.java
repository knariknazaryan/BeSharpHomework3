public class Test {
	Weekday weekday;

	public Test (Weekday weekday) {
		this.weekday = weekday;
	}

	public void nameTheDay(Weekday weekday) {
		switch (weekday) {
			case MONDAY:
				System.out.println("Today is Monday");
				break;
			case TUESDAY:
				System.out.println("Today is Tuesday");
				break;
			case WEDNESDAY:
				System.out.println("Today is Wednesday");
				break;
			case THURSDAY:
				System.out.println("Today is Thursday");
				break;
			case SATURDAY:
				System.out.println("Today is Saturday");
				break;
			case SUNDAY:
				System.out.println("Today is Sunday");
				break;
				default:
					System.out.println("I don't know what the day is today");
					break;
		}
	}

	public static void main(String[] args) {
		Test firstDay = new Test(Weekday.MONDAY);


		firstDay.nameTheDay(Weekday.MONDAY);
		firstDay.nameTheDay(Weekday.SUNDAY);



	}
}