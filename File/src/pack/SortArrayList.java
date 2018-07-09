package pack;

import java.util.ArrayList;
import java.util.Collections;
import org.testng.annotations.Test;

public class SortArrayList {
	@Test
	public void arraylist() {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add(0,"Suma");
		list.add("Anusha");
		list.add("Madhuri");
		list.add("Sumathi");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		ArrayList<String> Lst = new ArrayList<String>();
		Lst.add("Ring");
		Lst.add("Rose");
		Lst.add("Lilly");
		System.out.println(Lst);
	    ArrayList<String> al = new ArrayList<String>();
	    al.addAll(list);
	    al.addAll(Lst);
	    System.out.println(al);
//	    Collections.reverse(list);
	    Collections.sort(list,Collections.reverseOrder());
	    System.out.println(list);

		
	}

}
