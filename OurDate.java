package assign2;
import java.util.Scanner;

/*   Name: Adam Mohr
 * 	 Section: 301
 * 	 Lab Teacher: Jason Mombourquette
 * 	 Purpose of Program: Calculate the difference between two given dates using classes and if statements.
 * 	 Assignment Number #2
 *   Date: Friday, March 16th 2018
 */

public class OurDate {

	private int month, day, year;  // Declare variables.
	private Scanner input = new Scanner (System.in);

	public OurDate () {  // Default constructor.
		year = 2000;
		month = 1;
		day = 1;
	}

	public OurDate (int y, int m, int d) {  // Parameterized initial constructor. 
		year = y;
		month = m;
		day = d;
	}

	public void inputDay () {  // Receive input for day.
		System.out.print("Enter a day: ");
		day = input.nextInt();

	}

	public void inputMonth () {  // Receive input for month.
		System.out.print("Enter a month: ");
		month = input.nextInt();
	}

	public void inputYear () {  // Receive input for year.
		System.out.print("Enter a year: ");
		year = input.nextInt();
	}

	public void displayDate() {  // Displays the date in proper form. 
		System.out.print(year + "/" + month + "/" + day);
	}

	public int calcDays() {  // Calculate days since the initial values.
		int days = day-1;
		days += ((month-1)*30);
		days += ((year -2000) * (12*30));
		return days;
	}

}
