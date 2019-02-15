package oop.inherit;

class GrandFather {
	void work() {
		System.out.println("할아버지가 농사를 지으심");
	}
}
class Father extends GrandFather{
	void work() {
		super.work();
		System.out.println("아빠가 일하심 >_<");
	}
}
public class Son extends Father { 
	
	void work() {
		
		super.work();
		System.out.println("아들이 공부함.");
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.work();
	}

}

