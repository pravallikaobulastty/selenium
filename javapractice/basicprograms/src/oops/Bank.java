package oops;
import java.util.Scanner;
public class Bank {
	private Scanner scan;
	public Bank(Scanner scan)
	{
		this.scan=scan;
	}
	private float account=9000000;
	private String username="pravallika";
	private String password="penfriend";
	private void displayAccountbalance()
	{
		System.out.println(" account balance: "+account);
	}
	private void depositaccount(float amt)
	{
		account+=amt;
		System.out.println("Sucessfully credited amount"+account);
		displayAccountbalance();
	}
	private void withdraw(float amt)
	{
		account-=amt;
		System.out.println("Sucessfully debited amount"+account);
		displayAccountbalance();

	}
	public void login(String username,String password)
	{
		if(this.username.equals(username) && this.password.endsWith(password))
		{
			System.out.println("\n1. check balance \n2. deposit \n3. withdraw");
			int opt=scan.nextInt();
			switch(opt)
			{
			case 1: this.displayAccountbalance();break;
			case 2: System.out.println(" enter amount to deposit ");
			        float amt=scan.nextFloat();
			        this.depositaccount(amt); break;
			case 3: System.out.println(" enter amount to withdraw ");
	        		 amt=scan.nextFloat();
	        		this.depositaccount(amt); break;
	        default: System.out.println(" invalid option ");
			}
		}
		else
		{
			System.out.println(" Invalid credentials ");
		}
	}

}
