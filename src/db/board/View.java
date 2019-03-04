package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		System.out.println("==================================");
		System.out.println("       환  영  합  니  다 ");
		System.out.println("아래에서 아이디를 입력해 보세요!");
		System.out.println("==================================");
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		do {
			System.out.print("아이디 : ");
			String id = scan.nextLine();
			if ("osfu".equals(id)) {
				System.out.print("비밀번호 : ");
				String pwd = scan.nextLine();
				if ("12345678".equals(pwd)) {
					BoardService bs = new BoardService();
					
					System.out.println("==================================");
					System.out.println("환영합니다 osfu 님! ");
					while (!"q".equals(cmd)) {
						System.out.println("==================================");
						System.out.println("1.게시물 등록 ");
						System.out.println("2.게시물 삭제");
						System.out.println("3.게시물 조회");
						System.out.println("4.게시물 수정");
						System.out.println("q.종료");
						System.out.println("==================================");
						System.out.println("원하시는 번호를 눌러주세요! ");
						System.out.print("번호 : ");
						cmd = scan.nextLine();
						if("3".equals(cmd)) {
							bs.selectBoard();
						}else if("1".equals(cmd)) {
							System.out.print("제목 : ");
							String title = scan.nextLine();
							System.out.print("내용 : ");
							String content = scan.nextLine();
							bs.insertBoard(title,content);
						}else if("2".equals(cmd)) {
							System.out.println("삭제할 게시글 번호를 입력해주세요.");
							String num = scan.nextLine();
							int num1 = Integer.parseInt(num);
							bs.deleteBoard(num1);
						}else if("4".equals(cmd)) {
							System.out.println("수정하고싶은 글 번호를 입력해주세요.");
							String num = scan.nextLine();
							int num1 = Integer.parseInt(num);
							System.out.println("★ 수정 화면 ★");
							System.out.print("제목 : ");
							String title = scan.nextLine();
							System.out.print("내용 : ");
							String content = scan.nextLine();
							
							bs.updateBoard(title,content,num1);
						}
						
					
					}
				} else {
					System.out.println("비밀번호가 틀렸습니다. ");
				}
			} else {
				System.out.println("없는 아이디 입니다!");
			}

		} while (!"q".equals(cmd));
		System.out.println("이용해주셔서 감사합니다!ㅎㅅㅎ");

	}
}
