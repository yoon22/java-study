package oop.abst;

interface Test {
	public void play();

	public void run();
	// interface의 기본 접근제어자는 public. 안쓰더라도 public 임
	// interface는 메모리를 생성할수없음 (=인스턴스화 할수없음)
}

class Child extends AbstractTest {

	@Override
	public void play() {

	}

	@Override
	public void run() {

	}
}

public abstract class AbstractTest implements Test {
	// 추상화클래스는 abstract를 꼭 써줘야함.
	// implements 할때는 마우스 올리고 오버라이딩 해줬어야했음!
	// 근데 abstract 클래스일때는 안해도 됨 ! ! ! ! !
	
	
	AbstractTest() {
		System.out.println("난 됨");
		// 메모리를 생성할수는 없지만 생성자를 만들수는 있음...?
	}

	public static void main(String[] args) {
		AbstractTest at = new Child();
		// ★ abstract 클래스도 메모리를 생성할 수 없음 ★ 근 데 !!! 
		// 다른 클래스에 상속일경우는....... 이런식으로 ...
		at.play();
	}

}
