package arrayListStudent;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		
		// pasing(파싱) : 자료의 구문을 분석하여 필요 시 가져다 사용하는 기능이다.
		// parse(파싱 프로그램)
		// integer.parseInt, double.parseDouble을 주로 사용한다.
		
		System.out.println("학생 이름, 학과, 학번, 학점 평균을 입력하세요.");
		for(int i=0;i<4;i++) {
			System.out.print(">> ");
			studentList.add(new Student(scan.next()));
		}
		for(int i=0;i<4;i++) {
			StringTokenizer st = new StringTokenizer(studentList.get(i).getStudentInfo(),",");
			System.out.println("-----------------------");
			System.out.print("이름:");
			studentList.get(i).setName(st.nextToken().trim());
			System.out.println(studentList.get(i).getName());
			System.out.print("학과:");
			studentList.get(i).setSubject(st.nextToken().trim());
			System.out.println(studentList.get(i).getSubject());
			System.out.print("학번:");
			studentList.get(i).setStudentId(st.nextToken().trim());
			System.out.println(studentList.get(i).getStudentId());
			System.out.print("학점평균:");
			studentList.get(i).setCreditAvg(st.nextToken().trim());
			System.out.println(studentList.get(i).getCreditAvg());
			System.out.println("-----------------------");
			
		}
		while(true) {
			System.out.print("학생 이름 >> ");
			String studentName = scan.next();
			for(int i=0;i<4;i++) {
				if(studentName.equals(studentList.get(i).getName())) {
					//System.out.println(studentList.get(i).getStudentInfo());
					System.out.print(studentList.get(i).getName()+", ");
					System.out.print(studentList.get(i).getSubject()+", ");
					System.out.print(studentList.get(i).getStudentId()+", ");
					System.out.println(studentList.get(i).getCreditAvg());
				}
			}
			if(studentName.equals("그만")) {
				break;
			}
		}
	}

}
