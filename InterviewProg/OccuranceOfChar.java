package com.InterviewProg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OccuranceOfChar {

	public static void main(String[] args) {

		String str="This is java programnmmmmm";
		
		char[] stringchar = str.toCharArray();
		
		Map<Character, Integer> charactercount = new HashMap<Character, Integer>();
		
		for(char c:stringchar)
		{
			if(charactercount.containsKey(c))
			{
				charactercount.put(c, charactercount.get(c)+1);
			}
			else
				charactercount.put(c, 1);
			
		}

		Set<Map.Entry<Character, Integer>> entryset = charactercount.entrySet();
		for(Map.Entry<Character, Integer> entry:entryset)
		{
			//System.out.println("char " +entry.getKey() +"  count" +entry.getValue());
			System.out.println(entry.getKey() +" = " +entry.getValue());
		}
	
	}

}
