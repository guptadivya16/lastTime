package com.InterviewProg;

/*Print 1,12,1234,12345 (where , is linefeed)*/
public class Pyramid1 {

	public static void main(String[] args)
	{
		int i, j;
		 
        // outer loop to handle number of rows
        //  n in this case
        for(i=1; i<=5; i++)
        {
 
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop  
            for(j=1; j<=i; j++)
            {
                // printing stars
                System.out.print(j);
            }
 
            // ending line after each row
            System.out.print(" ");
        }
	}
}


//Output: 1 12 123 1234 12345 