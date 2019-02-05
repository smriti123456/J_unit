package junit.a;

import java.util.ArrayList;
import java.util.Iterator;

public class consec {
	
	ArrayList<String> result = new ArrayList<String>();
	 public ArrayList <String> findConsecString(ArrayList<String> name)
	 {
		 Iterator <String>it= name.iterator(); 
		 
		 while(it.hasNext())
		 {
			 String word= it.next();
			 char first = word.charAt(0);
			 for(int j = 1; j < word.length(); j++)
			 {
			 if(first == word.charAt(j))
			 {	
			 result.add(word);
			 break;
			 }	
			 first = word.charAt(j);	
			 }	
			 } 
			 return result;
		 }
	 }

