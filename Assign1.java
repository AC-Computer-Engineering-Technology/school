import java.util.Scanner;
import java.text.DecimalFormat;

/*   Name: Adam Mohr
 * 	 Section: 301
 * 	 Lab Teacher: Jason Mombourquette
 * 	 Purpose of Program: Calculate your Computer Essentials final grade based on input marks.
 * 	 Assignment Number #1
 *   Date: Friday February 16th  
 */

public class Assign1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double labMark, hybridMark, testMark, finalMark, theoryGrade, practicalGrade, finalGrade;  // Declare variables.
		DecimalFormat percentRound = new DecimalFormat("##.##");  // Set decimal format for grade percentages.
		
		System.out.println("Welcome to the CST8101 Final Mark Calculator\n");
		
		System.out.print("Enter your Lab Assignments mark out of 25: ");  // Receive input for marks.
		labMark = input.nextDouble();
		
		System.out.print("Enter your Hybrid Activities / Quizzes mark out of 20: ");
		hybridMark = input.nextDouble();
		
		System.out.print("Enter your Test mark out of 25: ");
		testMark = input.nextDouble();
		
		System.out.print("Enter your Final Assessment (Exam) mark out of 30: ");
		finalMark = input.nextDouble();
		
		System.out.println("");
		
		theoryGrade = (testMark + finalMark) / 55 * 100;  // Calculate grades. 
		practicalGrade = (hybridMark + labMark) / 45 * 100;
		finalGrade = (labMark + hybridMark + testMark + finalMark) / 100 * 100;
		
		System.out.println("Theory grade: " + percentRound.format(theoryGrade) +"%");  // Output grade percentages using the decimal format.
		System.out.println("Practical grade: " + percentRound.format(practicalGrade) + "%");
		System.out.println("Final grade: " + percentRound.format(finalGrade) + "%");
		
		input.close();
	}

}
