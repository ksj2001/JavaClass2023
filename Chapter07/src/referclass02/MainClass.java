package referclass02;

public class MainClass {

	public static void main(String[] args) {
		Student studentJames = new Student(1001,"James");
		studentJames.SetKorea("����", 100);
		studentJames.SetMath("����", 100);
		studentJames.SetEnglish("����", 100);
		
		Student studentTomas = new Student(1002,"Tomas");
		studentTomas.SetKorea("����", 70);
		studentTomas.SetMath("����", 80);
		studentTomas.SetEnglish("����", 90);
		
		studentJames.ShowStudentInfo();
		studentTomas.ShowStudentInfo();
	}

}
