package loops;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		int correctPIN = 1234;

		System.out.println("Please enter your PIN");
		int enteredPIN = k.nextInt();

		while (enteredPIN != correctPIN) {
			System.out.println("PIN entered is not correct. Please try again");
			enteredPIN = k.nextInt();
		}

		System.out.println("Welcome to AXIS Bank");

	}

}
