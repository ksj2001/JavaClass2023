package collection.arrayList;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList member = new MemberArrayList();
		
		member.add(new Member(1001,"������"));
		member.add(new Member(1002,"ȫ�浿"));
		member.add(new Member(1003,"���޷�"));
		member.showAll();
		member.remove(1001);
		member.showAll();
	}

}
