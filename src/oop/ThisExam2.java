package oop;

public class ThisExam2 {
	
	int num1 =5;
	String str ="바보";
	
	ThisExam2(){}
	
	ThisExam2(int num1, String str){
		num1 =this.num1;
		str=this.str;
		System.out.println(num1);
		System.out.println(str);
		
	}
	
	public static void main(String[]agsr) {
		ThisExam2 te = new ThisExam2(10,"abc");
		
		
	}
			
	
}
