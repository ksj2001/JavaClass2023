package arraylist02;

public class MainClass {

	public static void main(String[] args) {
		Student studentLee = new Student(1001,"Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		studentLee.showInfo();
		
		Student studentPark = new Student(1002,"Park");
		studentPark.addSubject("국어", 100);
		studentPark.addSubject("수학", 90);
		studentPark.addSubject("영어", 80);
		studentPark.showInfo();
	}

}
