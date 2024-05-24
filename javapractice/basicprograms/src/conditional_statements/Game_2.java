package conditional_statements;

import java.util.Scanner;

public class Game_2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("level_1 score");
		int s1=scan.nextInt();
		if (s1>300)
		{
			System.out.println("congratulations you have unlock lever_2");
			System.out.println("level_2 score");
			int s2=scan.nextInt();
			if(s2>6000)
			{
				System.out.println("congratulation you have unlock leve;_3");
				System.out.println("level_3");
				int s3=scan.nextInt();
				if(s3>9000)
				{
					System.out.println("you won the game");
				}
					else
						System.out.println(" you are runner");
			}	
			else
					System.out.println("very bad play next time ");
		}
			else
				System.out.println("very bad play try next time");
		
		
			}
			}
					
					
				
				
				
			
		
		
		



	


