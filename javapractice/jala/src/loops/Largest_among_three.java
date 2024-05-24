package loops;

import java.util.Scanner;

public class Largest_among_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter three values");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		if(a==b && a==c)
			System.out.println("All are equal");
		else if(a>b && a>c)
			System.out.println(a+ " is largest number");
		else if(b>c)
			System.out.println(b+ " is largest number");
		else
			System.out.println(c+ " is largest number");
		

	}

}
