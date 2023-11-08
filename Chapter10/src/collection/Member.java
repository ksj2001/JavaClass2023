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
		return memberName+"의 아이디는 "+memberId+"입니다.";
	}

	// HashSet으로 작성한 데이터가 중복되지 않도록 
	// Object 클래스의 equals 메서드와 hashcode 메서드를 반드시 오버라이딩한다.
	
	
	@Override
	public int hashCode() {
		return (this.memberId+this.memberName).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// Object 클래스를 Member 클래스로 다운캐스팅함.
		if(obj instanceof Member) { // obj가 Member 클래스가 맞습니까?
			Member member = (Member)obj;// obj를 Member 클래스로 다운캐스팅
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
		// memberId 기준으로 오름차순 정렬(양수)
		// 음수는 내림차순 정렬
		//return (this.memberId-member.memberId)*(-1);
		// memberName 기준으로 오름차순 정렬
		return this.memberName.compareTo(member.memberName)*(-1);
	}

	@Override
	public int compare(Member member1, Member member2) {
		// member1 : this, member2 : 매개변수를 받는 값
		return member1.memberId-member2.memberId;
	}
	

	
}
