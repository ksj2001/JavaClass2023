package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet member = new MemberTreeSet();
		
		member.addMember(new Member(1004,"김유신"));
		member.addMember(new Member(1002,"고길동"));
		member.addMember(new Member(1003,"진달래"));
		
		member.showAll();

	}

}
