package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap member = new MemberHashMap();
		
		member.addMember(new Member(1001,"������"));
		member.addMember(new Member(1002,"ȫ�浿"));
		member.addMember(new Member(1003,"���޷�"));
		member.showAll();
		System.out.println();
		member.addMember(new Member(1001,"������"));
		member.showAll();
		
	}

}
