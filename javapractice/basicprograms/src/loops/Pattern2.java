package loops;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lower limiy and upper limit values");
		int lw=sc.nextInt();
		int up=sc.nextInt();
		for(int i=lw;i<=up;i++)
		{
			if(i%5==0)
				System.out.println("😂");
			else
				System.out.println(i);
		}
	}

}
