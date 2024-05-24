package basicprograms;
import java.util.Scanner;
public class Sumofdigits {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int num,a,n,sum=0;
		num=Scan.nextInt();
		a=num%10;
		n=num/10;
		sum=sum+a;
		a=n%10;
		n=n/10;
		sum=sum+a;
		a=n%10;
		n=n/10;
		sum=sum+a;
		a=n%10;
		n=n/10;
		sum=sum+a;
		a=n%10;
		sum=sum+a;
		System.out.println("sum of digits="+sum);
		
	}

}
