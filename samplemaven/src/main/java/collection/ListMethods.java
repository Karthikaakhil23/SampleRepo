package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		List <String> a = new ArrayList <String>();
		//add method
		a.add("Red");
		a.add("green");
		a.add("blue");
		a.add("green");
		System.out.println(a);
		//get() Method
		System.out.println(a.get(2));
		a.set(1, "white");
		System.out.println(a);
		//indexOf
		System.out.println(a.indexOf("green"));
		//lastIndexOf
		System.out.println(a.lastIndexOf("green"));
		//remove
		a.remove(1);
		System.out.println(a);
		//contains
		System.out.println(a.contains("Red"));
		//isEmpty
		System.out.println(a.isEmpty());
		//size
		System.out.println(a.size());
	}

}
