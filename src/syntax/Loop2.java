package syntax;

public class Loop2 {
	
	public static void main(String[]args) {
		
		for(int i=1;i<=9;i++) {
			System.out.println();
			for(int j=1; j<=9;j++) {				
				System.out.print(i+ " X "+j+" = " + i*j+", ");
			}
		}
	}
}
