package BanKing;
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
public void deposit(double amt){//ȡǮ�Ķ��
	balance+=amt;
}
//ȡǮ
public void withdraw(double amt){//Ҫȡ�Ķ��
	if (balance>=amt) {
		balance-=amt;
	}
	else {
		System.out.println("���㣬���Ǯ");
	}
}
}
