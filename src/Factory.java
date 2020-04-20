public abstract class Factory implements Accountant{
	private String departamentName;

	Factory() {

	}
	Factory(String departamentName) {
		this.departamentName = departamentName;
	}

	public String getDepartamentName() {
		return departamentName;
	}

	public String setDepartamentName(String departamentName) {
		this.departamentName = departamentName;
		return departamentName;
	}
}
