package BanKing2;
//�˻�
public class Account {
private double balance;//�˻����
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
public boolean withdraw(double amt){//Ҫȡ�Ķ��
	if (balance>=amt) {
		balance-=amt;
		return true;
	}
	else {
		System.out.println("����!");
		return false;
	}
}
}
