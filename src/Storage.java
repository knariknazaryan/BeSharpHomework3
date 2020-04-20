public abstract class Storage extends Factory {
	private int countOfProducedItems;
	private int countOfSoldItems;

	Storage() {
		super();
	}
	Storage(int countOfProducedItems, int countOfSoldItems, String departamentName) {
		super(departamentName);
		this.countOfProducedItems = countOfProducedItems;
		this.countOfSoldItems = countOfSoldItems;
	}

	public int getCountOfSoldItems() {
		return countOfSoldItems;
	}

	public int getCountOfProducedItems() {
		return countOfProducedItems;
	}

	public int setCountOfProducedItems(int countOfProducedItems) {
		this.countOfProducedItems = countOfProducedItems;
		return countOfProducedItems;
	}

	public int setCountOfSoldItems(int countOfSoldItems) {
		this.countOfSoldItems = countOfSoldItems;
		return countOfSoldItems;
	}
}
