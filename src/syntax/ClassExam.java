package syntax;

public class ClassExam {
	int a = 1;
	char c = '3';
	String s = "5";
	
	void test( ) {
		System.out.println("난 ClassExam꺼! ");
	}
	public static void main(String[] args) {
		int a = 1;
		ClassExam ce = new ClassExam();
		//ce = 해당클래스가 가지고있는 어떤것도 호출할수 있음.
		System.out.println(ce.a);
		System.out.println(ce.c);
		System.out.println(ce.s);
		ce.test();
		
		
		
	}

}
