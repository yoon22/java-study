package collection.list;

import java.util.ArrayList;
import java.util.List;

class Cat {
	private String name;
	private int age;
	
	public Cat(String name, int age) {  // alt + c ~~!!! 생성자 
		super();
		this.name = name;
		this.age = age;
	}
	public Cat() {
		super();
	}
	//getter ~~~~ 의무화 
	//toString 은 매너? ㅇㅅㅇ???? 있으면 편함!!!!!!
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class CatList {
 public static void main(String[] args) {
	
	 List<Cat> catList = new ArrayList<>();
	 for(int i =0;i<10;i++) {
		 Cat cat1 = new Cat();
		int ran = (int)(Math.random()*30+1);
		 cat1.setName("냥이"+(i+1));
		 cat1.setAge(ran);
		 catList.add(cat1);
	 }
	 for(int i =0;i<10;i++) {
		 System.out.println(catList.get(i));

	 }
 }
}
