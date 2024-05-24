package methods;
import oops.Rectangle;
import java.util.Scanner;

public class Average {
	public int sum(int a,int b,int c)
	{
	return a+b+c;
	}
	public float avg(int sum)
	{
		return sum/3;
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		Average obj=new Average();
		int d=obj.sum(x, y, z);
		float ag=obj.avg(d);
		System.out.println(d+ " "+ag);
		
	}

}
