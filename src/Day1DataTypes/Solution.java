package Day1DataTypes;

import java.util.*;

public class Solution {

	private static Scanner scan;

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int j = scan.nextInt();
		double k1 = scan.nextDouble();
		scan.nextLine();
		String str = scan.nextLine();
		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back
		// and review the Tutorial closely.

		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + j);
		/* Print the sum of the double variables on a new line. */
		System.out.println(d + k);
		/*
		 * Concatenate and print the String variables on a new line; the 's'
		 * variable above should be printed first.
		 */
		System.out.println(s.concat(str));
	}
}
