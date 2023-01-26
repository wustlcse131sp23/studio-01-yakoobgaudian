package studio1;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What year is it?");
		double year = in.nextInt();
	    boolean isLeapYear = ((year % 4==0) && (year % 100 > 0))|| (year % 400 ==0);
	    System.out.println("is leap year:" + isLeapYear);
	}

}
