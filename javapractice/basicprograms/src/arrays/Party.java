package arrays;

import java.util.Scanner;

public class Party {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter time");
		int t=sc.nextInt(),s=0;
		int e[]=new int[t],l[]=new int[t];
		System.out.println("Enter the array Values");
		for(int i=0;i<t;i++)
		{
			e[i]=sc.nextInt();
			l[i]=sc.nextInt();
		}
			 for(int j=0;j<t;j++)
			 {
				 for(int k=0;k==j;k++)
				 {
					s= e[k]-l[k];
				 }
					System.out.println("no.of shipments: "+s);
			 }
		}
	}


