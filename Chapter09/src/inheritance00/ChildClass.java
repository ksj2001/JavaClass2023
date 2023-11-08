package inheritance00;

public class ChildClass extends ParentClass {
	int a = 8;
	int c = 9;
	
	public ChildClass() {
		System.out.println("ChildClass");
		
	}
	
	public void ChildFun() {
		System.out.println("ChildStart");
		System.out.println(a+" "+super.a);
	}
}
