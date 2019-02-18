package oop.inherit;
//Mother는 데이터타입이 될수있음.
class Mother1{
	int age = 55;
	String name = "옴마♥";
	Mother1() {
		System.out.println("난 엄마 생성자!");
	}
	
	void attack() {
		System.out.println("엄마가 등짝 스매싱을!!");
	}
	
}

public class Extends1 extends Mother1{ 
	Extends1 () {
		System.out.println("난 확장 생성자!!");
		attack();
	}
	public static void main(String[] args) {
		Extends1 e = new Extends1();
		System.out.println(e.age);
		
	}

}
