package assign2;

/*   Name: Adam Mohr
 * 	 Section: 301
 * 	 Lab Teacher: Jason Mombourquette
 * 	 Purpose of Program: Calculate the difference between two given dates using classes and if statements.
 * 	 Assignment Number #2
 *   Date: Friday, March 16th 2018
 */

public class DateCalculator {

	private OurDate firstDate;  // Declare two OurDate objects.
	private OurDate secondDate;
	private String message;  // String to store the comparison message.

	public DateCalculator() {  // Default constructor. 
		System.out.println("Date Calculator - it's all relative\n");
	}

	public void inputDates() {  // Receive input for the two dates.
		System.out.println("Enter first date");
		firstDate = new OurDate();
		inputDate(firstDate);
		System.out.println("Enter second date");
		secondDate = new OurDate();
		inputDate(secondDate);

	}

	private void inputDate(OurDate date) {  // Private method to simplify date entry.
		date.inputYear();
		date.inputMonth();
		date.inputDay();
		System.out.println("");

	}

	public void calculateDifference() {   // Calculate the difference between the two dates and store the value in message.
		int difference = firstDate.calcDays() - secondDate.calcDays();  // Instance variable to store the difference between the two dates.
		String laterOrEarlier;  // String will display if the firstDate is earlier or later than the secondDate.

		if (difference == 0) {
			message = " is the same as ";
			return;
		}

		if (difference < 0) {
			laterOrEarlier = "earlier than ";
		}
		else {
			laterOrEarlier = "later than ";
		}
		difference = Math.abs(difference);  // Convert negative difference to positive so the message will not display negative numbers.

		if (difference >= 720) {
			message = " is " + difference / 360 + " years " + laterOrEarlier;  // Assume 360 days in year.
		}
		else if (difference >= 360) {
			message = " is " + difference / 360 + " year " + laterOrEarlier;
		}
		else if (difference >= 60) {
			message = " is " + difference / 30 + " months " + laterOrEarlier;  // Assume 30 days per month.
		}
		else if (difference >= 30) {
			message = " is " + difference / 30 + " month " + laterOrEarlier;
		}
		else if (difference >= 14) {
			message = " is " + difference / 7 + " weeks " + laterOrEarlier;
		}
		else if (difference >= 7) {
			message = " is " + difference / 7 + " week " + laterOrEarlier;
		}
		else if (difference > 1) {
			message = " is " + difference + " days " + laterOrEarlier;
		}
		else {
			message = " is " + difference + " day " + laterOrEarlier;
		}

	}

	public void display() {   // Displays whether the firstDate is earlier or later than the secondDate and by how much.
		firstDate.displayDate();
		System.out.print(message);
		secondDate.displayDate();
	}

}
