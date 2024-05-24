package oops;

import java.util.Scanner;

public class BankTest {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Bank obj=new Bank(scan);
		//System.out.println(obj.account);
		System.out.println("enter username");
		String username=scan.next();
		System.out.println("enter password");
		String password=scan.next();
		obj.login(username, password);

		
		
		
	}

}
