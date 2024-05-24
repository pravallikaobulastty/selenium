package loops;

import java.util.Scanner;

public class Series_of_primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt(),f=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					System.out.println(j);
					f++;
				


			}

		}



	}

}
