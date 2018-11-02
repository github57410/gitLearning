package BanKing7;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;
	private Bank(){
		customers =new Customer[5];//¹¹ÔìÆ÷
		
	}
	private static Bank bank=new Bank();
	public static Bank getBanking(){
		return bank;
	}
	public void addCustomer(String f,String l){
		Customer cust=new Customer(f,l);
		customers[numberOfCustomers]=cust;
		numberOfCustomers++;
	}
	public int getNumOfCustomers(){
		return numberOfCustomers;
	}
	public Customer getCustomer(int index){
		return customers[index];
	}

}
