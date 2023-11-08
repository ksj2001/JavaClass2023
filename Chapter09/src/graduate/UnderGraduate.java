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
		System.out.println("이름 : "+name);
		System.out.println("소속학과 : "+course);
		System.out.println("학년 : "+grade);
		System.out.println("이수학점수 : "+credit);
		System.out.println("소속 동아리명 : "+clubName);
		System.out.println("-----------------------");
		return str;
	}
}