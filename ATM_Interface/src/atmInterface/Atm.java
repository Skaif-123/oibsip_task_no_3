package atmInterface;

public class Atm {

	int amount = 10000;

	public void Deposit(int amt) {
		amount = amount + amt;
	}

	public void Deduct(int amt) {
		this.amount = amount - amt;
	}

	public void view() {
		System.out.println("Your amount is " + amount);
	}

	public int checkamt(int amt) {
		if (amt % 100 != 0) {
			System.out.println("Your amount should be multiple of 100");
			return 0;
		}
		else {		
		return 1;
	}
	}

}
