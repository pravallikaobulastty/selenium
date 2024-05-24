package arrays;
import java.util.Scanner;
public class Araaycountsplcharacters {

	public static void main(String[] args) {

				Scanner sc=new Scanner(System.in);
				String a=sc.nextLine();
				String res=" ";
				String r=" ";
				int count=0,count1=0;
				for(int i=0;i<a.length();i++)
				{
					char ch=a.charAt(i);
					if(java.lang.Character.isLetterOrDigit(ch))
					{
						res=res+ch;
						count++;
					}
					else
					{
						r=r+ch;
						count1++;
					}
				}
				
					System.out.println(res+ " "+count);
					System.out.println(r+" "+count1);
				

			}

		
	}


