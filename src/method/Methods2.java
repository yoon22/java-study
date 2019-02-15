package method;

public class Methods2 {
	static void add( int a, int b) {
		//add는 int 매개변수 2개가 필요함. 
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		add(1,0);
		int a =1;
		add(a,3);
		int b =10;
		add(a,b);
	
	}
}
