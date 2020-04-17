public class Clothes {
	private String color;
	private String season;
	private int cost;
	private int price;
	private int countOfSold;

	Clothes() {

	}
	Clothes(String color, String season, int cost, int price, int countOfSold) {
		this.color = color;
		this.season = season;
		this.cost = cost;
		this.price = price;
		this.countOfSold = countOfSold;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	public String getSeason() {
		return season;
	}

	public int getCost() {
		return cost;
	}

	public int getCountOfSold() {
		return countOfSold;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
