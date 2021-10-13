package co.taejoon.prj.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.taejoon.prj.board.serviceImpl.BoardDelete;
import co.taejoon.prj.board.serviceImpl.BoardInsert;
import co.taejoon.prj.board.serviceImpl.BoardList;
import co.taejoon.prj.board.serviceImpl.BoardSelect;
import co.taejoon.prj.board.serviceImpl.BoardUpdate;
import co.taejoon.prj.comm.Command;
import co.taejoon.prj.member.serviceImpl.LoginCheck;
import co.taejoon.prj.member.serviceImpl.MemberDelete;
import co.taejoon.prj.member.serviceImpl.MemberInsert;
import co.taejoon.prj.member.serviceImpl.MemberList;
import co.taejoon.prj.member.serviceImpl.MemberSelect;
import co.taejoon.prj.member.serviceImpl.MemberUpdate;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private Map<String, Command> map = new HashMap<String, Command>();

	public Menu() { // 생성될 때 명령 실행그룹(map 구조) 만들기
		map.put("boardList", new BoardList());
		map.put("boardSelect", new BoardSelect());
		map.put("boardUpdate", new BoardUpdate());
		map.put("boardInsert", new BoardInsert());
		map.put("boardDelete", new BoardDelete());
		map.put("memberList", new MemberList());
		map.put("memberSelect", new MemberSelect());
		map.put("memberUpdate", new MemberUpdate());
		map.put("memberInsert", new MemberInsert());
		map.put("memberDelete", new MemberDelete());
		map.put("memberLogin", new LoginCheck());
	}

	private void mainTitle() {
		System.out.println("********메인 메뉴********");
		System.out.println("=========================");
		System.out.println("      1. 회원 관리       ");
		System.out.println("    2. 공지사항 관리     ");
		System.out.println("         3. 종료         ");
		System.out.println("=========================");
		System.out.print("원하는 작업을 선택하세요 >> ");

	}

	private void memberTitle() {
		System.out.println();
		System.out.println("********회원정보 관리 메뉴********");
		System.out.println("==================================");
		System.out.println("         1. 회원정보 조회         ");
		System.out.println("         2. 회원정보 검색         ");
		System.out.println("         3. 회원정보 추가         ");
		System.out.println("         4. 회원정보 수정         ");
		System.out.println("         5. 회원정보 삭제         ");
		System.out.println("        6. 메인 메뉴로 이동       ");
		System.out.println("==================================");
		System.out.print("원하는 작업을 선택하세요 >>");
	}

	private void boardTitle() {
		System.out.println("1. 공지사항 목록");
		System.out.println("2. 공지사항 조회");
		System.out.println("3. 공지사항 등록");
		System.out.println("4. 공지사항 수정");
		System.out.println("5. 공지사항 삭제");
		System.out.println("6. 메인 메뉴로 이동");
		System.out.println("원하는 작업을 선택하세요.");
	}

	private void menu() {
		while (true) {
			mainTitle();
			int jobNo = sc.nextInt();
			sc.nextLine();
			if (jobNo == 1) {
				memberManagement();
				continue;
			} else if (jobNo == 2) {
				boardManagement();
				continue;
			} else {
				System.out.println("Good Bye!!!");
				sc.close();
				return;
			}
		}
	}

	private void memberManagement() {
		boolean b = false;
		do {
			memberTitle();
			int key = sc.nextInt();
			sc.nextLine();
			switch (key) {
			case 1:
				executeRun("memberList");
				break;
			case 2:
				executeRun("memberSelect");
				break;
			case 3:
				executeRun("memberInsert");
				break;
			case 4:
				executeRun("memberUpdate");
				break;
			case 5:
				executeRun("memberDelete");
				break;
			case 6:
				b = true;
				break;
			}
		} while (!b);
	}

	private void boardManagement() {
		boolean b = false;
		do {
			boardTitle();
			int key = sc.nextInt();
			sc.nextLine();
			switch (key) {
			case 1:
				executeRun("boardList");
				break;
			case 2:
				executeRun("boardSelect");
				break;
			case 3:
				executeRun("boardInsert");
				break;
			case 4:
				executeRun("boardUpdate");
				break;
			case 5:
				executeRun("boardDelete");
				break;
			case 6:
				b = true;
				break;
			}
		} while (!b);
	}

	private void executeRun(String string) {
		Command command = map.get(string);
		command.execute();
	}
	
	public void run() {
		menu();
	}
}
