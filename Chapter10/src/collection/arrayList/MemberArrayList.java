package collection.arrayList;

import java.util.ArrayList;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> memberList = new ArrayList<>();
	
	
	// add  메서드 작성
    public void add(Member member) {
    	memberList.add(member);
    }
	
	
	
	//  remove 메서드 작성
    public void remove(int memberId) {
    	if(memberList.size() == 0) {
    		System.out.println("더 이상 삭제할 수 없습니다.");
    	}
    	else {
    		for(int i=0;i<memberList.size();i++) {
    			if(memberId == memberList.get(i).getMemberId()) {
    				memberList.remove(i);
    			}
    		}
    	}
    }
	
	
	// memberList 모두 출력하는 메서드
    public void showAll() {
    	for(int i=0;i<memberList.size();i++) {
			Member member = memberList.get(i);
			System.out.println(member);
		}
    }
}
