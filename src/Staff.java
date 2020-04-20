public abstract class Staff implements Accountant{
	private String name;
	private String position;
	private int salaryPerDay;
	private int countOfWorkingDays;
	public int salaryOfEmployee;
	final boolean IS_EXPERIENCED = true;

	Staff() {

	}
	Staff(String name, String position, int salaryPerDay, int countOfWorkingDays) {
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

	public Staff setName(String name) {
		this.name = name;
		return this;
	}

	public Staff setPosition(String position) {
		this.position = position;
		return this;
	}

	public Staff setSalaryPerDay(int salaryPerDay) {
		this.salaryPerDay = salaryPerDay;
		return this;
	}

	public  Staff setCountOfWorkingDays(int countOfWorkingDays) {
		this.countOfWorkingDays = countOfWorkingDays;
		return this;
	}
	@Override
	public double countTheSalaryOfEmployee() {
		salaryOfEmployee = salaryPerDay * countOfWorkingDays;
		System.out.println(name + " is a " + position + ". Hi gets " + salaryOfEmployee + " euro per month.");
		return salaryOfEmployee;
	}
}
