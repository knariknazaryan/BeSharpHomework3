public  class Employee implements Accountant {
	private String name;
	private String position;
	public int salaryPerDay;
	private int countOfWorkingDays;
	public int salaryOfEmployee;
	final boolean IS_EXPERIENCED = true;
	Weekday weekday;

	Employee() {

	}
	Employee(String name, String position, int salaryPerDay, int countOfWorkingDays) {
		this.name = name;
		this.position = position;
		this.salaryPerDay = salaryPerDay;
		this.countOfWorkingDays = countOfWorkingDays;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public int getSalaryPerDay() {
		return salaryPerDay;
	}

	public int getCountOfWorkingDays() {
		return countOfWorkingDays;
	}

	public Employee setName(String name) {
		this.name = name;
		return this;
	}

	public Employee setPosition(String position) {
		this.position = position;
		return this;
	}

	public Employee setSalaryPerDay(int salaryPerDay) {
		this.salaryPerDay = salaryPerDay;
		return this;
	}

	public Employee setCountOfWorkingDays(int countOfWorkingDays) {
		this.countOfWorkingDays = countOfWorkingDays;
		return this;
	}


	public Employee (Weekday weekday){
		this.weekday = weekday;
	}
	public void goToWork(Weekday weekday) {
		switch (weekday) {
			case MONDAY:
				System.out.println("It's Monday, I'm going to the Store");
				break;
			case TUESDAY:
				System.out.println("It's Tuesday, I'm going to the Store");
				break;
			case WEDNESDAY:
				System.out.println("It's Wednesday, I'm going to the Store");
				break;
			case THURSDAY:
				System.out.println("It's Thursday, I'm going to the Store");
				break;
			case FRIDAY:
				System.out.println("It's Friday, I'm going to the Store");
				break;
			case SATURDAY:
				System.out.println("Cool, today I'm free. It's time to relax");
				break;
			case SUNDAY:
				System.out.println("Oh, no. Tomorrow is Monday");
				break;
				default:
					System.out.println("What the day is it?");
					break;
		}
	}

	@Override
	public double countTheSalaryOfEmployee() {
		salaryOfEmployee = salaryPerDay * countOfWorkingDays;
		System.out.println(name + " is a " + position + ". Hi gets " + salaryOfEmployee + " euro per month.");
		return salaryOfEmployee;
	}

	@Override
	public double countTheNumberOfProducedItems() {
		return 0;
	}

	@Override
	public double countTheCostOfSoldItems() {
		return 0;
	}

	@Override
	public double countThePriceOfSoldItems() {
		return 0;
	}

	@Override
	public double countTheProfit() {
		return 0;
	}
}
