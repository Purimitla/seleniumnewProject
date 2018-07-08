package pack;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Pali {
    @Test
    public void palindrom() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter number");
    	int num=sc.nextInt();
    	String temp=Integer.toString(num);
    	String rev="";
    	int rem=0;
    	while(num>0)
    	{
        	rem=num%10;
        	num=num/10;
        	rev=rev+rem;
 //       	System.out.println(rev);
    	}
    	System.out.println(rev);
    	
    	if(temp.equals(rev))
    	{
    		System.out.println("palindrom number");
    	}
    	else
    	{
    		System.out.println("not a palindrom number");
    	}
    }
}
