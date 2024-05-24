package conditional_statements;

import java.util.Scanner;

public class Charcter_Identification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter character");
		char ch=scan.next().charAt(0);
		if(ch>='A' && ch<='B')
			System.out.println("Upper case");
		else if(ch>='a'&& ch<='z')
			System.out.println("Lower case");
		else if(ch>='0'&& ch<='9')
			System.out.println("Digits");
		else
			System.out.println("Special Character");

	}

}
