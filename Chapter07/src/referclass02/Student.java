package referclass02;

public class Student {
	int studentId;
	String studentName;
	Subject korea; // 사용자가 직접 작성한 참조자료형
	Subject math;
	Subject english;
	
	public Student() { // 생성자 호출 시 참조자료형 생성
		korea = new Subject();
		math = new Subject();
		english = new Subject();
	}
	public Student(int studentId, String studentName) { // 생성자 호출 시 참조자료형 생성
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
		english = new Subject();
	}
	// 국어, 수학 점수를 세팅하는 메서드
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
		System.out.println(studentName+"학생의 총점은 "+total+"입니다.");
		System.out.println(studentName+"학생의 평균은 "+avg+"입니다.");
	}
}
