package BanKing6.domain;

public class Customer {
	private String firstName;
	private String lastName;
//	private Account account;
	private Account[] accounts;
	private int numberOfAccouts;//��¼Account�ĸ���
//	private SavingAccount savingAccount;//�����˻�
//	private CheckingAccount checkingAccount;//���ÿ��˻�
	
	public Customer(String f,String l){
		firstName=f;
		lastName=l;
		accounts =new Account[5];
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	
//���һ���˻���Account[]��������
public void addAccount(Account acct){
	accounts[numberOfAccouts]=acct;
	numberOfAccouts++;
}

public Account getAccount(int index) {
	return accounts[index];
}
//�����˻��ĸ���
public int getNumOfAccounts(){
	return numberOfAccouts;
}
}
