package collection.arrayList;

import java.util.ArrayList;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> memberList = new ArrayList<>();
	
	
	// add  �޼��� �ۼ�
    public void add(Member member) {
    	memberList.add(member);
    }
	
	
	
	//  remove �޼��� �ۼ�
    public void remove(int memberId) {
    	if(memberList.size() == 0) {
    		System.out.println("�� �̻� ������ �� �����ϴ�.");
    	}
    	else {
    		for(int i=0;i<memberList.size();i++) {
    			if(memberId == memberList.get(i).getMemberId()) {
    				memberList.remove(i);
    			}
    		}
    	}
    }
	
	
	// memberList ��� ����ϴ� �޼���
    public void showAll() {
    	for(int i=0;i<memberList.size();i++) {
			Member member = memberList.get(i);
			System.out.println(member);
		}
    }
}
