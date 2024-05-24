package loops;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower limit and upper limit");
		char lw=sc.next().charAt(0);
		char up=sc.next().charAt(0);
		for(char i=lw;i<=up;i++)
		{
			if(i%2!=0)
				System.out.println(i);
			else
				System.out.println((int) i);
		}

	}

}
