package outer;

interface Remocon {
	void on();
	void off();
}

// Remocon 인터페이스를 implements 하지 않고 익명 클래스로 작성 가능.
// 단, 인터페이스를 하나만 사용할 수 있다.
// 익명 클래스는 재사용이 불가능하다.
class Anonymous {
	Remocon TV = new Remocon() {
		@Override
		public void on() {
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void off() {
			System.out.println("TV를 끕니다.");
		}	
	};
	
	Remocon Radio = new Remocon() {
		@Override
		public void on() {
			System.out.println("라디오를 켭니다.");
		}

		@Override
		public void off() {
			System.out.println("라디오를 끕니다.");
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
