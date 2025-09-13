package Project1;

public class TestAccount {
	public static void main(String[] args) {
		Account Acc1 = new Account("001", "Cameron", 5000);
		Account Acc2 = new Account("002", "Ainee", 4000);

		System.out.println("Before transfer balances:");
		System.out.println(Acc1.getName() + "'s balance: " + Acc1.getBalance());
		System.out.println(Acc2.getName() + "'s balance: " + Acc2.getBalance());

		Acc1.transferTo(Acc2, 1000);

		System.out.println(" ");
		System.out.println("After transfer balances:");
		System.out.println(Acc1.getName() + "'s balance: " + Acc1.getBalance());
		System.out.println(Acc2.getName() + "'s balance: " + Acc2.getBalance());
	}
}
