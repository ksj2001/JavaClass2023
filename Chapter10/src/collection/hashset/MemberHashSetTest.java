package collection.hashset;

import collection.Member;
import collection.arrayList.MemberArrayList;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet member = new MemberHashSet();
		
		Member me = new Member(1001,"±èÀ¯½Å");
		boolean k = member.addMember(me);
		System.out.println(k);
		member.addMember(new Member(1001,"±èÀ¯½Å"));
		member.addMember(new Member(1002,"È«±æµ¿"));
		member.addMember(new Member(1003,"Áø´Ş·¡"));
		
		member.showAll();
		System.out.println();
		Member me2 = new Member(1002,"±èÀ¯½Å");
		boolean k2 = member.addMember(me2);
		System.out.println(k2);
		//member.addMember(new Member(1001,"±èÀ¯½Å"));
		member.showAll();
	}

}
