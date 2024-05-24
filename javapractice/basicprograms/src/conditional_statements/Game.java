package conditional_statements;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter leve_1 score");
		int score_1=scan.nextInt();
		if(score_1>3000)
		{
			System.out.println("COngratualation you have unloacked level_2");
			System.out.println("Enter level_2 score");
			int score_2=scan.nextInt();
			 if(score_2>=6000)
			 {
				System.out.println("congratulations you have unlocked level_3");
				System.out.println("Enter level_3 score");
				int score_3=scan.nextInt();
				if(score_3>9000)
				{
					System.out.println("you won the game");
					
				}
				else
					System.out.println("nice attempt try next time");
			}

				else
					System.out.println("Very bad play try next time");
					 }

				else
					System.out.println("you are runner up");
				
		
					}

	}


