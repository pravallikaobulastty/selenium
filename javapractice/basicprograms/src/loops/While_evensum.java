package loops;

import java.util.Scanner;

public class While_evensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lower numeber and upper number");
		int lw=sc.nextInt();
		int up=sc.nextInt(),sum=0;
		int n=lw;
		while(n<=up)
		{
			if(n%2==0)
			{
				System.out.println(n);
				sum=sum+n;
			}
			n++;
		}
		System.out.println("even sum: "+sum);
		

	}

}
