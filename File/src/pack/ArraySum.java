package pack;

import org.testng.annotations.Test;

public class ArraySum {
	@Test
	public void arraysum() {
		int biggest, smallest;
		int a[]={10,2,4,68,85,7};
		System.out.println(a[1]);
		int sum=0,temp=0;
		for(int i=0;i<a.length;i++)
//		for(int i=a.length-1;i>=0;i--)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		biggest=a[0];
		for(int j=0; j<a.length;j++)  
		{
			  if(a[j]>biggest)
			  	  
			  {
				  biggest=a[j];
			  }
			  
	    }
	    System.out.println("biggest number is "+biggest);
	    
	    smallest=a[0];
	    for(int k=0;k<a.length;k++)
	    {
	    	if(a[k]<smallest)
	    	{
	    		smallest=a[k];
	    	}
	    }
	
	    System.out.println("smallest num is "+smallest);
}
}
