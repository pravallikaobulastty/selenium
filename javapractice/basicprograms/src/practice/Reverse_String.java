package practice;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String str1 ="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			str1=str1+ch;
		}
		System.out.println(str1);

	}

}
