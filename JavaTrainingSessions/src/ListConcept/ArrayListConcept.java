package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		int a[] = new int[3]; // static array -- size is fixed

		// dynamic array -- ArrayList
		// 1. It can contain duplicate values/elements
		// 2. It maintains insertion order
		// 3. It is not synchronized. It is not thread safe. ArrayList is slow when
		// compared to other Collections.
		// 4. It allows random access to fetch any element because it stores values on
		// the basis of indexes.
		ArrayList ar = new ArrayList();
		ar.add(10); // 0
		ar.add(20); // 1
		ar.add(30); // 2
		System.out.println(ar.size());

		ar.add(40); // 3
		ar.add(50); // 4
		ar.add(50); // 5
		System.out.println(ar.size()); // size of arraylist
		System.out.println(ar.get(4)); // to get value from an index
		System.out.println("********array values using for loop*************");
		// to print all values from ArrayList: use for loop
		// 1. for loop and while loop
		// 2. Iterator
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("********array values using while loop*************");
		int i = 0;
		while (i < ar.size()) {
			System.out.println(ar.get(i));
			i++;
		}

		// non generic vs generic:

		ar.add(12.33);
		ar.add("Vignesh");
		ar.add('A');
		ar.add(true);

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		// ar1.add("Tom");

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Vignesh");
		// ar2.add(2);
		ar2.add("Test");
		ar2.add("Selenium");

		ArrayList<E> ar3 = new ArrayList<E>();

		// Employee class objects
		Employee E1 = new Employee("Naveen", 27, "QA");
		Employee E2 = new Employee("Tom", 28, "Dev");
		Employee E3 = new Employee("Peter", 29, "Admin");

		// create arraylist:

		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(E1);
		ar4.add(E2);
		ar4.add(E3);

		// Iterator to traverse the values

		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);

		}
		System.out.println("*******************");
		// ************************
		// addAll() - to merge 2 arraylist
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Test");
		ar5.add("Selenium");
		ar5.add("QTP");
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Dev");
		ar6.add("Java");
		ar6.add("JavaScript");

		ar5.addAll(ar6);

		for (int j = 0; j < ar5.size(); j++) {
			System.out.println(ar5.get(j));
		}

		// *****************************
		// removeAll()
		System.out.println("*******************");
		ar5.removeAll(ar6);
		for (int j = 0; j < ar5.size(); j++) {
			System.out.println(ar5.get(j));
		}

		// ******************************
		// retainAll()
		System.out.println("************************");
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Test");
		ar7.add("Selenium");
		ar7.add("QTP");
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Test");
		ar8.add("Java");
		ar8.add("JavaScript");
		ar7.retainAll(ar8);
		for (int j = 0; j < ar7.size(); j++) {
			System.out.println(ar7.get(j));
		}
	}

}
