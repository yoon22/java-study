package Exam.ex03;

public class StaticExam01 {
	public static String name = "하하";
	public String name1 = "호호";
	
	public static void test() {
		System.out.println(StaticExam01.name);
	}
	
	public static void main(String[] args) {
		
		StaticExam01 se = new StaticExam01();
		se.name = "허허허허허허";
		se.name1 = "하하하하하하";
		StaticExam01 se1 = new StaticExam01();
		
		System.out.println(se1.name);
		System.out.println(se1.name1);
		
	}

}
