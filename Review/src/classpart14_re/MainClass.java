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
				System.out.println("["+(i+1)+"]"+list[i].name+"�л�>>>");
				for(int j=0;j<subCnt[i];j++) {
					System.out.println("["+(j+1)+"]"+list[i].subjects[j].name+"����="+list[i].subjects[j].score+"��");
				}
				System.out.println("");
			}
			System.out.println("[1]�л� �߰��ϱ�");
			System.out.println("[2]���� �߰��ϱ�");
			System.out.println("[3]���� �߰��ϱ�");
			System.out.println("[0]����");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				if(cnt>2)
					System.out.println("�л��� �ִ� 3����� �߰��� �� �ֽ��ϴ�.");
				else {
					System.out.print("�̸��Է� : ");
					list[cnt].name = scan.next();
					cnt++;
				}
				break;
			case 2:
				for(int i=0;i<cnt;i++) {
					System.out.println("["+(i+1)+"]"+list[i].name);
				}
				System.out.print("�л� ���� : ");
				inputStudentIndex = scan.nextInt();
				if(inputStudentIndex<1 || inputStudentIndex>cnt)
					System.out.println("���� �ʰ�");
				else {
					System.out.print("���� �Է� : ");
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
				System.out.print("�л� ���� : ");
				inputStudentIndex = scan.nextInt();
				if(inputStudentIndex<1 || inputStudentIndex>cnt)
					System.out.println("���� �ʰ�");
				else {
					for(int j=0;j<subCnt[inputStudentIndex-1];j++) {
						System.out.println("["+(j+1)+"]"+list[inputStudentIndex-1].subjects[j].name);
					}
					System.out.print("���� ���� : ");
					inputSubjectIndex = scan.nextInt();
					if (inputSubjectIndex<1 || inputSubjectIndex>subCnt[inputStudentIndex-1]) {
						System.out.println("��ȿ���� ���� ���Դϴ�.");
					} else {
						System.out.print("���� �Է� : ");
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

