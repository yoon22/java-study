package Exam;
	class DogDog {
		int age;
		String name;		
		}
	class Cat {
		int age;
		String name;
	}
	class Food {
		int n;
		String name;
	}
public class Dog {
	
	public static void main(String[]args) {
		
		DogDog[] dogs = new DogDog[5];
		
		for(int i = 0; i<dogs.length;i++) {
			dogs[i] = new DogDog();	
			double db = Math.random();
			int ran = (int)(db*10)+1;
			
			dogs[i].age = ran;
		}
		
		Cat[] cat = new Cat[5];
		for(int i = 0; i<dogs.length;i++) {
			cat[i] = new Cat();
			cat[i].age = i+3;				
		}
		
		Food[] food = new Food[5];
		for(int i = 0; i<food.length; i++ ) {
			food[i] = new Food();
			food[i].n = i;
		}
		
		
		System.out.println("이 강아지의 나이는 " + dogs[4].age + "살 입니다.");
		System.out.println("이 고양이의 나이는 " + cat[3].age + "살 입니다.");
		System.out.println("떡볶이 " + food[3].n + "인분 입니다.");
		
		
		
		
		
	}

}
