package loops;

import java.util.Scanner;

public class Pattern_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print( j+" ");		
			}
			
			for(int sp=3;sp>i;sp--)
			{
				System.out.print("    ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j +" ");	
			}
			System.out.println(" ");
		}

	}

}
