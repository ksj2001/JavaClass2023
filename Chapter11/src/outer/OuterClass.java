package outer;

public class OuterClass {
	int num = 10;
	String str = "Java";
	static String str10 = "World";
	
	public OuterClass() {
		System.out.println("OuterClass Constructor");
	}
	
	// InnerClass 작성
	class InnerClass{
		int num = 100;
		String str2 = str;
		
		public InnerClass() {
			System.out.println("InnerClass Constructor");
		}
	}
	
	// StaticInnerClass 작성
	static class StaticInnerClass{
		int num = 1000;
		String str3 = str10;
		
		public StaticInnerClass() {
			System.out.println("StaticInnerClass Constructor");
		}
	}
}
