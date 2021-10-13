package co.taejoon.prj.member.serviceImpl;

import java.util.Scanner;

import co.taejoon.prj.comm.Command;
import co.taejoon.prj.comm.GB;
import co.taejoon.prj.member.service.MemberService;
import co.taejoon.prj.member.service.MemberVO;

public class MemberSelect implements Command {
	private Scanner sc = new Scanner(System.in);

	public void execute() {
		if (GB.AUTHOR.equals("ADMIN")) {
			MemberService memberService = new MemberServiceImpl();
			MemberVO vo = new MemberVO();
			System.out.println("회원 검색 메뉴입니다.");
			System.out.println("검색할 회원의 ID를 작성해주세요.");
			vo.setId(sc.nextLine());
			vo = memberService.memberSelect(vo);
			vo.toString();
		}
	}
}
