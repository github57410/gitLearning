package BanKing7;

public class OverdraftException extends Exception{
	static final long serialVersionUID = -3387516993124229948L;
	private double deficit;//��ʾ��ȡ��Ǯ�����Ĳ��

	public double getDeficit() {
		return deficit;
	}
	
	public OverdraftException(String msg,double deficit){
		super(msg);
		this.deficit=deficit;
	}

}
