package chapter_04_Prob03;

public class Member {
	// 멤버변수
	private String name;
	private String id;
	private String pw;
	private int age;
	
	// 접근자와 설정자
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// 생성자
	public Member(String name, String id, String pw, int age) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
		System.out.printf("이름: %s, 아이디: %s, 패스워드: %s, 나이: %d\n",name,id,pw,age);
	}
}
