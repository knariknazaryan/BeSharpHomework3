public class AccountantStaff {
	private static AccountantStaff myAccountant = new AccountantStaff();

	public String greetingClients;

	private AccountantStaff() {
		greetingClients = "Hi, I'm accountant at this store , nice to meet you";
	}

	public String getGreetingClients() {
		return greetingClients;
	}

	public AccountantStaff setGreetingClients(String greetingClients) {
		this.greetingClients = greetingClients;
		return this;
	}

	public static AccountantStaff greetingClients() {
		return myAccountant;
	}

}