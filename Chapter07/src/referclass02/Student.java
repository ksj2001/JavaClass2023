package referclass02;

public class Student {
	int studentId;
	String studentName;
	Subject korea; // ����ڰ� ���� �ۼ��� �����ڷ���
	Subject math;
	Subject english;
	
	public Student() { // ������ ȣ�� �� �����ڷ��� ����
		korea = new Subject();
		math = new Subject();
		english = new Subject();
	}
	public Student(int studentId, String studentName) { // ������ ȣ�� �� �����ڷ��� ����
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
		english = new Subject();
	}
	// ����, ���� ������ �����ϴ� �޼���
	public void SetKorea(String name, int score) {
		korea.setSubjectName(name);
		korea.setScore(score);
	}
	public void SetMath(String name, int score) {
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void SetEnglish(String name, int score) {
		english.setSubjectName(name);
		english.setScore(score);
	}
	
	public void ShowStudentInfo() {
		int total = korea.getScore()+math.getScore()+english.getScore();
		double avg = (double)(total / 3);
		System.out.println(studentName+"�л��� ������ "+total+"�Դϴ�.");
		System.out.println(studentName+"�л��� ����� "+avg+"�Դϴ�.");
	}
}
