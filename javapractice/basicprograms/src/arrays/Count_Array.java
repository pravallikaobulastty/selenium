package arrays;

import java.util.Scanner;

public class Count_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String name = sc.next();
		int c=0;
		for(int i=0; i<name.length();i++)
		{
			char ch = name.charAt(i);
			if(ch>='a' && ch<='z')
				c++;
				}
		System.out.println(c);
	}
}
