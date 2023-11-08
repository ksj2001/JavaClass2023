package object;

class Student{
	int studentId;
	String studentName;
	
	public Student() {}
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
		 Student st = (Student)obj;
		 if(st.studentId == studentId && st.studentName.equals(studentName)) {
			 return true;
		 }else
			 return false;
		}
		else
			return false;
		
	}
	
	// equals를 오버라이딩 할 때에는 hashcode도 함께 오버라이딩 해야 한다.
	@Override
	public int hashCode() {
		return studentId;
	}
	
	
	
}

public class EqualsEx {

	public static void main(String[] args) {
		Student student1 = new Student(1001,"홍길동");
		Student student2 = new Student(1001,"홍길동");
		System.out.println(student1.equals(student2));
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
	}

}
