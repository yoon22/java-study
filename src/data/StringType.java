package data;

public class StringType {
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+123);
		String str2 = new String("123");
				// == 바라보고 있는 주소? 가 같은지 .
				System.out.println(str.contentEquals(str2));
				System.out.println(str==str2);

		
	}
}
