package operators;

public class Increment_decre_operator {
	
	public static void Increment(int a)
	{
		int c=a++;
		int b=++a;
		System.out.println(c);
		System.out.println(b);
	}
	public static void Decrement(int a)
	{
		int c=a--;
		int b=--a;
		System.out.println(c);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Increment_decre_operator.Increment(15);
		Increment_decre_operator.Decrement(98);
	}

}
