package classpart14;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] list = new Student[3];
		int cnt = 0;
		//Student stu = new Student();
		//Subject sub = new Subject();
		boolean run = true;
		int menu = -1;
		int selectStudent = 0;
		String inputSubject = null;
		int subCnt1 = 0;
		int subCnt2 = 0;
		int subCnt3 = 0;
		while(run) {
			for(int i=0;i<cnt;i++) {
				System.out.println("["+(i+1)+"]"+list[i].name+"�л�>>>");
				if(selectStudent==0) {
					for(int j=0;j<subCnt1;j++) {
						System.out.println("["+(j+1)+"]"+list[selectStudent].subjects[subCnt1].name+"����="+
								list[selectStudent].subjects[subCnt1].score+"��");
					}
				}
				else if(selectStudent==1) {
					for(int j=0;j<subCnt2;j++) {
						System.out.println("["+(j+1)+"]"+list[selectStudent].subjects[subCnt2].name+"����="+
								list[selectStudent].subjects[subCnt2].score+"��");
					}
				}
				else if(selectStudent==2) {
					for(int j=0;j<subCnt3;j++) {
						System.out.println("["+(j+1)+"]"+list[selectStudent].subjects[subCnt3].name+"����="+
								list[selectStudent].subjects[subCnt3].score+"��");
					}
				}
				System.out.println();
			}
			System.out.println("[1]�л� �߰��ϱ�");
			System.out.println("[2]���� �߰��ϱ�");
			System.out.println("[3]���� �߰��ϱ�");
			System.out.println("[0]����");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				if(cnt>=3) {
					System.out.println("�� �̻� �߰��� �� �����ϴ�.");
					continue;
				}
				else {
					System.out.print("�̸��Է� : ");
					list[cnt] = new Student(); // list 0��, 1��, 2�� ���� ����
					list[cnt].name = scan.next();
					cnt++;
				}
				break;
			case 2:
				for(int i=0;i<cnt;i++) {
					System.out.println("["+(i+1)+"]"+list[i].name);
				}
				System.out.print("�л� ���� : ");
				selectStudent = scan.nextInt();
				selectStudent = selectStudent-1;
				System.out.print("���� �Է� : ");
				inputSubject = scan.next();
				
				if(selectStudent==0) {
					if(subCnt1>=3) {
						System.out.println("�� �̻� �߰��� �� �����ϴ�.");
						continue;
					}
					else {
						list[selectStudent].subjects[subCnt1]= new Subject();
						list[selectStudent].subjects[subCnt1].name = inputSubject;
						list[selectStudent].subjects[subCnt1].score = 0;
						subCnt1++;
					}
				}
				else if(selectStudent==1) {
					if(subCnt2>=3) {
						System.out.println("�� �̻� �߰��� �� �����ϴ�.");
						continue;
					}
					else {
						list[selectStudent].subjects[subCnt2]= new Subject();
						list[selectStudent].subjects[subCnt2].name = inputSubject;
						list[selectStudent].subjects[subCnt2].score = 0;
						subCnt2++;
					}
				}
				else if(selectStudent==2) {
					if(subCnt3>=3) {
						System.out.println("�� �̻� �߰��� �� �����ϴ�.");
						continue;
					}
					else {
						list[selectStudent].subjects[subCnt3]= new Subject();
						list[selectStudent].subjects[subCnt3].name = inputSubject;
						list[selectStudent].subjects[subCnt3].score = 0;
						subCnt3++;
					}
				}
				break;
			case 3:
				break;
			case 0:
				run = false;
				System.out.println("���α׷� ����");
				break;
			}
		}
		scan.close();
	}
}
