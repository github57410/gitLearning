package BanKing7;
//�˻�
public class Account {
protected double balance;//�˻����

public Account (double init_balance){
	balance =init_balance;
	
}
public double getBalance(){
	return balance;
}
//��Ǯ
public boolean deposit(double amt){//ȡǮ�Ķ��
	balance+=amt;
	return true;
}
//ȡǮ
public void withdraw(double amt) throws OverdraftException{//Ҫȡ�Ķ��
	if (balance>=amt) {
		balance-=amt;
		
	}
	else {
		System.out.println("����!");
		throw new OverdraftException("�ʽ���",balance);
	}
}
}
