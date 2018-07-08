package pack;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Generic {
	@Test
	public void Array() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Selenium");
		al.add("Bangalore");
		al.add("kanpur");
		al.add(1,"uft");
		for(String a:al){
			System.out.println(a);
		}
	}	
}
