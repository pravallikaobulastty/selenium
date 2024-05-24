package basicprograms;
import java.util.Scanner;
public class Addingfrstndlast {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your four digit number");
		int num,sum=0,a;
		num=scan.nextInt();
		a=num/1000;
		sum=sum+a;
		a=num%10;
		sum=sum+a;
		System.out.println("sum of first and last digit is "+sum);
		
	}

}
