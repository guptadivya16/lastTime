package com.InterviewProg;
import java.util.Arrays;

public class ReverseAndStoredInSameArray 
{
	public static void main(String arg[])
	{
		ReverseAndStoredInSameArray ar = new ReverseAndStoredInSameArray();

		  int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		  ar.reverseArray(a);

		 }

		 private void reverseArray(int[] a) {  
		  int middle = a.length /2;
		  System.out.println("middle element "+middle);
		  int i = 0, j = a.length - 1, temp = 0;
		  
		  for(; i < middle; i++,j--) {
		   temp = a[i];
		   a[i] = a[j];
		   a[j] = temp;
		  }
		  
		  System.out.println(Arrays.toString(a));

		
	}

}
