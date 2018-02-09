package com.InterviewProg;
import java.util.Arrays;

public class ShiftArrayByN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShiftArrayByN ar = new ShiftArrayByN();
		 int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		  ar.rotate(a,6);
	}

	private void rotate(int[] arr, int order) {
		if (arr == null || order < 0) {
		    throw new IllegalArgumentException("Illegal argument!");
		}
	 
		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}System.out.println(Arrays.toString(arr));
		
	}

}
