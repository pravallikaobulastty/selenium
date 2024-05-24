package arrays;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the ages");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int high=a[0];
		for(int i=0;i<size;i++)
		{
			
			if(a[i]>high )
				high=a[i];
			
			
			
		}
		System.out.println(high);

		
	}

}
