package operators;

public class Equal_notequal_operators {
	
	public static void equaloperator(int a,int b)
	{
		if(a==b)
			System.out.println("equal number is: "+a);
		else
			System.out.println("not equal");
	}
	public static void notequaloperator(int a,int b)
	{
		if(a!=b)
		System.out.println("a and b are not equal");
		else 
			System.out.println("equal number is : "+a);
	}
	public static void main(String[] args) {
		Equal_notequal_operators.equaloperator(10, 20);
		Equal_notequal_operators.notequaloperator(10, 10);
	}

}
