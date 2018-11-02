package BanKing7;
//账户
public class Account {
protected double balance;//账户余额

public Account (double init_balance){
	balance =init_balance;
	
}
public double getBalance(){
	return balance;
}
//存钱
public boolean deposit(double amt){//取钱的额度
	balance+=amt;
	return true;
}
//取钱
public void withdraw(double amt) throws OverdraftException{//要取的额度
	if (balance>=amt) {
		balance-=amt;
		
	}
	else {
		System.out.println("余额不足!");
		throw new OverdraftException("资金不足",balance);
	}
}
}
