package collection.treemap;

import collection.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap member = new MemberTreeMap();
		
		member.addMember(new Member(1002,"������"));
		member.addMember(new Member(1003,"ȫ�浿"));
		member.addMember(new Member(1001,"���޷�"));
		member.showAll();
		System.out.println();
		member.addMember(new Member(1001,"������"));
		member.showAll();

	}

}
