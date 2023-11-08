package collection.hashset;

import collection.Member;
import collection.arrayList.MemberArrayList;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet member = new MemberHashSet();
		
		Member me = new Member(1001,"������");
		boolean k = member.addMember(me);
		System.out.println(k);
		member.addMember(new Member(1001,"������"));
		member.addMember(new Member(1002,"ȫ�浿"));
		member.addMember(new Member(1003,"���޷�"));
		
		member.showAll();
		System.out.println();
		Member me2 = new Member(1002,"������");
		boolean k2 = member.addMember(me2);
		System.out.println(k2);
		//member.addMember(new Member(1001,"������"));
		member.showAll();
	}

}
