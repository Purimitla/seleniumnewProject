package pack;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Palindrom {
	@Test
	public void polypgm() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string name");
		 String str = sc.next();
		 
		 StringBuilder input = new StringBuilder(str);
		 		 input.append(" "+"sumathi");
		input = input.reverse();
		System.out.println(input);
		 
		
		String rev="";
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		if(str.equals(rev))
		{
			System.out.println(str+" is palindrom number");
		}
		else
		{
			System.out.println(str+"is not palindrom number");
		}
		
	char[] arr = str.toCharArray();
	System.out.println(arr);
	
	
	String s = new String("mama");
	s.concat("illu");
	
	System.out.println(s);
		
	}

}
