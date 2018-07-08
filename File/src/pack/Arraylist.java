package pack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.testng.annotations.Test;

public class Arraylist {
	@Test
	public void Alist() {
		ArrayList<Integer> al = new ArrayList<>();
				al.add(15);
				al.add(2);
				al.add(13);
				al.add(8);
				al.add(0);
				System.out.println(al);
				System.out.println(al.size());
				al.remove(2);
				System.out.println(al);
//				for(int array:al)
//				{
//					System.out.println(" "+ array);
//				}
				al.add(1,9);
				System.out.println(al);
				al.add(9);
				System.out.println(al);
			for(int i=0;i<al.size();i++)
			{
				if(i%2==0)
				{
					System.out.println("even index values are : "+al.get(i));
				}
//				else if(i%2==1)
				
//				{
//					System.out.println("odd indexes are : "+al.get(i));
//				}
			}
			
			Iterator itr = al.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}	
			
			LinkedList<Integer> lt = new LinkedList<Integer>();
			lt.add(1);
			lt.add(5);
			lt.add(6);
			System.out.println(lt);
			System.out.println(lt.get(2));
			lt.add(1,6);
			System.out.println(lt);
			System.out.println(lt.get(2));
			System.out.println(lt.get(3));
			
//			List<String> gen = new List<>();
//			Set<Integer> x = new Set<>();   we can't create object or instance for interface
			
				
	}

}
