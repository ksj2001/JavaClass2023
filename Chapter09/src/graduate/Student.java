package graduate;

public class Student {
	protected String name; // �̸�
	protected String course; // �Ҽ��а�
	protected int grade; // �г�
	protected int credit; // �̼�������
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public Student() {}
	public Student(String name, String course, int grade, int credit) {
		this.name = name;
		this.course = course;
		this.grade = grade;
		this.credit = credit;
	}
	
	@Override
	public String toString() {
		String str = "";
		System.out.println("�̸� : "+name);
		System.out.println("�Ҽ��а� : "+course);
		System.out.println("�г� : "+grade);
		System.out.println("�̼������� : "+credit);
		System.out.println("-----------------------");
		return str;
	}
}
