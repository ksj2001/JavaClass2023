package returnPackage;

public class This {
	String name;
	String address;
	int age;
	int total;
	//생성자
	public This() {
		
	}
	public This(String name, String address, int age, int total) {
		this.name = name; // this 클래스의 name 멤버 변수를 this.name으로 표현한다.
		this.address = address;
		this.age = age;
		this.total = total;
	}
}
