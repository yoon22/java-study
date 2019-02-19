package Exam.ex01;

public class Executer {
	public static void main(String[] args) {
		Object f = new Father();	
		System.out.println(f.toString());
		
		Object f1 = new Father();
		Son s = new Son();
		Father f2 = new Father();
		f2 = new Son();
		
		Object obj = new Son();
		Father f3 = new Son();
		Son s1 = new Son();
		f3.printInfo();
		f2.printInfo();
		s1.printInfo();
		Object[] objs = new Object[3];
		objs[0] = obj;
		objs[1] = f3;
		objs[2] = s1;
		
		Father f4 = (Father)objs[1];
		f4.printInfo();
		
		((Father)objs[1]).printInfo();
		
				
		
		
		
		
		
		
	}
}
