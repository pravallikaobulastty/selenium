package basicprograms;
import java.util.Scanner;
public class Newnumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the digit=");
		int sum=0,a,b,num,a1,b1,sum1;
		num=scan.nextInt();
		a=num%10;//12345%10=5
		b=num/10;//1234
		a=a+1;
		sum=sum*10+a;
		a=b%10;
		b=b/10;
		a=a+1;
		sum=sum*10+a;//-->65
		a1=sum%10;//-->5
		b1=sum/10;//--->6
		sum1=a1*10+b1;
		a=b%10;
		b=b/10;
		a=a+1;
		sum=sum*10+a;//654
		a1=sum%10;
		sum1=a1*100+sum1;
		System.out.println(+sum1);
		a=b%10;
		b=b/10;
		a=a+1;
		sum=sum*10+a;//6543
		a1=sum%10;//-->3
		sum1=a1*1000+sum1;//--->3
		a=b%10;
		a=a+1;
		sum=sum*10+a;
		a1=sum%10;
		sum1=a1*10000+sum1;
		System.out.println("New number="+sum1);
	}

}
