package arrayListStudent;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		
		// pasing(�Ľ�) : �ڷ��� ������ �м��Ͽ� �ʿ� �� ������ ����ϴ� ����̴�.
		// parse(�Ľ� ���α׷�)
		// integer.parseInt, double.parseDouble�� �ַ� ����Ѵ�.
		
		System.out.println("�л� �̸�, �а�, �й�, ���� ����� �Է��ϼ���.");
		for(int i=0;i<4;i++) {
			System.out.print(">> ");
			studentList.add(new Student(scan.next()));
		}
		for(int i=0;i<4;i++) {
			StringTokenizer st = new StringTokenizer(studentList.get(i).getStudentInfo(),",");
			System.out.println("-----------------------");
			System.out.print("�̸�:");
			studentList.get(i).setName(st.nextToken().trim());
			System.out.println(studentList.get(i).getName());
			System.out.print("�а�:");
			studentList.get(i).setSubject(st.nextToken().trim());
			System.out.println(studentList.get(i).getSubject());
			System.out.print("�й�:");
			studentList.get(i).setStudentId(st.nextToken().trim());
			System.out.println(studentList.get(i).getStudentId());
			System.out.print("�������:");
			studentList.get(i).setCreditAvg(st.nextToken().trim());
			System.out.println(studentList.get(i).getCreditAvg());
			System.out.println("-----------------------");
			
		}
		while(true) {
			System.out.print("�л� �̸� >> ");
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
			if(studentName.equals("�׸�")) {
				break;
			}
		}
	}

}
