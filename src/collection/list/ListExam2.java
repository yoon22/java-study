package collection.list;

import java.util.ArrayList;

public class ListExam2 {
	public static void main(String[]args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i =100;i>=10;i-=10) {			
			numList.add(i); //방번호를 넣을 필요없이 바로 값을 넣을 수있음.
		}
		for(int i =0;i<10;i++) {
			System.out.println(numList.get(i));
		}
		
	}
}
