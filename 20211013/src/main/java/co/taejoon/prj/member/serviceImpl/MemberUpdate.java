package co.taejoon.prj.member.serviceImpl;

import java.util.Scanner;

import co.taejoon.prj.comm.Command;
import co.taejoon.prj.comm.GB;
import co.taejoon.prj.member.service.MemberService;
import co.taejoon.prj.member.service.MemberVO;

public class MemberUpdate implements Command {
	private Scanner sc = new Scanner(System.in);

	public void execute() {

		MemberService memberService = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		int n = 0;
		if (GB.AUTHOR.equals("ADMIN")) {
			System.out.println("회원 정보를 수정합니다.");
			System.out.println("수정할 회원의 ID를 입력해주세요.");
			vo.setId(sc.nextLine());
			System.out.println("선택한 회원의 이름을 입력해주세요.");
			vo.setName(sc.nextLine());
			System.out.println("선택한 회원이 사용할 비밀번호를 입력해주세요.");
			vo.setPassword(sc.nextLine());
			System.out.println("선택한 회원의 연락처를 입력해주세요.");
			vo.setTel(sc.nextLine());
			System.out.println("선택한 회원의 주소를 입력해주세요.");
			vo.setAddress(sc.nextLine());
			System.out.println("선택한 회원의 권한을 입력해주세요. [USER or ADMIN]");
			vo.setAuthor(sc.nextLine());
			n = memberService.memberUpdate(vo);
			if (n != 0) {
				System.out.println("정상적으로 수정되었습니다.");
			} else {
				System.out.println("수정에 실패하였습니다.");
			}
		}
	}
}
