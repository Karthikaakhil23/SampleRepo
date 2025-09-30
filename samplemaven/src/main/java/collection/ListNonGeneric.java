package collection;

import java.util.ArrayList;
import java.util.List;

public class ListNonGeneric {

	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("apple");
		l.add(2);
		l.add("apple");
		l.add(10.5);
		System.out.println(l);
		System.out.println(l.get(1));
		l.set(3,"black");
		System.out.println(l);
		System.out.println(l.indexOf("apple"));
		System.out.println(l.lastIndexOf("apple"));
		l.remove(0);
		System.out.println(l);
		System.out.println(l.size());
	}

}
