package entities;

public class Cadastro {
	private int number;
	private String holder;
	private double balance;
	
	public Cadastro() {
		
	}
	
	public Cadastro(int number, String holder, double initialdeposit) {
		this.number=number;
		this.holder=holder;
		deposit(initialdeposit);
	}
	
	public Cadastro(int number, String holder) {
		this.number=number;
		this.holder=holder;
	}

	public String getholder() {
		return holder;
	}

	public void setholder(String holder) {
		this.holder = holder;
	}

	public int getnumber() {
		return number;
	}

	public double getbalance() {
		return balance;
	}

	public void deposit(double balance) {
		this.balance += balance;
	}
	
	public void withdrawl(double balance) {
		this.balance -= balance+5;
	}
	 public String toString() {
		 return "Account " + getnumber()+", Holder: " + getholder()+", Balance: $ "+String.format("%.2f", getbalance());
	 }
	
}

