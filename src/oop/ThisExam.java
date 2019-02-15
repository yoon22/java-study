package oop;

public class ThisExam {
	int num = 10;
	
	
	void setNum(int num) {
		this.num = num;
		//여기서 thit.num 은 4번라인의 num을 의미함.
	}
	
	int getNum() {
		return this.num;
	}
	public static void main(String[] args) {
		ThisExam te = new ThisExam();
		System.out.println(te.num);
		System.out.println(te.getNum());
		te.setNum(5);
		System.out.println(te.num);
		System.out.println(te.getNum());
		
		
	}
}