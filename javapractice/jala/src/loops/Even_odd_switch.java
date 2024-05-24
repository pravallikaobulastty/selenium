package loops;

import java.util.Scanner;

public class Even_odd_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number n");
		int n=sc.nextInt();
		int r=n%2;
		switch(r)
		{
		case 0: System.out.println("its even");
				break;
		case 1: System.out.println("its odd");
				break;
		default: System.out.println("invalid");
		
		
		}
		

	}

}
