package BanKing4;

public class Customer {
	private String firstName;
	private String lastName;
//	private Account account;
	private Account[] account;
	private int numberOfAccouts;//记录Account的个数
//	private SavingAccount savingAccount;//储蓄账户
//	private CheckingAccount checkingAccount;//信用卡账户
	
	public Customer(String f,String l){
		firstName=f;
		lastName=l;
		account =new Account[5];
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
		
	

//添加一个账户到Account[]的数组里
public void addAccount(Account acct){
	account[numberOfAccouts]=acct;
	numberOfAccouts++;
}
//返回账户的个数
public int getNumOfAccounts(){
	return numberOfAccouts;
}
//public Account[] getAccount() {
//	return account;
//}


//返回制定索引处的账户
public Account getAccount(int index){
	return account[index];
}
public void setAccount(Account[] account) {
	this.account = account;
}

}
