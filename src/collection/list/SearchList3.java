package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList3 {
	public static void main(String[]args ) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i=0;i<6;i++) {
			int ran = (int)(Math.random()*45)+1;
			numList.add(ran);
		}
		System.out.println(numList);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 , 기준으로 입력해주세요!");
		String str = scan.nextLine();
		String[] list = str.split(",");
		System.out.println("입력하신 숫자는 : " + str);
		int a = 0;
		
		for(String str1:list) {
			int num = Integer.parseInt(str1);			
			if (numList.indexOf(num)!=-1) {
				a++;;
			}
			
			
			
		}
		System.out.println("맞춘 갯수는 : " + a + "개");
		
	}

}
