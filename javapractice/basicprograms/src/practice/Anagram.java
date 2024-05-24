package practice;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next(),str1=sc.next();
		int c=0;
		if(str.length()==str1.length())
		{
			for(int i=0;i<str.length();i++)
			{
				for(int j=0;j<str1.length();j++)
				{
				if(str.charAt(i)==str1.charAt(j))
				{
					c++;
					System.out.println(c);
				}
			}
		}
		
	}
		if(c==str.length())
		{
			System.out.println("Anagram");
		}

		else
		{
			System.out.println("its not Anagram");
		}
		

}
}
