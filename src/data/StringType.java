package data;

public class StringType {
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+123);
		String str2 = new String("123");
				// == �ٶ󺸰� �ִ� �ּ�? �� ������ .
				System.out.println(str.contentEquals(str2));
				System.out.println(str==str2);

		
	}
}
