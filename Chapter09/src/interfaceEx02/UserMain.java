package interfaceEx02;

public class UserMain {

	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal monkey = new Monkey();
		Animal chicken = new Chicken();
		
		cat.eat("����");
		monkey.eat("����");
		chicken.eat("���");
		System.out.println();
		cat.work("�׹�");
		monkey.work("�׹� �Ǵ� �ι�");
		chicken.work("�ι�");
		System.out.println();
		cat.sleep("�������");
		monkey.sleep("������");
		chicken.sleep("����");
	}

}
