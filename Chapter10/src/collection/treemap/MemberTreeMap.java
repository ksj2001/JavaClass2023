package collection.treemap;

import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {
	private TreeMap<Integer, Member> treemap;
	
	public MemberTreeMap() {
		treemap = new TreeMap<>();
	}
	
	// �߰� �޼���
	public void addMember(Member member) {
		treemap.put(member.getMemberId(), member);
	}
	
	// ���� �޼���
	public void removeMember(int memberId) {
		if(treemap.containsKey(memberId)) {
			treemap.remove(memberId);
		}
		else {
			System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		}
	}
	
	// ��ü��� �޼���
	public void showAll() {
		for(Integer t : treemap.keySet()) {
			System.out.println(treemap.get(t));
		}
	}
}
