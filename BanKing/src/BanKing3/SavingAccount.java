package BanKing3;
/*�����˻�
 * 
 * */
public class SavingAccount extends Account{
public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
private double interestRate;//����
	public SavingAccount(double balance,double init_rate)
	{
		super(balance);
		this.interestRate=init_rate;
	}
	
}
