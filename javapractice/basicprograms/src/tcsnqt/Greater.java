package tcsnqt;

import java.util.Scanner;

public class Greater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size], count=1;
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>a[0])
				count++;
		}
		System.out.println(count);
	}
	
	

}
