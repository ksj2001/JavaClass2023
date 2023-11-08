package referclass02;

public class MainClass {

	public static void main(String[] args) {
		Student studentJames = new Student(1001,"James");
		studentJames.SetKorea("국어", 100);
		studentJames.SetMath("수학", 100);
		studentJames.SetEnglish("영어", 100);
		
		Student studentTomas = new Student(1002,"Tomas");
		studentTomas.SetKorea("국어", 70);
		studentTomas.SetMath("수학", 80);
		studentTomas.SetEnglish("영어", 90);
		
		studentJames.ShowStudentInfo();
		studentTomas.ShowStudentInfo();
	}

}
