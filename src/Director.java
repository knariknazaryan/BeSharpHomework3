public abstract class Director implements Staff {
	private String name;
	private int salaryPerDay;
	private int countOfWorkingDays;

	Director() {

	}
	Director(String name, int salaryPerDay, int countOfWorkingDays){
		this.name = name;
		this.salaryPerDay = salaryPerDay;
		this.countOfWorkingDays = countOfWorkingDays;
	}

	public int getCountOfWorkingDays() {
		return countOfWorkingDays;
	}

	public String getName() {
		return name;
	}

	public int getSalaryPerDay() {
		return salaryPerDay;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCountOfWorkingDays(int countOfWorkingDays) {
		this.countOfWorkingDays = countOfWorkingDays;
	}

	public void setSalaryPerDay(int salaryPerDay) {
		this.salaryPerDay = salaryPerDay;
	}

	@Override
	public void greatingClients() {
		System.out.println("Hi, my name is " + name + ". I'm the director. Can I help you?");
	}
}
