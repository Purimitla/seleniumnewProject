package pack;

import org.testng.annotations.Test;

public class Practice {
	
	@Test(priority=1)
	public void sample()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
				{
					System.out.println("*");
				}	
			}
		}
		System.out.println();
	}
	
	@Test(priority=2)
	public void sample1() {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
				{
					System.out.println(i+" ");
				}
		}
		}
		System.out.println();
	}
 
	
	@Test(priority=3)
	public void sample2()
	{
		String S = "amiba";
		int sin = S.indexOf("amiba");
		int sign = S.indexOf("amiba");
		System.out.println(sign);
//		System.out.println(sin);
	}
	
	@Test(priority=4)
	public void CharLine() {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
					System.out.print(i+" ");	
			}
			System.out.println();
		}
	}
	
	@Test(priority=5)
	public void CharLine1() {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
					System.out.print(j+" ");	
			}
			System.out.println();
		}
		System.out.println();
	}
	
	@Test(priority=6)
	public void generel() {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
					System.out.print(i);	
			}
			System.out.println();
		}
		System.out.println();
	}
	
	@Test(priority=7)
	public void gen() {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
					System.out.print("*");	
			}
			System.out.println();
		}
		System.out.println();
	}
	
	@Test(priority=8)
	public void Cha() {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
					System.out.print("*");	
			}
			System.out.println();
        }
	}
	@Test(priority=9)
	public void genere() {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
					System.out.print(i);	
			}
			System.out.println();
		}
		System.out.println();
	}
	

	@Test(priority=10)
	public void Chain() {
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
					System.out.print("*");	
			}
			System.out.println();
        }
		System.out.println();
	}
	
	@Test(priority=11)
	public void Chai() {
		for(int i=1;i>=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
					System.out.print("#");	
			}
			System.out.println();
        }
	}
}

