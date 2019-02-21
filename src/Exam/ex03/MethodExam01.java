package Exam.ex03;

public class MethodExam01 {
	public String name = "김시윤"; 
	public static void setTest(MethodExam01 me) {
		me = new MethodExam01();
		//새로만든 me 는 여기서 끝이당.....??????
		
	}
	public static void main(String[] args) {
		MethodExam01 me = new MethodExam01();	
		//static이 아니기때문에 사용하기 위해서는 호출이 필요 
		me.name = "임꺽정";
		MethodExam01.setTest(me); 
		System.out.println(me.name);
	}

}
