package conditional_statements;

import java.util.Scanner;

public class Best_Of_Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter main marks:");
		int main_marks=sc.nextInt();
		System.out.println("Did you attempt improvement exam or not");
		String s=sc.next();
		if(s.equals("yes"))
		
		{
			System.out.println("Enter improvement marks");
			int imp_marks=sc.nextInt();
			if(imp_marks>main_marks)
				System.out.println("Final marks:"+imp_marks);
			System.out.println("Final marks:"+main_marks);
		
		}
		else
			System.out.println("Final marks:"+main_marks);

	}

}
