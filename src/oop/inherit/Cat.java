package oop.inherit;

public class Cat extends Animal{
	Cat(int age, String type) {
		this.age = age;
		this.type = type;
		//현재 this 가 가리키는건 cat 
		//그런데 동작하는 이유는 Animal에 있으니.
	}
	public static void main(String[] atgs) {
		Cat cat = new Cat(6,"샴");
		cat.eat();
		cat.sleep();
		cat.run();
		Animal animal = new Dog(6,"푸들");
		animal.eat();
		animal.sleep();
		animal.run();
		
		
		
	}


}
