package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		// add:
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Vignesh");
		ll.add("Test");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");

		// print:
		System.out.println("Contents of Linked List: " + ll);
		// addFirst
		ll.addFirst("First");
		// addLast
		ll.addLast("Last");
		System.out.println("Contents of Linked List: " + ll);
		// get
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		// set
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		// removefirst
		ll.removeFirst();
		System.out.println("Contents of Linked List: " + ll);
		// removeLast
		ll.removeLast();
		System.out.println("Contents of Linked List: " + ll);
		// remove from specific position
		ll.remove(2);
		System.out.println("Contents of Linked List: " + ll);
		System.out.println("*******************");
		// how to print all values of LinkedList
		// for loop
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		//advance for loop
		
		System.out.println("****Using advance for loop**********");
		for(String str:ll)
		{
			System.out.println(str);
		}
		//iterator
		System.out.println("*********Using iterator");
		Iterator <String> it = ll.iterator();
		while(it.hasNext())
		{
			String str1 = it.next();
			System.out.println(str1);
		}
		//while loop
		System.out.println("************Using while loop***********");
		int k=0;
		while(k<ll.size())
		{
			System.out.println(ll.get(k));
			k++;
		}
	}

}
