public  class AccountantEmployee extends Employee {

	private static AccountantEmployee myAccountant;

	private AccountantEmployee() {

	}

	synchronized public static AccountantEmployee getMyAccountant() {
		if (myAccountant != null) {
			myAccountant = new AccountantEmployee();
		}
		return myAccountant;
	}

//	Weekday weekday;
//
//	public AccountantEmployee (Weekday weekday) {
//		this.weekday = weekday;
//	}

//	public void countTheSalary (Weekday weekday) {
//		switch (weekday) {
//			case MONDAY:
//				salaryOfEmployee = salaryPerDay;
//				System.out.println("Your salary for this week is " + salaryOfEmployee);
//				break;
//			case TUESDAY:
//				salaryOfEmployee = salaryPerDay*2;
//				System.out.println("Your salary for this week is " + salaryOfEmployee);
//				break;
//			case WEDNESDAY:
//				salaryOfEmployee = salaryPerDay*3;
//				System.out.println("Your salary for this week is " + salaryOfEmployee);
//				break;
//			case THURSDAY:
//				salaryOfEmployee = salaryPerDay*4;
//				System.out.println("Your salary for this week is " + salaryOfEmployee);
//				break;
//			case FRIDAY:
//				salaryOfEmployee = salaryPerDay*5;
//				System.out.println("Your salary for this week is " + salaryOfEmployee);
//				break;
//			case SUNDAY: case SATURDAY:
//				System.out.println("Today is non working day, Enjoy your weekend");
//				default:
//					System.out.println("sorry? I don't know what to say");
//					break;
//		}
//	}


}