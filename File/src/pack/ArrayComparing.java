package pack;

import org.testng.annotations.Test;

public class ArrayComparing {
	@Test
	public void comparearrays() {
		int n1=0,n2=1,n3=0, count=10,m,num=768,rem;
		String rev=" ";
		
		int arr1[]={1,4,3,7,5};
		int arr2[]={1,7,9,4,11};
		System.out.println(arr1);
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
		System.out.println(" ");

// Fibonacci series using normal operations		
		System.out.print(n1+" "+n2);
		for(int k=2;k<=count;k++)
		{
			n3=n1+n2;
//			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
		}
		System.out.println(" ");
		
		
// Fibonacci series pgm using arrays
	   int feb[] = new int[count];
	   feb[0]=0;
	   feb[1]=1;
	   for(m=2;m<count;m++)
	   {
		   feb[m]=feb[m-1]+feb[m-2];
	   }
	   for(m=0;m<count;m++)
	   {
		   System.out.println(feb[m]);
	   }
	   System.out.println(" ");
	   System.out.println(feb[8]);
		System.out.println(" ");

//   For reversing number		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev+rem;
		}
		System.out.println(rev);
		
	}

}
