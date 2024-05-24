package arrays;

import java.util.Scanner;

public class Sum_ofeach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0,larsum=0;
		//int a[]= {321,333,345};
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			sum=0;
			while(a[i]>0)
			{
				int rem=a[i]%10;
				sum=sum+rem;
				a[i]=a[i]/10;
			}
			System.out.println(sum);
			if(sum>larsum)
				larsum=sum;
			
			
		}
		System.out.println(larsum);

	}

}
