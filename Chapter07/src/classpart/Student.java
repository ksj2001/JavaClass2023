package classpart;

public class Student {
	// ��� ����
	int studentid;
	String studentname;
	int grade;
	String address;
	
	//������
	//�����ڰ� �ϳ��� �����ϸ� default �����ڴ� ��������� �ʴ´�.
	public Student() {}
	public Student(int id,String name) {
		studentid = id;
		studentname = name;
	}
	// �޼���(�Լ�)
	public void ShowStudentInfo() {
		System.out.println("�л��� �̸��� : "+studentname+"�Դϴ�.");
		System.out.println("�ּҴ� : "+address+"�Դϴ�.");
		
	}
	
	public static void main(String[] args) {
		// �ۼ��� Ŭ������ instance(��üȭ) �Ѵ�.
		// Ŭ������ �ݵ�� new�� �����Ѵ�.
		Student st = new Student(); // ����Ʈ ������
		st.studentname = "ȫ�浿";
		st.address = "��õ�� �ߵ�";
		st.ShowStudentInfo();
		System.out.println();
		st.studentname = "������";
		st.address = "��õ�� ��";
		st.ShowStudentInfo();
	}
}
