package graduate;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		
		Student lia = new Student("Lia","Biology",3,16);
		UnderGraduate kim = new UnderGraduate("Kim","Math",1,19,"Great Guitar");
		Graduate john = new Graduate("John","Economy",4,12,"교육 조교",0);
		Graduate mike = new Graduate("Mike","Economy",4,15,"연구 조교",0);
		Graduate harry = new Graduate("Harry","Economy",4,10,"군대 조교",0);
		
		studentList.add(lia);
		studentList.add(kim);
		studentList.add(john);
		studentList.add(mike);
		studentList.add(harry);
		
		for(Student stud : studentList) stud.toString();

	}

}