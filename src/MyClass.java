public class MyClass {
	public static void main(String[] args) {
		Employee employee1 = new Employee() {
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
				.setName("John")
				.setPosition("Director")
				.setSalaryPerDay(35)
				.setCountOfWorkingDays(24);

		Employee employee2 = new Employee() {
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
				.setName("Sarah")
				.setPosition("consultant")
				.setSalaryPerDay(28)
				.setCountOfWorkingDays(16);

		Goods item1 = new Goods()
				.setItemColor("blue")
				.setItemName("sweater")
				.setItemCost(34)
				.setItemPrice(50)
				.setCountOfSoldItems(12)
				.setNumberOfProducedItems(23)
				.setSeasonOfTheItem("winter");

		Goods item2 = new Goods()
				.setItemColor("red")
				.setItemName("socks")
				.setItemCost(4)
				.setItemPrice(7)
				.setCountOfSoldItems(30)
				.setNumberOfProducedItems(45)
				.setSeasonOfTheItem("Spring");

			employee1.countTheSalaryOfEmployee();
			employee2.countTheSalaryOfEmployee();
			employee1.goToWork(Weekday.THURSDAY);
			item1.countThePriceOfSoldItems();
			item1.countTheCostOfSoldItems();
			item1.countTheProfit();
			item2.countThePriceOfSoldItems();
			item2.countTheCostOfSoldItems();
			item2.countTheProfit();
			item2.getOverallNumberOfProducedItems();
			item1.defineTheSale(Season.SPRING);

		}
	}
