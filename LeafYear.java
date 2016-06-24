package day2;

import java.util.Scanner;

public class LeapYear {

	static boolean calculateLeafYear(int year) {
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		return isLeapYear;
	}

	public static void main(String[] args) {
		System.out.println("The program calculates the leaf year ");
		System.out.println("Please input year :");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		System.out.println(calculateLeafYear(year));
	}

}
