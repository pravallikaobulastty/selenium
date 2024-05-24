package conditional_statements;

import java.util.Scanner;

public class Triangle_valid {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the angles of the triangle");
		float angle1=scan.nextFloat();
		float angle2=scan.nextFloat();
		float angle3=scan.nextFloat();
		float sum=angle1+angle2+angle3;
		
		if(sum==180)
			System.out.println("triangle is valid");
		else
			System.out.println("triangle is invalid");
		

	}

}
