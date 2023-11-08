package generic;

public class Powder extends Material{
	@Override
	public String toString() {
		return "재료는 powder입니다.";
	}
	
	@Override
	public void doPrint() {
		System.out.println("powder를 출력하는 중입니다.");
	}
}
