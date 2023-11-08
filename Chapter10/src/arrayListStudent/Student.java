package arrayListStudent;

public class Student {
	private String studentInfo; // 학생 정보
	private String name; //이름
	private String subject; //학과
	private String studentId; //학번
	private String creditAvg; //학점평균
	
	public String getStudentInfo() {
		return studentInfo;
	}
	public void setStudentInfo(String studentInfo) {
		this.studentInfo = studentInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getCreditAvg() {
		return creditAvg;
	}
	public void setCreditAvg(String creditAvg) {
		this.creditAvg = creditAvg;
	}
	
	public Student() {}
	public Student(String name, String subject, String studentId, String creditAvg) {
		this.name = name;
		this.subject = subject;
		this.studentId = studentId;
		this.creditAvg = creditAvg;
	}
	public Student(String studentInfo) {
		this.studentInfo = studentInfo;
	}
}
