public class Accountant extends Clothes {
	private int costOfClothes;
	private int priceOfClothes;
	private int profitOfClothes;

	Accountant() {
		super();
	}
	Accountant(int costOfClothes, int priceOfClothes, int profitOfClothes, String color, String season, int cost, int price, int countOfSold) {
		super(color, season, cost, price, countOfSold);
		this.costOfClothes = costOfClothes;
		this.priceOfClothes = priceOfClothes;
		this.profitOfClothes = profitOfClothes;
	}

	public int getCostOfClothes() {
		return costOfClothes;
	}

	public int getPriceOfClothes() {
		return priceOfClothes;
	}

	public int getProfitOfClothes() {
		return profitOfClothes;
	}

	public void setCostOfClothes(int costOfClothes) {
		this.costOfClothes = costOfClothes;
	}

	public void setPriceOfClothes(int priceOfClothes) {
		this.priceOfClothes = priceOfClothes;
	}

	public void setProfitOfClothes(int profitOfClothes) {
		this.profitOfClothes = profitOfClothes;
	}

	public int  countTheCostOfClothes() {
		costOfClothes = getCountOfSold() * getCost();

//		System.out.println("We sold " + getCountOfSold() + " of " + getColor() + "sweater. The cost is: " + costOfClothes);
		return countTheCostOfClothes();
	}

	public void countThePriceOfSoldClothes() {
		priceOfClothes = getPriceOfClothes() * getCountOfSold();
		System.out.println("We sold " + getCountOfSold() + " of " + getColor() + "sweater. The price is: " + priceOfClothes);
	}
}
