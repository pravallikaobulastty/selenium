package practice;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int yr=sc.nextInt();
		if(yr%4==0 && (yr%4000==0 || yr%100!=0))
			System.out.println("its a leap year");
		else
			System.out.println("not a leap year");

	}

}
