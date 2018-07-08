package pack;

import org.testng.annotations.Test;

public class ArrayEven {
	@Test
	public void even() {
		String[] s=new String[5];
		String s1[];
		String s2[];
		s[0]="aaa";
		s[1]="bbb";
		s[2]="ccc";
		s[3]="ddd";
		s[4]="eee";
	
		System.out.println("Odd numers are:");
		for(int i=0;i<s.length;i++)
		{
			if(i%2==1)
			{
				System.out.print(s[i]+" ");
//				s[i]= s[i]+" ";
//				String S= (String)s[i];
//				System.out.print(S);
			}
			
		}
		
		System.out.println(" ");
		System.out.println("Even numbers are:");
		for(int j=0;j<s.length;j++)
		{
//			if(j%2==0)
			while(j%2==0)
			{
				System.out.println(s[j]);
				break;
			}
		}
		
		System.out.println(" ");
		System.out.println("using while condition");
		for(int k=0;k<s.length;k++)
		{
			while(k%2==1)
			{
				System.out.println(s[k]);
				break;
			}
		}
	}

}
