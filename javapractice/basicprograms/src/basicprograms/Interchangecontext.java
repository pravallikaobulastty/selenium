package basicprograms;
import java.util.Scanner;
public class Interchangecontext {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter before changing values of C D");
		int c=scan.nextInt();
		int d=scan.nextInt();
		int temp;
		temp=c;
		c=d;
		d=temp;
		System.out.println("changed values\nc="+c + "\nd="+d);
			

	}

}
