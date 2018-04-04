package lab7;
import java.util.Scanner;

public class FibonacciNumbers {

	private int numberOfNumbers, a, b;
	private Scanner input = new Scanner (System.in);
	private int [] fbNumbers;

	public FibonacciNumbers() {
		a = 1;
		b = 1;
	}

	public void getNumberFromUser() {
		System.out.print("How many Fibonacci numbers do you want? ");
		numberOfNumbers = input.nextInt();

		while (numberOfNumbers < 2) {
			System.out.println("You need to generate at least two");
			System.out.print("How many Fibonacci numbers do you want? ");
			numberOfNumbers = input.nextInt();
		}
		fbNumbers = new int[numberOfNumbers];
	}

	private int nextNumber() {
		int temp;
		temp = b;
		b = b + a;
		a = temp;
		return b;
	}

	public void createFibonacciNumbers() {
		fbNumbers[0] = 1; fbNumbers[1] = 1;
		for (int i = 2; i < fbNumbers.length; i++) {
			fbNumbers[i] = nextNumber();
		}
	}

	public void printFibonacciNumbers() {
		System.out.println("");
		System.out.println("The first " + fbNumbers.length + "  Fibonacci numbers in reverse order are:");
		for (int i = fbNumbers.length - 1; i >= 0; i--) {
			System.out.println(fbNumbers[i]);
		}
	}
}
