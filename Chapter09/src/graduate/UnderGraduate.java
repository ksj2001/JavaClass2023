package graduate;

public class UnderGraduate extends Student{
	private String clubName;

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	
	public UnderGraduate(String name, String course, int grade, int credit, String clubName) {
		super.name = name;
		super.course = course;
		super.grade = grade;
		super.credit = credit;
		this.clubName = clubName;
	}
	
	@Override
	public String toString() {
		String str = "";
		System.out.println("�̸� : "+name);
		System.out.println("�Ҽ��а� : "+course);
		System.out.println("�г� : "+grade);
		System.out.println("�̼������� : "+credit);
		System.out.println("�Ҽ� ���Ƹ��� : "+clubName);
		System.out.println("-----------------------");
		return str;
	}
}