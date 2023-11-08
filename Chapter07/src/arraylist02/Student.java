package arraylist02;
import java.util.*;
public class Student {
	private int studentId;
	private String studentName;
	ArrayList<Subject> subjectList = new ArrayList<>();

	public Student() { // 생성자 호출 시 참조자료형 생성

	}

	public Student(int studentId, String studentName) { // 생성자 호출 시 참조자료형 생성
		this.studentId = studentId;
		this.studentName = studentName;

		subjectList = new ArrayList<Subject>();
	}

	//메서드

	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setSubjectName(name);
		subject.setScore(score);

		subjectList.add(subject);
	}

	public void showInfo() {
		int total = 0;
		// Subject subject = new Subject();
		// for(int i=0;i<subjectList.size();i++) { : 이렇게 사용해주려면?
		for(Subject subject : subjectList) {	
			//System.out.println(subjectList.size());
			total += subject.getScore();
			System.out.println("학생"+studentName+"님의"+subject.getSubjectName()+"과목의 성적은"
					+subject.getScore()+"점 입니다.");
		}
		System.out.println("학생"+studentName+"님의 총점은 "+total
				+" 입니다.");
	}
}
