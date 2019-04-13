package application;

import java.util.Locale;

import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 1000.0, 500.00);

		System.out.println(account.getBalance());
		
		
	}
}
