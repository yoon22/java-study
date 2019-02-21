package Exam.ex03;

public class Person {
	public String name;
	public int age;
	
	public static void main(String[]args) {
		Person[] p = new Person[3];
		for(int i = 0; i <p.length; i++) {
			p[i] = new Person();  
			//p[i]에는 name,age가 없으니 Person 불러와야햄...
			//name,age 은 static 도 아니고!!!!!!!! 
			//안하면 안에는 p[i]는 null 임...!!!!!!!
			p[i].name ="이름" + i;
			p[i].age = i;	
			
		}
		for(int i = 0; i <p.length; i++) {
			System.out.println("p["+i+"].name = " + p[i].name );
			System.out.println("p["+i+"].age = " + p[i].age );
			
		}
		
		

	}

}
