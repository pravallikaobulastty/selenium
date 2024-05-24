package conditional_statements;

import java.util.Scanner;

public class  Month_year_days{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter month");
		int mth=scan.nextInt();
		System.out.println("Enter year");
		int yr=scan.nextInt();
		int nod;
		String month;
		switch(mth)
		{
		case 1:
			month="January";
			nod=31;
			System.out.println(month+ " has "+ nod+" days");
			break;
		case 2:
			month="February";
			if((yr%400==0)||(yr%4==0 && yr%100!=0))
				nod=29;
			else
				nod=28;
			System.out.println(month+" "+ yr+ " has "+ nod+" days");
			break;
		case 3:
			month="March";
			nod=31;
			System.out.println(month+" "+yr+ " has "+ nod+" days");
			break;
		case 4:
			month="April";
			nod=30;
			System.out.println(month+" "+yr+ " has "+ nod+" days");
			break;
		case 5:
			month="May";
			nod=31;
			System.out.println(month+" "+yr+ " has "+ nod+" days");
			break;
		case 6:
			month="June";
			nod=30;
			System.out.println(month+" "+yr+ " has "+ nod+" days");
			break;
		case 7:
			month="July";
			nod=31;
			System.out.println(month+ " "+ yr+  " has "+ nod+" days");
			break;
		case 8:
			month="Agust";
			nod=31;
			System.out.println(month+" "+ yr+" has "+ nod+" days");
			break;
		case 9:
			month="September";
			nod=30;
			System.out.println(month+" "+ yr+ " has "+ nod+" days");
			break;
		case 10:
			month="October";
			nod=31;
			System.out.println(month+" "+ yr+ " has "+ nod+" days");
			break;
		case 11:
			month="November";
			nod=30;
			System.out.println(month+" "+ yr+ " has "+ nod+" days");
			break;
		case 12:
			month="December";
			nod=31;
			System.out.println(month+" "+ yr+" has "+ nod+" days");
			break;
		default:
			System.out.println("Invalid");
		}
	
	}

}
