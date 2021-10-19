package co.plus.prj.member.service;

import java.util.List;

import co.plus.prj.member.vo.MemberVO;

public interface MemberService {
	//전체목록
	public List<MemberVO> getMembetList();
	//1명 조회
	public MemberVO getMember(MemberVO member);
	//입력
	public int memberInsert(MemberVO member);
	//수정
	public int memberUpdate(MemberVO member);
	//삭제
	public int memberDelete(MemberVO member);
}
