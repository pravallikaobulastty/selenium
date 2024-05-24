package loops;

import java.util.Scanner;

public class Amstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter the number n");
		n=sc.nextInt();
		int originalnum=n;
		int finalresult=0;
		
		while(n!=0)
		{
			int r=n%10;
			finalresult=finalresult+r*r*r;
			n=n/10;
		}
		if(finalresult==originalnum)
		
			System.out.println("its amstrong");
			else
				System.out.println("its not amstrong");
		
	}

}
