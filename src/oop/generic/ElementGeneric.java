package oop.generic;

import java.util.ArrayList;
import java.util.List;

public class ElementGeneric<E> extends ArrayList<E>{
	// <E>가없다면 기본 데이터타입이 Object임. 
	
	public static void main(String [] args) {
		List<String> strList = new ElementGeneric<>();
		strList.add("add");
		String str = strList.get(0);
		
		//ElementGeneric "<E>"가 없는 경우 
		//String str = strList.get(0); 이 오류남. 
		//Object str = strList.get(0); 로 해야함.
	}

}
