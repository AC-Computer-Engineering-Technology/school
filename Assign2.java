package assign2;

/*   Name: Adam Mohr
 * 	 Section: 301
 * 	 Lab Teacher: Jason Mombourquette
 * 	 Purpose of Program: Calculate the difference between two given dates using classes and if statements.
 * 	 Assignment Number #2
 *   Date: Friday, March 16th 2018
 */

public class Assign2 {

	public static void main(String[] args) {  

		DateCalculator dateDifference = new DateCalculator();  // Declares an object of the DateCalculator and calls the methods on the object.
		dateDifference.inputDates();
		dateDifference.calculateDifference();
		dateDifference.display();
	}

}
