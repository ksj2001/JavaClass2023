package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap member = new MemberTreeMap();
		
		member.addMember(new Member(1002,"김유신"));
		member.addMember(new Member(1003,"홍길동"));
		member.addMember(new Member(1001,"진달래"));
		member.showAll();
		System.out.println();
		member.addMember(new Member(1001,"개나리"));
		member.showAll();

	}

}
