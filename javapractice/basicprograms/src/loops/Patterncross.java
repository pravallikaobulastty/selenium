package loops;

public class Patterncross {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=5;i>=1;i--)
		{
			for(int sp=5;sp>i;sp--)
			{
				System.out.print("  ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();

		}
		

	}

}
