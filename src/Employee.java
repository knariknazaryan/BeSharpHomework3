public abstract class Employee implements Staff{
	private String name;
	private int salaryPerDay;
	private int workingDays;

	Employee() {

	}
	Employee(String  name, int salaryPerDay, int workingDays) {
		this.name = name;
		this.salaryPerDay = salaryPerDay;
		this.workingDays = workingDays;
	}

	public int getSalaryPerDay() {
		return salaryPerDay;
	}

	public String getName() {
		return name;
	}

	public int getWorkingDays() {
		return workingDays;
	}

	public void setSalaryPerDay(int salaryPerDay) {
		this.salaryPerDay = salaryPerDay;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWorkingDays(int workingDays) {
		this.workingDays = workingDays;
	}

	@Override
	public void greatingClients() {
		System.out.println("Hi, my name is " + name + ". I'm consultant. I'l be happy to help you.");
	}
}
