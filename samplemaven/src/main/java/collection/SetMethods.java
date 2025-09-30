package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set <String> s = new HashSet<String>();
		Set <String> s1 = new HashSet<String>();
		//add method
		s.add("Blue");
		s.add("Red");
		s.add("Green");
		s.add("Blue");
		
		s1.add("apple");
		s1.add("orange");
		System.out.println(s);
		
		//addAll method
		s.addAll(s1);//add all the elements of s1 to s
		System.out.println(s);
		
		//contains
		System.out.println(s.contains("apple"));
		
		//containsAll() -check whether all the elements of one set in another set.
		System.out.println(s1.containsAll(s));
		
		//isEmplty()
		System.out.println(s.isEmpty());
		
		//remove() --not possible using index.
		s.remove("Red");
		System.out.println(s);
		
		//removAll() to remove all the elements of s1 from s 
		s.removeAll(s1);
		System.out.println(s);
		
		/*//size()
		System.out.println(s.size());
		
		//clear
		s.clear();
		System.out.println(s);*/
	}

}
