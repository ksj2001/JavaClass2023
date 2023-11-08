package chapter_06_Prob02;

public class ForeignStudent extends Student{
	protected String nationality;

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public ForeignStudent() {}
	public ForeignStudent(String name, int age, int studentID, String nationality) {
		super.name = name;
		super.age = age;
		super.studentID = studentID;
		this.nationality = nationality;
	}
	
	@Override
	public String show() {
		return String.format("���[�̸� : "+name+", ���� : "+age+", �й� : "+studentID+", ���� : "+nationality+"]");
	}
}

