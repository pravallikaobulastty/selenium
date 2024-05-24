package loops;

public class Pattern_Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,sp;
		for(i=0;i<=3;i++)
		{
			for(sp=4;sp>i;sp--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(j=i+1;j>0;j--)
			{
				System.out.print(j);
			}

			System.out.println();
		}		
		for(i=5;i>=1;i--)
		{
			for(sp=5;sp>i;sp--)
			{
				System.out.print(" ");
			}
				for(j=1;j<=i;j++)
				{
					System.out.print(j);
				}
				for(j=i-1;j>=1;j--)
				{
					System.out.print(j);
				}	
	
			System.out.println();
		}
		
			
			
		}
	}


