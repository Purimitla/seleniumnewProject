package pack;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class ReverseArray {
	@Test
	public void reverse() {
		int Array[] = new int[]{7,10,3,6,86,45};
//		Arrays.sort(intArray, Collections.reverseOrder());
		for(int i=Array.length-1;i>=0;i--)
		{
			System.out.println(Array[i]);
		}	
		System.out.println();
		
		int Arrays[] = new int[]{1,3,5,3,1,8,9,6,7,9};
		for(int i=0;i<Arrays.length;i++)
		{
			for(int j=i+1;j<Arrays.length;j++)
			{
				if(Arrays[i]==Arrays[j])
				{
					System.out.print(Arrays[i]+" ");
				} 
				}
		}
		
		System.out.println(" ");
		
		String dim = "I Love India";
		String riv = " ";
		for(int i=dim.length()-1;i>=0;i--)
		{
//			System.out.print(dim.charAt(i)+" ");
			riv = riv+dim.charAt(i);
		}
		System.out.println(riv);
		
		System.out.println("Successful");
		
	StringBuilder input = new StringBuilder("Sai Sumathi");
	StringBuilder sim = input.reverse();
	System.out.println(sim);	
		
	}
}
