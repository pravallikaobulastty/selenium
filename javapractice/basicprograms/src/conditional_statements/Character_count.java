package conditional_statements;

import java.util.Scanner;

public class Character_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		String s=sc.nextLine();
		int up=0,lc=0,sc1=0,d=0;
		for(int i=0;i<s.length();i++)
		{
			
		if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			up++;
		else if(s.charAt(i)>='a' && s.charAt(i)<='z')
			lc++;
		else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			d++;
		else
			sc1++;
		}
			System.out.println("upper case count is : "+up);
			System.out.println("Lower case count is : "+lc);
			System.out.println("digit count is: "+d);
			System.out.println("spcial character count is: "+sc1);
		}
		
	}




