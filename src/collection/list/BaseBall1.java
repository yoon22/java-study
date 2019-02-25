package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBall1 {
	
	public static void main(String[]args) {
		ArrayList<Integer> numList = new ArrayList<>();
		
		for (int i=0;i<3;i++) {
			int ranNum = (int)(Math.random()*9)+1;			
			if(numList.indexOf(ranNum)==-1) {				
				numList.add(ranNum);	
			}else {
				i--;
			}
		}
		int bCnt = 0;
		int sCnt = 0;
	
		Scanner scan = new Scanner(System.in);
		while (sCnt!=3) {
			bCnt = 0;
			sCnt = 0;
			System.out.println("궁굼한 숫자 3개를 , 기준으로 쓰세용!");
			String str = scan.nextLine();
			String[] userNum = str.split(",");
			
			int[] nums = new int[3];
					
			for(int i=0;i<userNum.length;i++) {
				nums[i] = Integer.parseInt(userNum[i]);
			}
			
		
			for(int i=0;i<nums.length;i++) {
				if(numList.indexOf(nums[i])!=-1 ) {
					if(i==numList.indexOf(nums[i])) {
						sCnt++;
					}else {
						bCnt++;
					}				
				}	
			}
			if(sCnt+bCnt==0) {
				System.out.println("아웃!");
				
			}else {
				System.out.println(sCnt+"S, " + bCnt + "B");
			}
		} System.out.println("GAME OVER " + numList );
	}
}