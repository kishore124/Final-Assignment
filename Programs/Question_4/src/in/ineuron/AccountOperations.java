package in.ineuron;

public class AccountOperations extends BankAccount {

	public String depositAmount(Double amount) {
		this.setBalance(this.getBalance() + amount);
		return amount + " Amount is deposited.\nTotal Balance:: " + this.getBalance();
	}

	public String withdrawAmount(Double amount) {

		if (amount > this.getBalance()) {
			return " Withdrwal Amount is greater than the Balance";
		}

		this.setBalance(this.getBalance() - amount);
		return amount + " Amount is withdrawAmount.\nTotal Balnce:: " + this.getBalance();
	}

}
