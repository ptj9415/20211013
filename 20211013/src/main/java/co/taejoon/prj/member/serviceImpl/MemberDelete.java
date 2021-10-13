package co.taejoon.prj.member.serviceImpl;

import java.util.Scanner;

import co.taejoon.prj.comm.Command;
import co.taejoon.prj.comm.GB;
import co.taejoon.prj.member.service.MemberService;
import co.taejoon.prj.member.service.MemberVO;

public class MemberDelete implements Command {
	private Scanner sc = new Scanner(System.in);

	public void execute() {
		if (GB.AUTHOR.equals("ADMIN")) {
			MemberService memberService = new MemberServiceImpl();
			int n = 0;
			MemberVO vo = new MemberVO();
			System.out.println("회원 정보를 삭제합니다.");
			System.out.println("삭제할 회원의 ID를 입력해주세요.");
			vo.setId(sc.nextLine());
			n = memberService.memberDelete(vo);
			if (n != 0) {
				System.out.println("회원 정보가 삭제되었습니다.");
			} else {
				System.out.println("삭제를 실패하였습니다.");
			}
		} else {
			System.out.println("ADMIN 계정으로 접속해야 사용할 수 있습니다.");
		}
	}
}
