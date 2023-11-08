package chapter_06_Prob02;

public class Student extends Person{
	protected int studentID;

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public Student() {}
	public Student(String name, int age, int studentID) {
		super.name = name;
		super.age = age;
		this.studentID = studentID;
	}
	
	@Override
	public String show() {
		return String.format("���[�̸� : "+name+", ���� : "+age+", �й� : "+studentID+"]");
	}
}