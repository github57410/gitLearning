package BanKing7;

public class CheckingAccount extends Account{
private Double overdraftProtection;

public CheckingAccount(double balance){
	super(balance);
}

public CheckingAccount(double balance,double protect){
	super(balance);
	this.overdraftProtection=protect;
}

public void withdraw(double amt) throws OverdraftException{//要取的额度
	if (balance>=amt) {
		balance-=amt;
		
	}else {
		if (overdraftProtection==null) {
			throw new OverdraftException("no overdraf exception",amt-balance);
		}
		else if (overdraftProtection<=amt-balance) {
			throw new OverdraftException("Insufficient funds for overdraft proection",amt-balance-overdraftProtection);
		}else {
			overdraftProtection-=(amt-balance);
			balance=0;
		}
	}
	
}

public double getOverdraftProtection() {
	return overdraftProtection;
}
public void setOverdraftProtection(double overdraftProtection) {
	this.overdraftProtection = overdraftProtection;
}


}
