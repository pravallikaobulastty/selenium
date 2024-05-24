package basicprograms;
import java.util.Scanner;
public class Reversenumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 5 digit number");
		int a,n,b; 
		long revrnum=0l;
		n=scan.nextInt();
		a=n%10;
		b=n/10;
		revrnum=revrnum*10+a;
		a=b%10;
		b=b/10;
		revrnum=revrnum*10+a;
		a=b%10;
		b=b/10;
		revrnum=revrnum*10+a;
		a=b%10;
		b=b/10;
		revrnum=revrnum*10+a;

		a=b%10;
		revrnum=revrnum*10+a;
		System.out.println("reversed number="+revrnum);
		

	}

}
