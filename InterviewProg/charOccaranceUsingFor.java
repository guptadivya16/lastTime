package com.InterviewProg;

public class charOccaranceUsingFor {

	public static void main(String[] args) {
	

			String str="This is java programnmmmmm";
			
			char[] stringchar = str.toCharArray();
			
			int i=0, j=i;
			int count = 0;
			
			for(;i<stringchar.length;i++,j++)
			{
				System.out.println("char j "+ stringchar[j]);
				if(stringchar[i]==stringchar[j])
				{
					count++;
					//j++;
				}
			}
			
			System.out.println("char "+ stringchar[i] +"count" +count);
			count=0;
	}

}
