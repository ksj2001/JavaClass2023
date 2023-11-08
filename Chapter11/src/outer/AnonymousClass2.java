package outer;

interface Remocon {
	void on();
	void off();
}

// Remocon �������̽��� implements ���� �ʰ� �͸� Ŭ������ �ۼ� ����.
// ��, �������̽��� �ϳ��� ����� �� �ִ�.
// �͸� Ŭ������ ������ �Ұ����ϴ�.
class Anonymous {
	Remocon TV = new Remocon() {
		@Override
		public void on() {
			System.out.println("TV�� �մϴ�.");
		}

		@Override
		public void off() {
			System.out.println("TV�� ���ϴ�.");
		}	
	};
	
	Remocon Radio = new Remocon() {
		@Override
		public void on() {
			System.out.println("������ �մϴ�.");
		}

		@Override
		public void off() {
			System.out.println("������ ���ϴ�.");
		}	
	};
}

public class AnonymousClass2 {

	public static void main(String[] args) {
		Anonymous a = new Anonymous();
		a.TV.on();
		a.TV.off();
		a.Radio.on();
		a.Radio.off();
	}

}
