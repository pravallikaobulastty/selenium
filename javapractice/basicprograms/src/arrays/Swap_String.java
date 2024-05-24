package arrays;

import java.util.Scanner;

public class Swap_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the string");
		String name=sc.next();
		String res=" ";
		for(int i=0;i<name.length();i++)
		{
		char	n=name.charAt(i);
		res=n+res;
		}
		System.out.println(res);
		
	}

}
