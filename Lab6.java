package lab6;
import java.util.Scanner;

public class Lab6 {
	private int value1, value2, gcf;
	private Scanner input = new Scanner (System.in);

	public void getValues() {

		System.out.print("Enter value1: ");
		value1 = input.nextInt();
		while(value1 <= 0) {
			System.out.print("Enter value1 that is greater than 0: ");
			value1 = input.nextInt();
		}
		System.out.print("Enter value2: ");
		value2 = input.nextInt();
		while(value2 <= 0) {
			System.out.print("Enter value2 that is greater than 0: ");
			value2 = input.nextInt();
		}
	}

	public void calculateGcf() {
		int a = value1;
		int b = value2;
		int temp;
		while (b != 0) {
			temp = a % b;
			a = b;
			b = temp;		
		}
		gcf = a;
	}

	public void display() {
		System.out.println("The greatest common factor of " + value1 + " and " + value2 + " is " + gcf);
	}
}
