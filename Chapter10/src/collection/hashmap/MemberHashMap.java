package collection.hashmap;

import java.util.HashMap;

import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashmap;
	
	public MemberHashMap() {
		hashmap = new HashMap<>();
	}
	
	// ������ �߰� �޼���
	public void addMember(Member member) {
		hashmap.put(member.getMemberId(), member);
		//hashmap.put(1001,new Member(1001,"������"));
	}
	
	// memberId�� ���� Value ���� �޼���
	public boolean removeMember(int memberId) {
		if(hashmap.containsKey(memberId)) {
			hashmap.remove(memberId);
			return true;
		}
		else {
			System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
			return false;
		}
	}
	
	// HashMap ������ ��ü ��� �޼���
	public void showAll() {
		for(Integer keys : hashmap.keySet()) {
			System.out.println(hashmap.get(keys));
		}
	}
}
