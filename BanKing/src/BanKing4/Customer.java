package BanKing4;

public class Customer {
	private String firstName;
	private String lastName;
//	private Account account;
	private Account[] account;
	private int numberOfAccouts;//��¼Account�ĸ���
//	private SavingAccount savingAccount;//�����˻�
//	private CheckingAccount checkingAccount;//���ÿ��˻�
	
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
		
	

//���һ���˻���Account[]��������
public void addAccount(Account acct){
	account[numberOfAccouts]=acct;
	numberOfAccouts++;
}
//�����˻��ĸ���
public int getNumOfAccounts(){
	return numberOfAccouts;
}
//public Account[] getAccount() {
//	return account;
//}


//�����ƶ����������˻�
public Account getAccount(int index){
	return account[index];
}
public void setAccount(Account[] account) {
	this.account = account;
}

}
