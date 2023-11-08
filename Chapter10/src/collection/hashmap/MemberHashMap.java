package collection.hashmap;

import java.util.HashMap;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashmap;
	
	public MemberHashMap() {
		hashmap = new HashMap<>();
	}
	
	// 데이터 추가 메서드
	public void addMember(Member member) {
		hashmap.put(member.getMemberId(), member);
		//hashmap.put(1001,new Member(1001,"개나리"));
	}
	
	// memberId가 같은 Value 삭제 메서드
	public boolean removeMember(int memberId) {
		if(hashmap.containsKey(memberId)) {
			hashmap.remove(memberId);
			return true;
		}
		else {
			System.out.println(memberId + "는 존재하지 않습니다.");
			return false;
		}
	}
	
	// HashMap 데이터 전체 출력 메서드
	public void showAll() {
		for(Integer keys : hashmap.keySet()) {
			System.out.println(hashmap.get(keys));
		}
	}
}
