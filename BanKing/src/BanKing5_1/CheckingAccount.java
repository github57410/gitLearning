package BanKing5_1;

public class CheckingAccount extends Account{
private double overdraftProtection;

public CheckingAccount(double balance){
	super(balance);
}

public CheckingAccount(double balance,double protect){
	super(balance);
	this.overdraftProtection=protect;
}

public boolean withdraw(double amt){//Ҫȡ�Ķ��
	if (balance>=amt) {
		balance-=amt;
		return true;
	}
	else if (overdraftProtection>=amt-balance) {
		overdraftProtection-=(amt-balance);
		balance=0;
		return true;
	}
	else return false;
}

public double getOverdraftProtection() {
	return overdraftProtection;
}
public void setOverdraftProtection(double overdraftProtection) {
	this.overdraftProtection = overdraftProtection;
}


}
