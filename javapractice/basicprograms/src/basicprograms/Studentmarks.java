package basicprograms;
import java.util.Scanner;
public class Studentmarks {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter marks");
		int m1=scan.nextInt();
		int m2=scan.nextInt();
		int m3=scan.nextInt();
		int m4=scan.nextInt();
		int m5=scan.nextInt();
		int aggr=m1+m2+m3+m4+m5;
		float percentage=(float)aggr/5;
		System.out.println("aggregate marks of student="+aggr +"\npercentage= "+percentage);

		
		
	}

}