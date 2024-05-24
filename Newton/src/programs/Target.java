package programs;

import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,count=0;
		System.out.println("ENter the target");
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		
		while( i!=target)
		{
			i=i+1;
			count++;
			if(i!=target)
			i=i*2;
			count++;
		}
		System.err.println(count);
			}

}
