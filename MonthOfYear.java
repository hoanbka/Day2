package day2;

import java.util.Scanner;

public class MonthOfYear {

	public static void main(String[] args) {
		System.out.println("Please input a month of the year from 1 to 12");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		switch (month) {
		case 1:
			System.out.println(" Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("Jun");
			break;
		case 7:
			System.out.println("Jul");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sept");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
		default:
			break;
		}

	}

}
