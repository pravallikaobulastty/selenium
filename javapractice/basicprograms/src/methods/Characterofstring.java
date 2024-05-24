package methods;

public class Characterofstring {
	public void Odd(String name)
	{	
		int i=name.length();
		if(i%2!=0)
		{
			i=i/2-1;
			System.out.println(name.charAt(i)+ " "+ name.charAt(i+1));
		}
	}
	public void Even(String name)
	{
		int i=name.length();
		if(i%2==0)
		{
			i=i/2;
			System.out.println(name.charAt(i));
		}
	}
	public static void main(String[] args) {
		Characterofstring obj=new Characterofstring();
		obj.Odd("abc");
		obj.Even("pravallika");
	}

}
