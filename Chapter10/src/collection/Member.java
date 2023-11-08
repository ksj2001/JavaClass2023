package collection;

import java.util.Comparator;

public class Member implements Comparable<Member>,Comparator<Member> {
  
	private int memberId;
	private String memberName;
	
	public Member() {}
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName+"�� ���̵�� "+memberId+"�Դϴ�.";
	}

	// HashSet���� �ۼ��� �����Ͱ� �ߺ����� �ʵ��� 
	// Object Ŭ������ equals �޼���� hashcode �޼��带 �ݵ�� �������̵��Ѵ�.
	
	
	@Override
	public int hashCode() {
		return (this.memberId+this.memberName).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// Object Ŭ������ Member Ŭ������ �ٿ�ĳ������.
		if(obj instanceof Member) { // obj�� Member Ŭ������ �½��ϱ�?
			Member member = (Member)obj;// obj�� Member Ŭ������ �ٿ�ĳ����
			if(member.memberId == this.memberId 
					&& member.memberName.equals(this.memberName)) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Member member) {
		// memberId �������� �������� ����(���)
		// ������ �������� ����
		//return (this.memberId-member.memberId)*(-1);
		// memberName �������� �������� ����
		return this.memberName.compareTo(member.memberName)*(-1);
	}

	@Override
	public int compare(Member member1, Member member2) {
		// member1 : this, member2 : �Ű������� �޴� ��
		return member1.memberId-member2.memberId;
	}
	

	
}
