package outer;

class Animal {
	public String move() {
		return "";
	}
}

public class AnonymousClass {

	public static void main(String[] args) {

		// 익명 클래스 - 클래스 이름이 존재하지 않음. 일회용
		Animal dog = new Animal() {
			@Override
			public String move() {
				return "강아지는 짖는다.";
			}
		};
		
		Animal cat = new Animal() {
			@Override
			public String move() {
				return "고양이는 웁니다.";
			}	
		};
		
		System.out.println(dog.move());
		System.out.println(cat.move());
	}
}
