package com.InterviewProg;
public class ToLowerCAse
{
    public static void main(String[] args)
    {
        toLowerCase("MY NAME");
    }

    public static void toLowerCase(String a)
    {
        for (int i = 0; i< a.length(); i++)
        {
            char aChar = a.charAt(i);
            if (65 <= aChar && aChar<=90)
            {
                aChar = (char)( (aChar + 32) ); 
            }
            System.out.print(aChar);
         }
     }
}    