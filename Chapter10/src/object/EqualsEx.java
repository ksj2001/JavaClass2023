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
	
	// equals�� �������̵� �� ������ hashcode�� �Բ� �������̵� �ؾ� �Ѵ�.
	@Override
	public int hashCode() {
		return studentId;
	}
	
	
	
}

public class EqualsEx {

	public static void main(String[] args) {
		Student student1 = new Student(1001,"ȫ�浿");
		Student student2 = new Student(1001,"ȫ�浿");
		System.out.println(student1.equals(student2));
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
	}

}
