package oops;

public class Rectangle {
	private int l,b; //--> Global variable,if it is non-statiic variable--> instance variables,	 
	public Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	 public void area()
	{
		System.out.println(" area= "+(l*b));
	}

}
