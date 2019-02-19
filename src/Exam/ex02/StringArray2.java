package Exam.ex02;

public class StringArray2 {
	public String[] strs;
	StringArray2() {
		strs = new String[10];
	}
		
	
	public static void main(String[] args) {
		StringArray2 sa1 = new StringArray2();
		StringArray2 sa2 = new StringArray2();
		//sa1 방갯수 10 개 1~10
		//sa2 방갯수 10개 10~1
		for ( int i = 0 ; i<10 ; i++) {
			sa1.strs[i] =(i+1) +"";
			System.out.println("sa1.strs["+i+"] = " + sa1.strs[i]);
			
		}
		
		System.out.println();
	
		for ( int i = 0 ; i<10 ; i++) {			
			sa2.strs[i] = (10-i) + "";
			System.out.println("sa2.strs["+i+"] = " + sa2.strs[i]);
		}
			
		
		
		
		
		
	}

}
