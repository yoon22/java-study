package Exam.ex03;

public class MultiDimension {
	public int[][] nums = new int[100][];

	public static void main(String[] args) {
		MultiDimension md = new MultiDimension();
		//다차원 배열의 초기화 시작 
		for(int i =0; i<md.nums.length;i++) {
			md.nums[i] = new int[i+1];
			System.out.println(i+"층의 방 갯수 : " + md.nums[i].length);
		}
		//다차원 배열의 초기화 끝
		int num =1;
		for (int i =0; i<md.nums.length;i++) {
			System.out.print(i+"층 : ");
			for (int j =0; j<md.nums[i].length;j++) {
				System.out.print((num++)+",");			
			}
			System.out.println();			
		}
	}

}
