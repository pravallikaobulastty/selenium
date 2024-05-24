package loops;

import java.util.Scanner;

public class Male_female {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the gender character");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'm' :	
		case 'M' :	
			System.out.println("male");
				break;
		case 'f' :
		case 'F': System.out.println("female");
					break;
		default:System.out.println("invalid");
				
		}

	}

}
