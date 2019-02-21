package Exam;
class Student{
	String name;
	int grade;
	String shoolname;
			
	}


public class StudentArray {
	public static void main(String[]args) {
		Student[] students = new Student[10];
		//student 를 저장할공간 22개를 만들고 안에 null 값이 있음.
		for(int i = 0; i<students.length;i++ ) {
			students[i] = new Student();
			students[i].grade = i+1;		
			System.out.println("students["+i+"] =" +students[i].grade);
			
			
			
			}
			
	
			
		
		}
	
	
	
}
