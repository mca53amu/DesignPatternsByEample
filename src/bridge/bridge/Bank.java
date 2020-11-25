package bridge.bridge;

public class Bank {
	protected String name;
	private BankAccount account;

	public Bank(BankAccount bankAccount) {
		this.setAccount(bankAccount);
	}

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}

}
