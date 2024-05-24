package arrays;

import java.util.Scanner;

public class Duplicatedelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		int a[]=new int[size];
		int c[]=new int[size];
		int u=0;
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					if(a[i]!=a[j])
					{
						c[u]=a[i];
						u++;
					}
				}
			}
			System.out.println(c[u]);
		}
	}

}
