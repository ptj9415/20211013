package co.taejoon.prj.member.serviceImpl;

import java.util.Scanner;

import co.taejoon.prj.comm.Command;
import co.taejoon.prj.comm.GB;
import co.taejoon.prj.member.service.MemberService;
import co.taejoon.prj.member.service.MemberVO;

public class MemberInsert implements Command {
	private Scanner sc = new Scanner(System.in);

	public void execute() {
		if (GB.AUTHOR.equals("ADMIN")) {
			MemberService memberService = new MemberServiceImpl();
			MemberVO vo = new MemberVO();
			int n = 0;
			System.out.println("회원정보를 추가합니다.");
			System.out.println("등록할 회원이 사용할 ID를 입력해주세요.");
			vo.setId(sc.nextLine());
			System.out.println("등록할 회원의 이름을 입력해주세요.");
			vo.setName(sc.nextLine());
			System.out.println("등록할 회원이 사용할 비밀번호를 입력해주세요.");
			vo.setPassword(sc.nextLine());
			System.out.println("등록할 회원의 연락처를 입력해주세요.");
			vo.setTel(sc.nextLine());
			System.out.println("등록할 회원의 주소를 입력해주세요.");
			vo.setAddress(sc.nextLine());
			n = memberService.memberInsert(vo);
			if (n != 0) {
				System.out.println("정상적으로 등록되었습니다.");
			} else {
				System.out.println("등록에 실패하였습니다.");
			}
		} else {
			System.out.println("ADMIN 계정으로 접속해야 사용할 수 있습니다.");
		}
	}

}
