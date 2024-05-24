package practice;

import java.util.Scanner;

public class Swapping_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enther numbers");
		int a=sc.nextInt(),b=sc.nextInt();
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println(a+" "+b);
		

	}

}
