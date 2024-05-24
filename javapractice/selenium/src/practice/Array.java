package practice;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
				arr[i]=11;					
			if(arr[i]==2)
				arr[i]=12;
		}
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
		
		

	}

}
