package Exam.ex04;

public class Person implements Action{

	@Override
	public void speak() {
		System.out.println("말하다");
		
	}

	@Override
	public void sleep() {
		System.out.println("자다");
		
	}

	@Override
	public void eat() {
		System.out.println("먹다");
		
	}

}
