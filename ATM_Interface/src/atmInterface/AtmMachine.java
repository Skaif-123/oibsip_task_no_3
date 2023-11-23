
package atmInterface;

import java.util.Scanner;

public class AtmMachine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int amt = 0;
		int option = 0;
		Atm machine1 = new Atm();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Federal Bank ");

		while (true) {
			System.out.println("\n");

			System.out.println("1. WITHDRAW");
			System.out.println("2. DEPOSIT");
			System.out.println("3. VIEW BALANCE");
			System.out.println("4. link AADHAR CARD");
			System.out.println("5. EXIT!!!");

			System.out.print("Enter your option :----->  ");
			option = sc.nextInt();

			switch (option) {
			case 1: {
				System.out.print("\nEnter the amount you wish to withdraw:--->  ");
				amt = sc.nextInt();
				if (machine1.checkamt(amt) == 0) {
					System.out.println("Enter again !!!");
					break;
				}
				machine1.Deduct(amt);
				System.out.println(amt + " amount is removed plz collect the slip");
				break;
			}

			case 2: {
				System.out.println("\nEnter the amount you wish to Deposit:--->  ");
				amt = sc.nextInt();
				machine1.Deposit(amt);
				System.out.println(amt + " amount is deposited, plz collect the slip");
				break;
			}

			case 3: {
				machine1.view();
				break;
			}
			case 5: {
				System.out.println("\nThank you for banking with us\n");
				System.exit(0);
			}
			default:
				System.out.println("Please enter a valid option");
				break;
			}

		}

	}
}
