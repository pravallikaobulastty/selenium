package conditional_statements;

import java.util.Scanner;

public class Even_Or_Odd {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your requried number");
		int num=scan.nextInt();
		if(num%2==0)
			System.out.println(num+ " is even number");
		else
			System.out.println(num+  " is odd number");
	}

}
