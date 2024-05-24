package conditional_statements;

import java.util.Scanner;

public class Book_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of days delay");
		int days=sc.nextInt();
		float fine;
		if(days>=1 && days<=5)
		{
			fine=days*1;
			System.out.println("total fine ammount: "+fine);
		}
		else if(days>=6 && days<=10)
		{
			fine=days*2;
			System.out.println("total fine ammount: "+fine);
		}
		else if(days>10 && days<30)
		{
			fine=days*10;
			System.out.println("total fine amount: "+fine);
		}
		else if(days>30)
			System.out.println("membership is cancelled");
		else
			System.out.println("returned on time");

	}

}
