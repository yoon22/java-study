package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam3 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "가만두지 않겠다!");
		map.put(2, "마지막이다!");
		map.put(3, "음.....");
		System.out.println(map);

		List<HashMap<String, Object>> catList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			HashMap<String, Object> cat = new HashMap<>();
			int ran = (int) (Math.random() * 30 + 1);
			cat.put("name", "냥이" + (i + 1));
			cat.put("age", ran);
			catList.add(cat);
		}
		for (int i = 0; i < 10; i++) {
			HashMap<String,Object> c = catList.get(i);
			c = new HashMap<>();
			c.put("name","냥이!!");
			System.out.println(catList.get(i));
		}
	}

}
