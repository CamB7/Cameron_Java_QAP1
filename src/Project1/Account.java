package Project1;

public class Account {
	private String id;
	private String name;
	private int balance = 0;

	// Constructor
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	// Getters
	public String getId() {return id;}
	public String getName() {return name;}
	public int getBalance() {return balance;}

	//Mutators
	public int credit(int amount){
		balance += amount;
		return balance;
	}

	public int debit(int amount) {
		if (amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}

	public int transferTo(Account other, int amount) {
		int before = this.balance;
		this.debit(amount);
		if (this.balance < before) {
			other.credit(amount);
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}

	//toString method
	public String toString() {
		return "Account[id=" + this.id + ", name=" + this.name + ", balance=" + this.balance + "]";
	}
}
