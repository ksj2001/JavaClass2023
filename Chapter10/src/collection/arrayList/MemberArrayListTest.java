package collection.arrayList;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList member = new MemberArrayList();
		
		member.add(new Member(1001,"±èÀ¯½Å"));
		member.add(new Member(1002,"È«±æµ¿"));
		member.add(new Member(1003,"Áø´Þ·¡"));
		member.showAll();
		member.remove(1001);
		member.showAll();
	}

}
