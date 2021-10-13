package co.taejoon.prj.board.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardVO {
	private int BId;
	private String BWriter;
	private Date BWriteDate;
	private String BTitle;
	private String BContents;
	private int BHit;

	public void toListString() {
		System.out.print(BId + " : ");
		System.out.print(BWriter + " : ");
		System.out.print(BWriteDate + " : ");
		System.out.print(BTitle + " : ");
		System.out.print(BHit + "\n");
	}

	public String toString() {
		System.out.println("글번호 : " + BId);
		System.out.println("작성자 : " + BWriter);
		System.out.println("작성일자 : " + BWriteDate);
		System.out.println("제 목 : " + BTitle);
		System.out.println("내 용 : " + BContents);
		System.out.println("조회수 : " + BHit);
		return null;
	}
}
