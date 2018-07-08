package pack;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class SortArray {
	@Test
	public void ArraySorting() {
		char chararray[]={'a','h','b','y','u'};
		int[] arr={3,5,1,6,8};
//		System.out.println(arr.length);
		System.out.println(arr);
		
	   
		Arrays.sort(arr);

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
			
		Arrays.sort(chararray);
		for(int j=0;j<chararray.length;j++)
		{
			System.out.println(chararray[j]);
		}
		System.out.println(" ");
		
//		Arrays.sort(integerArray, Collections.reverseOrder());
		
		
		
		 // String Array
	    String[] stringArray = 
	       new String[] { "FF", "PP", "AA", "OO", "DD" };

	    // Sorting String Array in descending order
	    Arrays.sort(stringArray, Collections.reverseOrder());

	    // Displaying elements of String Array
	    System.out.println("String Array Elements in reverse order:");
	    for (int i = 0; i < stringArray.length; i++)
	       System.out.println(stringArray[i]);
		
	}

}
