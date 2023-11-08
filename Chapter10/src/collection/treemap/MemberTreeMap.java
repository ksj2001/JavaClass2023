package collection.treemap;

import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {
	private TreeMap<Integer, Member> treemap;
	
	public MemberTreeMap() {
		treemap = new TreeMap<>();
	}
	
	// 추가 메서드
	public void addMember(Member member) {
		treemap.put(member.getMemberId(), member);
	}
	
	// 삭제 메서드
	public void removeMember(int memberId) {
		if(treemap.containsKey(memberId)) {
			treemap.remove(memberId);
		}
		else {
			System.out.println(memberId+"가 존재하지 않습니다.");
		}
	}
	
	// 전체출력 메서드
	public void showAll() {
		for(Integer t : treemap.keySet()) {
			System.out.println(treemap.get(t));
		}
	}
}
