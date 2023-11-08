package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {
	TreeSet<Member> treeset;
	
	public MemberTreeSet(){
		treeset = new TreeSet<>(new Member());
		//comparator�� ��ӹ��� Ŭ�������� �����Ѵ�.
		//��, �ݵ�� default ������ �̾���Ѵ�.
	}
	
	// �߰� �޼��� �ۼ�
	public boolean addMember(Member member) {
	  return treeset.add(member);
	}
	
	// ���� �޼��� �ۼ�
	// ��� ���̵� ���� ������ ����
	public boolean removeMember(int memberId) {
		// HashSet Ŭ������ get �޼��尡 �������� �ʴ´�.
		// get �޼��尡 ���� �ݺ��� �ۼ��� ��������Ƿ� ��� iterator �޼��� ���
		Iterator<Member> it = treeset.iterator();
		
		while(it.hasNext()) { // ���� �ڷ��� ���� ���� Ȯ��
			
			Member member = it.next(); // ���� ��Ҹ� �ҷ��´�.
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				treeset.remove(member);
				return true;
			}
			
		}
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	// ��� ����ϴ� �޼���
	public void showAll() {
		// Ȯ�� for�� �̿�
		for(Member member : treeset) {
			System.out.println(member);
		}
	}
}
