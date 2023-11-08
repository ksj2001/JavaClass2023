package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {

	HashSet<Member> hashset;
	
	public MemberHashSet(){
		hashset = new HashSet<>();
	}
	
	// �߰� �޼��� �ۼ�
	public boolean addMember(Member member) {
	  return hashset.add(member);
	}
	
	// ���� �޼��� �ۼ�
	// ��� ���̵� ���� ������ ����
	public boolean removeMember(int memberId) {
		// HashSet Ŭ������ get �޼��尡 �������� �ʴ´�.
		// get �޼��尡 ���� �ݺ��� �ۼ��� ��������Ƿ� ��� iterator �޼��� ���
		Iterator<Member> it = hashset.iterator();
		
		while(it.hasNext()) { // ���� �ڷ��� ���� ���� Ȯ��
			
			Member member = it.next(); // ���� ��Ҹ� �ҷ��´�.
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				hashset.remove(member);
				return true;
			}
			
		}
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	// ��� ����ϴ� �޼���
	public void showAll() {
		// Ȯ�� for�� �̿�
		for(Member member : hashset) {
			System.out.println(member);
		}
	}
}
