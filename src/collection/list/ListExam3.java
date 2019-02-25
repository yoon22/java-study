package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExam3 {
	
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		List<String> ll = new LinkedList<>();
		List<String> v = new Vector<>();
		
		System.out.println(al);
		System.out.println(ll);
		System.out.println(v);
		
		al.add("1");
		ll.add("1");
		v.add("1");
		
		System.out.println(al);
		System.out.println(ll);
		System.out.println(v);
	}
}
