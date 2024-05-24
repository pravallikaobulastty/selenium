package tcsnqt;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int s1=0,s2=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='*')
				s1++;
			if(str.charAt(i)=='#')
				s2++;
		}
		
		if(s1==s2)
			System.out.println("zero");
		else if(s1>s2)
			System.out.println("positive");
		else
			System.out.println("negative");
		

	}

}
