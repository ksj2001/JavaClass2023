package outer;

class Animal {
	public String move() {
		return "";
	}
}

public class AnonymousClass {

	public static void main(String[] args) {

		// �͸� Ŭ���� - Ŭ���� �̸��� �������� ����. ��ȸ��
		Animal dog = new Animal() {
			@Override
			public String move() {
				return "�������� ¢�´�.";
			}
		};
		
		Animal cat = new Animal() {
			@Override
			public String move() {
				return "����̴� ��ϴ�.";
			}	
		};
		
		System.out.println(dog.move());
		System.out.println(cat.move());
	}
}
