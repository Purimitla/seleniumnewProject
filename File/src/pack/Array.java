package pack;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Array {
	@Test
	public void array() {
		int StudentId[] = {1,7,3,26,6};
		for(int i=0;i<StudentId.length;i++)
		{
			System.out.println(StudentId[i]);
		}
		System.out.println(StudentId.getClass());
		System.out.println(" ");
		
		int[] S=StudentId.clone();
		for(int j=0;j<S.length;j++)
		{
			System.out.println(S[j]);
		}
		
		
		
		String s1="I LOVE INDIA";  
		String words[]=s1.split(" ");
//		System.out.println(words[0]);
//		System.out.println(words.length);
//		for(String a:words)
//		{
//			System.out.println(a);
//		}
		
		
		for(int a=0;a<words.length;a++)
		{
			if(words[a].contains("L"))
			{
				System.out.println(words[a]);
			}
		}
		
		
	}

}
