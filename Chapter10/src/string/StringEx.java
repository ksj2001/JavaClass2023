package string;

public class StringEx {

	public static void main(String[] args) {
		String str1 = new String("java");
		System.out.println(System.identityHashCode(str1));
		
		// StringBuilder는 단일 스레드인 경우 문자를 나열하는 클래스이다.
		StringBuilder builder = new StringBuilder(str1);
		// append는 String Builder의 추가 메서드이다.
		builder.append(" android");
		builder.append(" and");
		builder.append(" programing");
		builder.append(" fun");
		
		//String str2 = new String("android");
		//str1 = str1.concat(str2);
		System.out.println(System.identityHashCode(str1));
		// StringBuilder의 문자 반환은 toString으로 한다.
		System.out.println(builder.toString());
		System.out.println(System.identityHashCode(builder));
		
	}

}
