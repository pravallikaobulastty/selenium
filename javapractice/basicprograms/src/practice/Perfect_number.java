package practice;

import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt(),sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
				sum=sum+i;
		}
		if(sum==num)
		System.out.println(sum +"is a perfect number");
		else
			System.out.println("not a perfect number");
	}

}
