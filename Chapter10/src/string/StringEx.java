package string;

public class StringEx {

	public static void main(String[] args) {
		String str1 = new String("java");
		System.out.println(System.identityHashCode(str1));
		
		// StringBuilder�� ���� �������� ��� ���ڸ� �����ϴ� Ŭ�����̴�.
		StringBuilder builder = new StringBuilder(str1);
		// append�� String Builder�� �߰� �޼����̴�.
		builder.append(" android");
		builder.append(" and");
		builder.append(" programing");
		builder.append(" fun");
		
		//String str2 = new String("android");
		//str1 = str1.concat(str2);
		System.out.println(System.identityHashCode(str1));
		// StringBuilder�� ���� ��ȯ�� toString���� �Ѵ�.
		System.out.println(builder.toString());
		System.out.println(System.identityHashCode(builder));
		
	}

}
