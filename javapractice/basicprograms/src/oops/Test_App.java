package oops;

public class Test_App {
	public static void main(String[] args) {
		
	
	MobileApp mob;
	String name="Oneplus";
	if(name.equals("Apple"))
	mob=new Apple();
	else
		mob=new Oneplus();
	mob.call();
	mob.msg();
	}
}
