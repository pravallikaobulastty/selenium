package arrays;

import java.util.Scanner;

public class Duplicate_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter string");
		String str=sc.next();
		char a[]=str.toCharArray();
		char unique[]=new char[a.length];int u=0;
		int count[]=new int[a.length];int c=0;
		for(int i=0;i<a.length;i++)
		{
			int counter=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					counter++;
				}
			}
			if(u==0)
			{
				unique[u]=a[i];
				u++;
				count[c]=counter;
				c++;
			}
			else
			{
				int find=0;
				for(int k=0;k<u;k++)
				{
					if(unique[k]==a[i])
					{
						find=1;
						break;
					}
				}
				if(find==0)
				{
					unique[u]=a[i];
					u++;
					count[c]=counter;
					c++;
				}
			}
		}
		for(int i=0;i<u;i++)
		{
			System.out.println(unique[i]+" "+count[i]);
		}


	}

}
