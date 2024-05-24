package loops;

import java.util.Scanner;

public class Even_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lower numeber and upper number");
		int lw=sc.nextInt();
		int up=sc.nextInt(),sum=0,n;
		for(n=lw;n<=up;n++)
		{
			if(n%2==0)
			{
				System.out.println(n);
				sum=sum+n;
				
			}
			
		}
		System.out.println("even sum: "+sum);


	}

}
