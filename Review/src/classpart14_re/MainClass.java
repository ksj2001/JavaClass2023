package classpart14_re;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] list = new Student[3];
		int cnt = 0;
		
		boolean run = true;
		int menu = -1;
		list[0] = new Student();
		list[1] = new Student();
		list[2] = new Student();
		int[] subCnt = {0,0,0};
		int inputStudentIndex = 0;
		String inputSubject = "";
		int inputSubjectIndex = 0;
		int inputScore = 0;
		
		while(run) {
			for(int i=0;i<cnt;i++) {
				System.out.println("["+(i+1)+"]"+list[i].name+"학생>>>");
				for(int j=0;j<subCnt[i];j++) {
					System.out.println("["+(j+1)+"]"+list[i].subjects[j].name+"과목="+list[i].subjects[j].score+"점");
				}
				System.out.println("");
			}
			System.out.println("[1]학생 추가하기");
			System.out.println("[2]과목 추가하기");
			System.out.println("[3]성적 추가하기");
			System.out.println("[0]종료");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				if(cnt>2)
					System.out.println("학생은 최대 3명까지 추가할 수 있습니다.");
				else {
					System.out.print("이름입력 : ");
					list[cnt].name = scan.next();
					cnt++;
				}
				break;
			case 2:
				for(int i=0;i<cnt;i++) {
					System.out.println("["+(i+1)+"]"+list[i].name);
				}
				System.out.print("학생 선택 : ");
				inputStudentIndex = scan.nextInt();
				if(inputStudentIndex<1 || inputStudentIndex>cnt)
					System.out.println("범위 초과");
				else {
					System.out.print("과목 입력 : ");
					inputSubject = scan.next();
					// **************************************************************
					if (list[inputStudentIndex-1].subjects == null) {
						list[inputStudentIndex-1].subjects = new Subject[1000];
					}
					// **************************************************************
					list[inputStudentIndex-1].subjects[subCnt[inputStudentIndex-1]] = new Subject();
					// **************************************************************
					list[inputStudentIndex-1].subjects[subCnt[inputStudentIndex-1]].name = inputSubject;
					list[inputStudentIndex-1].subjects[subCnt[inputStudentIndex-1]].score = 0;
					subCnt[inputStudentIndex-1]++;
				}
				break;
			case 3:
				for(int i=0;i<cnt;i++) {
					System.out.println("["+(i+1)+"]"+list[i].name);
				}
				System.out.print("학생 선택 : ");
				inputStudentIndex = scan.nextInt();
				if(inputStudentIndex<1 || inputStudentIndex>cnt)
					System.out.println("범위 초과");
				else {
					for(int j=0;j<subCnt[inputStudentIndex-1];j++) {
						System.out.println("["+(j+1)+"]"+list[inputStudentIndex-1].subjects[j].name);
					}
					System.out.print("과목 선택 : ");
					inputSubjectIndex = scan.nextInt();
					if (inputSubjectIndex<1 || inputSubjectIndex>subCnt[inputStudentIndex-1]) {
						System.out.println("유효하지 않은 값입니다.");
					} else {
						System.out.print("성적 입력 : ");
						inputScore = scan.nextInt();
						list[inputStudentIndex-1].subjects[inputSubjectIndex-1].score = inputScore;
					}
				}
				break;
			
			}
		}
		scan.close();
	}

}

