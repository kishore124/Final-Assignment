package in.ineuron.service;

public abstract class BankAccountImpl implements BankAccount {

	@Override
	public String depositAmount(Double amount) {
		System.out.println("Deposit Amount Logic");
		return "amount is deposited";
	}

	@Override
	public String withdrawlAmount(Double Amount) {
		System.out.println("Withdrwal Amount logic");
		return "amount is withdrawn";
	}
	
	public abstract Double checkBalance();

}
