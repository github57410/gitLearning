package BanKing3;
/*´¢ĞîÕË»§
 * 
 * */
public class SavingAccount extends Account{
public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
private double interestRate;//ÀûÂÊ
	public SavingAccount(double balance,double init_rate)
	{
		super(balance);
		this.interestRate=init_rate;
	}
	
}
