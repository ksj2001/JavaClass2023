package arraylist02;

public class MainClass {

	public static void main(String[] args) {
		Student studentLee = new Student(1001,"Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 90);
		studentLee.showInfo();
		
		Student studentPark = new Student(1002,"Park");
		studentPark.addSubject("����", 100);
		studentPark.addSubject("����", 90);
		studentPark.addSubject("����", 80);
		studentPark.showInfo();
	}

}
