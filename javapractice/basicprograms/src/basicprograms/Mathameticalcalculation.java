package basicprograms;
import java.util.Scanner;
public class Mathameticalcalculation {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter length and breadth of a Rectangle");
	int len=scan.nextInt();
	int bred=scan.nextInt();
	int aor=len*bred;
	int por=2*(len+bred);
	System.out.println("Area of rectangle="+aor +"\nperimeter of rectangle="+por);
	System.out.println("Enter radius of circle");
	int rad=scan.nextInt();
	float aoc=3.14f*rad*rad;
	float coc=2*3.14f*rad;
	System.out.println("Area of circle="+aoc +"\nperimeter of circle="+coc);
	}

}
