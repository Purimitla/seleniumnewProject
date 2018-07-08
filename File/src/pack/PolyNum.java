package pack;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PolyNum {
	@Test
	public void palnumber() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		String num=sc.next();
		String rev="";
		int length=num.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+num.charAt(i);
			System.out.println(rev);
		}
		if(num.equals(rev))
		{
			System.out.println(num+" is palindrom number");
		}
		else
		{
			System.out.println(num+"is not palindrom number");
		}
	}
	
}
