package arrays;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String name=sc.nextLine();
		int count = 0;
		for(int i=0;i<name.length();i++ )
		{
			char ch=name.charAt(i);
		if( ch>='a' && ch<='z')
			count++;
		else if(ch>='A' && ch<='Z')
			count++;
		}
		System.out.println(count);
	}

}
