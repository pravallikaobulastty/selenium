package conditional_statements;

import java.util.Scanner;

public class Vowel_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Alphabet");
		String ch=scan.next();
		 if(!(ch.charAt(0)>=65 &&ch.charAt(0)<=90)||(ch.charAt(0)>=97&&ch.charAt(0)<=122))
				System.out.println("Error");
		 else if(ch.length()>1)
			System.out.println("Error");
		else if(ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u")||ch.equals("A")||ch.equals("E")||ch.equals("I")||ch.equals("O")||ch.equals("U"))
				System.out.println(ch+" is vowel");
		else
			System.out.println(ch+ " is consonant");
	}

}
