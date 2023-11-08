package interfaceEx02;

public class UserMain {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal monkey = new Monkey();
		Animal chicken = new Chicken();
		
		cat.eat("생선");
		monkey.eat("과일");
		chicken.eat("사료");
		System.out.println();
		cat.work("네발");
		monkey.work("네발 또는 두발");
		chicken.work("두발");
		System.out.println();
		cat.sleep("엎드려서");
		monkey.sleep("누워서");
		chicken.sleep("서서");
	}

}
