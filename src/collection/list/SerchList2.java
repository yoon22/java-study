package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SerchList2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		
		int a = 0;
		for(int i =0; i<5;i++) {
			int ranNum =(int)(Math.random()*20)+1;
					numList.add(ranNum);
				
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("맞출 번호를 , 기준으로 입력해주세요.");
		String strNum = scan.nextLine();
		String[] strNums = strNum.split(",");
		
		ArrayList<Integer> anList = new ArrayList<>();
		for(int i=0;i<strNums.length;i++) {
			int num = Integer.parseInt(strNums[i]);
			anList.add(num);
			if(numList.indexOf(num)!=-1) {
				a++;
			}
		}
		System.out.println(numList);
		System.out.println(anList);
		System.out.println(a+"개 맞았습니다."); 
		//주소값이 나오지않는 이유는 
		//오버라이딩이 되었기 때문이다.
	
	
	}

}
