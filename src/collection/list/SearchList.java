package collection.list;

import java.util.ArrayList;

public class SearchList {

	public static void main(String[]args) {
		ArrayList<Integer> intList = new ArrayList<>();
		for(int i =1 ; i<=5 ; i++) {
			intList.add(i);
		}
		System.out.println(intList.indexOf(6));
		//indexof 원하는 값이 있는 방번호 찾고싶을때 씀. 
		//검색하는 값이 없을 때는 -1
		
	}
}
