package oop.inherit;

class Book{
	String name;
	int year;
	Book() {	
		this("자바의정석",2019);
	}

	
	Book(String name,int year){
		
		
		this.name = "책 제목 : " + name;
		this.year = year;
		//this.name("자바의 정석"); 보다 구조적인 방법.
		//this 안에 스트링이 들어가서 5번 라인에 감! 
		//그래서 name에 자바의 정석이 들어가는거임. 		
	}
}
public class ConsExam extends Book{
	ConsExam (){
		super();
	}
	public static void main(String[]args) {
		ConsExam ce = new ConsExam();
		System.out.println(ce.name);
		System.out.println(ce.year);
		
		Book b = new Book();
		System.out.println(b);
		
		
		
	}
}
