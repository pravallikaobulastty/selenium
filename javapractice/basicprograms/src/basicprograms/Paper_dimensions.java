package basicprograms;
import java.util.Scanner;
public class Paper_dimensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter height and width of paper");
		int ht,wd;
		ht=scan.nextInt();
		wd=scan.nextInt();
		int a0ht=ht,a0wd=wd;
		int a1ht=a0wd,a1wd=a0ht/2;
		int a2ht=a1wd,a2wd=a1ht/2;
		int a3ht=a2wd,a3wd=a2ht/2;
		int a4ht=a3wd,a4wd=a3ht/2;
		int a5ht=a4wd,a5wd=a4ht/2;
		int a6ht=a5wd,a6wd=a5ht/2;
		int a7ht=a6wd,a7wd=a6ht/2;
		int a8ht=a7wd,a8wd=a7ht/2;
		System.out.println("a0ht*a0wd :" +a0ht+"*"+a0wd +"\na1ht*a1wd :" +a1ht +"*"+a1wd +"\na2ht*a2wd :" +a2ht+"*"+a2wd +
				"\na3ht*a3wd :" +a4ht+"*"+a4wd +"\na4ht*a4wd :" +a4ht+"*"+a4wd +"\na5ht*a5wd :" +a5ht+"*"+a5wd + "\na6ht*a6wd :" +a6ht+"*"+a6wd +
				"\na7ht*a7wd :" +a7ht+"*"+a7wd +"\na8ht*a8wd :" +a8ht+"*"+a8wd );

		

	}

}
