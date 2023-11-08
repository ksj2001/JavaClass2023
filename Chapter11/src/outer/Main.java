package outer;

public class Main {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		System.out.println(outer.num);
		System.out.println(outer.str+" "+outer.str10);
		
		// InnerClass 인스턴스 방식
		OuterClass.InnerClass in = outer.new InnerClass();
		System.out.println(in.num);
		System.out.println(in.str2+" "+outer.str10);
		
		// StaticInnerClass 인스턴스 방식
		OuterClass.StaticInnerClass si = new OuterClass.StaticInnerClass();
		System.out.println(si.num);
		System.out.println(outer.str+" "+si.str3);
	}

}
