package conditional_statements;

import java.util.Scanner;

public class Youngest_of_three {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ages of r s a");
		int aor=sc.nextInt();
		int aos=sc.nextInt();
		int aoa=sc.nextInt(),young;
		 if((aor<aos)&&(aor<aoa))
		{
			 young=aor;
			System.out.println("r is yonger with age: " +young);
		}
		else if((aos<aor)&&(aos<aoa))
		{
			young=aos;
			System.out.println("s is younger with age: "+young);
		}
		else
			young=aoa;
			System.out.println("a is younger with age: "+young);
	}

}
