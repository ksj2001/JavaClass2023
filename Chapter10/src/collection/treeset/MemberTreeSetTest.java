package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		
		MemberTreeSet member = new MemberTreeSet();
		
		member.addMember(new Member(1004,"������"));
		member.addMember(new Member(1002,"��浿"));
		member.addMember(new Member(1003,"���޷�"));
		
		member.showAll();

	}

}
