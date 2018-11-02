package testBanKing;
import BanKing3.*;
public class TestBanking5 {


	  public static void main(String[] args) {
	    Bank  bank = new Bank();
	    Customer customer;
	    Account account;

	    //
	    // Create bank customers and their accounts
	    //
           
	    System.out.println("Creating the customer Jane Smith.");
	    bank.addCustomer("Jane", "Simms");
	    
	    account =new SavingAccount(500.00,0.03);//利率账户
	    customer=bank.getCustomer(0);//账户
	    customer.setAccount(account);
	    System.out.println("Creating her Savings Account with a 500.00 balance and 3% interest.");
	    //code
     
        bank.addCustomer("Owen", "Bryant");
	    System.out.println("Creating the customer Owen Bryant.");
	    //code
	    customer = bank.getCustomer(1);
	    account =new CheckingAccount(500.00);//没有额度信用的账户
	    customer.setAccount(account);//将没有信用的账户给用户1
	    System.out.println("Creating his Checking Account with a 500.00 balance and no overdraft protection.");
	    //code
//	    System.out.println("Creating the customer Tim Soley.");
	    bank.addCustomer("Tim", "Soley");
	    customer = bank.getCustomer(2);//银行给用户开户
	    account =new CheckingAccount(500.00, 500.00);//额度账户的构造方法
	    customer.setAccount(account);//将实体传给用户
//	    System.out.println("Creating his Checking Account with a 500.00 balance and 500.00 in overdraft protection.");
//	    //code
	    bank.addCustomer("Maria", "Soley");
//	    System.out.println("Creating the customer Maria Soley.");
//	    //code
	    customer = bank.getCustomer(3);
//	    customer.setAccount(account);
//	    account=bank.getCustomer(2).getAccount();
//	    System.out.println("Maria shares her Checking Account with her husband Tim.");
	    customer.setAccount(bank.getCustomer(2).getAccount());

	    System.out.println();

	    //
	    // Demonstrate behavior of various account types
	    //

	    // Test a standard Savings Account
	    System.out.println("Retrieving the customer Jane Smith with her savings account.");
	    customer = bank.getCustomer(0);
	    account = customer.getAccount();
	    // Perform some account transactions
	    System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
	    System.out.println("Deposit 22.50: " + account.deposit(22.50));
	    System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
	    System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
	    // Print out the final account balance
	    System.out.println("Customer [" + customer.getLastName()
			       + ", " + customer.getFirstName()
			       + "] has a balance of " + account.getBalance());

	    System.out.println();

	    // Test a Checking Account w/o overdraft protection
	    System.out.println("Retrieving the customer Owen Bryant with his checking account with no overdraft protection.");
	    customer = bank.getCustomer(1);
	    account = customer.getAccount();
	    // Perform some account transactions
	    System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
	    System.out.println("Deposit 22.50: " + account.deposit(22.50));
	    System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
	    System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
	    // Print out the final account balance
	    System.out.println("Customer [" + customer.getLastName()
			       + ", " + customer.getFirstName()
			       + "] has a balance of " + account.getBalance());

	    System.out.println();

	    // Test a Checking Account with overdraft protection
	    System.out.println("Retrieving the customer Tim Soley with his checking account that has overdraft protection.");
	    customer = bank.getCustomer(2);
	    account = customer.getAccount();
	    // Perform some account transactions
	    System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
	    System.out.println("Deposit 22.50: " + account.deposit(22.50));
	    System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
	    System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
	    // Print out the final account balance
	    System.out.println("Customer [" + customer.getLastName()
			       + ", " + customer.getFirstName()
			       + "] has a balance of " + account.getBalance());

	    System.out.println();

	    // Test a Checking Account with overdraft protection
	    System.out.println("Retrieving the customer Maria Soley with her joint checking account with husband Tim.");
	    customer = bank.getCustomer(3);
	    account = customer.getAccount();
	    // Perform some account transactions
	    System.out.println("Deposit 150.00: " + account.deposit(150.00));
	    System.out.println("Withdraw 750.00: " + account.withdraw(750.00));
	    // Print out the final account balance
	    System.out.println("Customer [" + customer.getLastName()
			       + ", " + customer.getFirstName()
			       + "] has a balance of " + account.getBalance());

	  }
	}
