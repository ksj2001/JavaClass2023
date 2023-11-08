package classpart;

public class Student {
	// 멤버 변수
	int studentid;
	String studentname;
	int grade;
	String address;
	
	//생성자
	//생성자가 하나라도 존재하면 default 생성자는 만들어지지 않는다.
	public Student() {}
	public Student(int id,String name) {
		studentid = id;
		studentname = name;
	}
	// 메서드(함수)
	public void ShowStudentInfo() {
		System.out.println("학생의 이름은 : "+studentname+"입니다.");
		System.out.println("주소는 : "+address+"입니다.");
		
	}
	
	public static void main(String[] args) {
		// 작성한 클래스를 instance(객체화) 한다.
		// 클래스는 반드시 new로 생성한다.
		Student st = new Student(); // 디폴트 생성자
		st.studentname = "홍길동";
		st.address = "부천시 중동";
		st.ShowStudentInfo();
		System.out.println();
		st.studentname = "개나리";
		st.address = "부천시 상동";
		st.ShowStudentInfo();
	}
}
