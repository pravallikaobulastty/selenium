package arrays;
import java.util.Scanner;
public class Reverse_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
