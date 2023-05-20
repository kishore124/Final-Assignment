package in.ineuron.service;

public class CurrentAccount extends BankAccountImpl {

	@Override
	public String changePin(Integer pin) {
		System.out.println("ATM PIN change logic ");
		return "atm pin is changed";
	}

	@Override
	public String createNewAccount() {
		System.out.println("Creating new account logic");
		return "created new account";
	}

	@Override
	public Double checkBalance() {
		// TODO Auto-generated method stub
		return null;
	}

}
