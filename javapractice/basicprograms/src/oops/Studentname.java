package oops;

public class Studentname {	
	private String name;
	Studentname(String s)
	{
		name=s;
	}

	Studentname()
	{
		name="Unknown";
	}
	public void display()
	{
		System.out.println(name);
	}

}
