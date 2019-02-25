package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam1 {
	
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<>();
		hm.put("이름1","홍길동");
		hm.put("이름1","홍길동2");		
		System.out.println(hm.get("이름1"));
		
		List<String> ll = new ArrayList<>();
		ll.add("이름1");
		ll.add("이름2");
		ll.add("이름3");
		ll.add("이름4");
		System.out.println(ll);
	}
}
