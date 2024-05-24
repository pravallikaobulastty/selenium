package practice;

import java.util.Scanner;

public class Reverse_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String sttr =sc.nextLine();
		String revs="";
			String s[] = sttr.split(" ");
			for(int i=s.length-1;i>=0;i--)
			{
				revs=revs+s[i]+" ";
			}
			System.out.println(revs);
			
		}

	}


