package basicprograms;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter temperature...");
		float fr=scan.nextFloat();
		double centigrade=(float)5.0/9.0*(fr-32);
		System.out.println("temperature in centigrade="+centigrade);
		
	}

}
