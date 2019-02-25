package collection.list;

import java.util.ArrayList;

class Dog {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}

public class DogList {
	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Dog d = new Dog();
			d.setName("뭉뭉" + (i + 1));
			d.setAge(i + 1);
			dogList.add(d);
		}
		
		for(int i =0;i<10;i++) {
			System.out.println(dogList.get(i).getName());
			System.out.println(dogList.get(i).getAge());
		}

	}
}
