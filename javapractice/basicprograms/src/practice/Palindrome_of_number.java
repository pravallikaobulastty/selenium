package practice;

import java.util.Scanner;

public class Palindrome_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter then number");
		int num= sc.nextInt(),revs=0;
		int temp=num;
		while(num!=0)
		{
			int a=num%10;
			revs = revs*10+a;
			num=num/10;
		}
		System.out.println(revs);
		if(temp==revs)
			System.out.println("its palindrome");
		else
			System.out.println("its not palindrome");
	}

}
