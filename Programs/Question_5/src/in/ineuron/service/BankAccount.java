package in.ineuron.service;

public interface BankAccount {

	public String depositAmount(Double amount);

	public String withdrawlAmount(Double Amount);

	public String changePin(Integer pin);

	public String createNewAccount();

}
