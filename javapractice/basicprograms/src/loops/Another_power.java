package loops;

import java.util.Scanner;

public class Another_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a b values");
		int a=sc.nextInt();
		int b=sc.nextInt(),r=1;
		for(int i=1;i<=a;i++)
		{
			r=r*b;
		}
		System.out.println(r);
			
	}

}
