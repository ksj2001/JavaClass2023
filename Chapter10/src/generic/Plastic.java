package generic;

public class Plastic extends Material{
	@Override
	public String toString() {
		return "재료는 plastic입니다.";
	}

	@Override
	public void doPrint() {
		System.out.println("plastic을 출력하는 중입니다.");
	}
}
