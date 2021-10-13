package co.taejoon.prj.member.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.taejoon.prj.comm.Command;
import co.taejoon.prj.comm.GB;
import co.taejoon.prj.member.service.MemberService;
import co.taejoon.prj.member.service.MemberVO;

public class MemberList implements Command {

	public void execute() {
		if (GB.AUTHOR.equals("ADMIN")) {
			MemberService memberService = new MemberServiceImpl();
			List<MemberVO> members = new ArrayList<MemberVO>();
			members = memberService.memberSelectList();
			System.out.println("=================================================");
			if (members != null) {
				for (MemberVO member : members) {
					member.toListString();
				}
			} else {
				System.out.println("등록된 회원이 없습니다.");
			}
		} else {
			System.out.println("ADMIN 계정으로 접속해야만 확인할 수 있습니다.");
		}
		System.out.println("=================================================");

	}

}
