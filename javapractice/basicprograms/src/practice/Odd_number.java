package practice;

import java.util.Scanner;

public class Odd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n= sc.nextInt();
		if(n%2!=0)
			System.out.println(n+""+"its a odd number");
		else
			System.out.println(n+""+"its a even number");

	}

}
