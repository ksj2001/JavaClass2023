package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap member = new MemberHashMap();
		
		member.addMember(new Member(1001,"김유신"));
		member.addMember(new Member(1002,"홍길동"));
		member.addMember(new Member(1003,"진달래"));
		member.showAll();
		System.out.println();
		member.addMember(new Member(1001,"개나리"));
		member.showAll();
		
	}

}
