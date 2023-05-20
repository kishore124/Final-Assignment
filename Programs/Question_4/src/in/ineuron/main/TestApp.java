package in.ineuron.main;

import java.util.Scanner;

import in.ineuron.AccountOperations;

public class TestApp {

	public static void main(String[] args) {

		Scanner scanner = null;
		AccountOperations account = null;
		try {
			account = new AccountOperations();
			scanner = new Scanner(System.in);

			System.out.println("Enter Bank Account Number");
			long accountNumber = scanner.nextLong();

			System.out.println("Enter Bank Account Type");
			scanner.next();
			String accountType = scanner.nextLine();

			System.out.println("Enter Bank Account Holder Name");
			String name = scanner.nextLine();

			account.setAccountNumber(accountNumber);
			account.setName(name);
			account.setType(accountType);

			while (true) {
				System.out.println("******************************");
				System.out.println("Enter 1 to Deposit Amount");
				System.out.println("Enter 2 to Withdraw Amount");
				System.out.println("Enter 3 to Check Balcance");
				System.out.println("Enter 0 to Exit");
				int num = scanner.nextInt();
				if (num == 1) {
					System.out.println("Enter Amount to be deposited");
					Double amount = scanner.nextDouble();
					String status = account.depositAmount(amount);
					System.out.println(status);
				} else if (num == 2) {
					System.out.println("Enter Amount to be Withdraw");
					Double amount = scanner.nextDouble();
					String status = account.withdrawAmount(amount);
					System.out.println(status);
				} else if (num == 3) {
					System.out.println("Total Account Balance :: " + account.getBalance());
				} else if (num == 0) {
					System.out.println("***********Thank You For Using the Service*********************");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

	}

}
