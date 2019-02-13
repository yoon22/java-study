package syntax;

public class Condition {
	
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		boolean isEqual = num1==num2;
		// == 의 결과값 데이터타입이 boolean 이기때문에  
		//if (isEqual) 넣을 수 있음.     
		if(!isEqual) { 
			System.out.println("num1과 num2는 같습니다.");
		} else {
			System.out.println("num1과 num2는 다릅니다.");
			
		}
		//같다고 물어볼때는 ==
		//다르냐고 물어볼때는 !=
		//! 는 부정연산자. isEqual 과 !isEqual 의 차이~~! 
		//!true 는 false
		//!false 는 true
	}
}
