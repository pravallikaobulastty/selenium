package basicprograms;
import java.util.Scanner;
public class New_number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your number...");
		int num,sum=0,a,b;
		num=scan.nextInt();
		a=num/100000;
		b=num%100000;
		a=a+1;
		a=b/10000;
		b=b%10000;
		a=a+1;
		sum=sum*10+a;//-->2*10+3=20+3=23
		a=b/1000;
		b=b%1000;
		a=a+1;
		sum=sum*10+a;
		a=b/100;
		b=b%100;
		a=a+1;
		sum=sum*10+a;
		a=b/10;
		b=b%10;
		a=a+1;
		b=b+1;
		sum=sum*10+a;
		sum=sum*10+b;
		System.out.println("new added number is="+sum);
		
		

	}

}
