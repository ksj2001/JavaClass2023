package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {

	HashSet<Member> hashset;
	
	public MemberHashSet(){
		hashset = new HashSet<>();
	}
	
	// 추가 메서드 작성
	public boolean addMember(Member member) {
	  return hashset.add(member);
	}
	
	// 삭제 메서드 작성
	// 멤버 아이디가 같을 때에만 삭제
	public boolean removeMember(int memberId) {
		// HashSet 클래스는 get 메서드가 존재하지 않는다.
		// get 메서드가 없어 반복문 작성이 힘들어지므로 대신 iterator 메서드 사용
		Iterator<Member> it = hashset.iterator();
		
		while(it.hasNext()) { // 다음 자료의 존재 유무 확인
			
			Member member = it.next(); // 다음 요소를 불러온다.
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashset.remove(member);
				return true;
			}
			
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	// 모두 출력하는 메서드
	public void showAll() {
		// 확장 for문 이용
		for(Member member : hashset) {
			System.out.println(member);
		}
	}
}
