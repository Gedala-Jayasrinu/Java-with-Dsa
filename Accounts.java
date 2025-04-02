

public class Accounts {
	
	private int balance;
	
	
	
	
	public void setBalance(int balance) {
		if(balance>=0) {
		this.balance=balance;
	}else {
		System.out.println("Invalid Balance!");
	}
	}
	
	public int getbalance() {
		return balance;
	}
	
	class Main
	{	public static void main(String[] args) {
		
		Accounts acc=new Accounts();
		acc.setBalance(5000);
		
		System.out.println(acc.getbalance());

	}
	}
}
