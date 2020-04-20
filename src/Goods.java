public  class Goods extends  Factory {
	private String itemColor;
	private String itemName;
	private int itemCost;
	private int itemPrice;
	private int countOfSoldItems;

	Goods() {
		super();
	}
	Goods(String itemColor, String itemMaterial, int itemCost, int itemPrice, int countOfSoldItems, String departamentName) {
		super(departamentName);
		this.itemColor = itemColor;
		this.itemName = itemMaterial;
		this.itemCost = itemCost;
		this.itemPrice = itemPrice;
		this.countOfSoldItems = countOfSoldItems;
	}

	public String getItemColor() {
		return itemColor;
	}

	public String getItemMaterial() {
		return itemName;
	}

	public int getItemCost() {
		return itemCost;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public int getCountOfSoldItems() {
		return countOfSoldItems;
	}

	public Goods setItemColor(String itemColor) {
		this.itemColor = itemColor;
		return this;
	}

	public Goods setItemName(String itemName) {
		this.itemName = itemName;
		return this;
	}

	public Goods setItemCost(int itemCost) {
		this.itemCost = itemCost;
		return this;
	}

	public Goods setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
		return this;
	}

	public Goods setCountOfSoldItems(int countOfSoldItems) {
		this.countOfSoldItems = countOfSoldItems;
		return this;
	}

	@Override
	public double countThePriceOfSoldItems() {
		int thePriceOfSoldItems = countOfSoldItems * itemPrice;
		System.out.println("We have sold " + countOfSoldItems + " of " + itemColor + " "  + itemName + " . So the price of all the sold items is " + thePriceOfSoldItems);
		return thePriceOfSoldItems;
	}

	@Override
	public double countTheCostOfSoldItems() {
		int theCostOfSoldItems = itemCost * countOfSoldItems;
		System.out.println("We have sold " + countOfSoldItems + " of " + itemColor + " " + itemName + " . So the cost of all sold items is" + theCostOfSoldItems);
		return theCostOfSoldItems;
	}

	@Override
	public double countTheProfit() {
		int profit = (countOfSoldItems * itemPrice) - (itemCost * countOfSoldItems);
		System.out.println("The profit for " + itemColor + " " + itemName + " is " + profit);
		return profit;
	}

	@Override
	public double countTheSalaryOfEmployee() {
		return 0;
	}
	@Override
	public double countTheNumberOfProducedItems() {
		return 0;
	}







}
