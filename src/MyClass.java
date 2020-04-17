public class MyClass {
	public static void main(String[] args) {
		Employee lissie = new Employee("Lissie", 20, 15) {
			@Override
			public void greatingClients() {
				super.greatingClients();
			}
		};
		Director john = new Director("John", 40, 24) {
			@Override
			public void greatingClients() {
				super.greatingClients();
			}
		};
		Sweater blueSweater = new Sweater(true, "blue", "spring", 23, 35, 13){
			@Override
			public int getCountOfSold() {
				return super.getCountOfSold();
			}
		};


		lissie.greatingClients();
		john.greatingClients();



	}
}
