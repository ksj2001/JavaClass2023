package classpart14;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] list = new Student[3];
		int cnt = 0;

		boolean run = true;
		int menu = -1;
		int inputStudentIndex = -1; // ([2] ���� �߰��ϱ� ���� ��) �Է¹��� �л��� �ε���
		String inputSubject = null; // ([2] ���� �߰��ϱ�, �л� �ε��� �Է¹��� ��) �Է¹��� ������ �̸�
		int subCnt1 = 0;
		int subCnt2 = 0;
		int subCnt3 = 0;
		int inputSubjectIndex = -1;
		int inputScore = 0;

		while (run) {
			// for(int i=0;i<cnt;i++) {
			// System.out.println("["+(i+1)+"]"+list[i].name+"�л�>>>");
			// for(int j=0;j<list[i].subjects.length;j++) {
			// System.out.println("["+(j+1)+"]"+list[i].subjects[j].name+"����="+list[i].subjects[j].score+"��");
			// }
			// System.out.println();
			// }

			for (int i = 0; i < cnt; i++) {
				System.out.println("[" + (i + 1) + "]" + list[i].name + "�л�>>>");
				if (i == 0) {
					for (int j = 0; j < subCnt1; j++) {
						System.out.println("[" + (j + 1) + "]" + list[i].subjects[j].name + "����="
								+ list[i].subjects[j].score + "��");
					}
				} else if (i == 1) {
					for (int j = 0; j < subCnt2; j++) {
						System.out.println("[" + (j + 1) + "]" + list[i].subjects[j].name + "����="
								+ list[i].subjects[j].score + "��");
					}
				} else if (i == 2) {
					for (int j = 0; j < subCnt3; j++) {
						System.out.println("[" + (j + 1) + "]" + list[i].subjects[j].name + "����="
								+ list[i].subjects[j].score + "��");
					}
				}
				System.out.println();
			}

			System.out.println("[1]�л� �߰��ϱ�");
			System.out.println("[2]���� �߰��ϱ�");
			System.out.println("[3]���� �߰��ϱ�");
			System.out.println("[0]����");
			menu = scan.nextInt();
			if (menu == 1) {
				if (cnt >= 3) {
					System.out.println("�� �̻� �߰��� �� �����ϴ�.");
				} else {
					System.out.print("�̸��Է� : ");
					list[cnt] = new Student();
					list[cnt].name = scan.next();
					cnt++;
				}
			} else if (menu == 2) {
				for (int k = 0; k < cnt; k++) {
					System.out.println("[" + (k + 1) + "]" + list[k].name);
				}

				System.out.print("�л� ���� : ");
				inputStudentIndex = scan.nextInt() - 1;
				if (inputStudentIndex < 0 || inputStudentIndex > cnt) {
					System.out.println("��ȿ���� ���� ���Դϴ�.");
				} else {
					System.out.print("���� �Է� : ");
					inputSubject = scan.next();

					if (list[inputStudentIndex].subjects == null) {
						list[inputStudentIndex].subjects = new Subject[1000];
					}

					if (inputStudentIndex == 0) {
						if (subCnt1 > 1000)
							System.out.println("���� �ʰ�");
						else {
							list[inputStudentIndex].subjects[subCnt1] = new Subject();
							list[inputStudentIndex].subjects[subCnt1].name = inputSubject;
							list[inputStudentIndex].subjects[subCnt1].score = 0;
							subCnt1++;
						}
					}

					else if (inputStudentIndex == 1) {
						if (subCnt1 > 1000)
							System.out.println("���� �ʰ�");
						else {
							list[inputStudentIndex].subjects[subCnt2] = new Subject();
							list[inputStudentIndex].subjects[subCnt2].name = inputSubject;
							list[inputStudentIndex].subjects[subCnt2].score = 0;
							subCnt2++;
						}
					}

					else {
						if (subCnt3 > 1000)
							System.out.println("���� �ʰ�");
						else {
							list[inputStudentIndex].subjects[subCnt3] = new Subject();
							list[inputStudentIndex].subjects[subCnt3].name = inputSubject;
							list[inputStudentIndex].subjects[subCnt3].score = 0;
							subCnt3++;
						}
					}

				}
			} else if (menu == 3) {
				for (int k = 0; k < cnt; k++) {
					System.out.println("[" + (k + 1) + "]" + list[k].name);
				}
				System.out.print("�л� ���� : ");
				inputStudentIndex = scan.nextInt() - 1;
				if (inputStudentIndex < 0 || inputStudentIndex > cnt) {
					System.out.println("��ȿ���� ���� ���Դϴ�.");
				} else {

					if (inputStudentIndex == 0) {
						System.out.println(subCnt1);
						for (int k = 0; k < subCnt1; k++) {
							System.out.println("[" + (k + 1) + "]" + list[inputStudentIndex].subjects[k].name);
						}
						System.out.print("���� ���� : ");
						inputSubjectIndex = scan.nextInt() - 1;
						if (inputSubjectIndex < 0 || inputSubjectIndex > subCnt1) {
							System.out.println("��ȿ���� ���� ���Դϴ�.");
						} else {
							System.out.println("���� �Է� : ");
							inputScore = scan.nextInt();
							list[inputStudentIndex].subjects[inputSubjectIndex].score = inputScore;
						}
					} else if (inputStudentIndex == 1) {
						for (int k = 0; k < subCnt2; k++) {
							System.out.println("[" + (k + 1) + "]" + list[inputStudentIndex].subjects[k].name);
						}
						System.out.print("���� ���� : ");
						inputSubjectIndex = scan.nextInt() - 1;
						if (inputSubjectIndex < 0 || inputSubjectIndex > subCnt2) {
							System.out.println("��ȿ���� ���� ���Դϴ�.");
						} else {
							System.out.println("���� �Է� : ");
							inputScore = scan.nextInt();
							list[inputStudentIndex].subjects[inputSubjectIndex].score = inputScore;
						}
					} else {
						for (int k = 0; k < subCnt3; k++) {
							System.out.println("[" + (k + 1) + "]" + list[inputStudentIndex].subjects[k].name);
						}
						System.out.print("���� ���� : ");
						inputSubjectIndex = scan.nextInt() - 1;
						if (inputSubjectIndex < 0 || inputSubjectIndex > subCnt3) {
							System.out.println("��ȿ���� ���� ���Դϴ�.");
						} else {
							System.out.print("���� �Է� : ");
							inputScore = scan.nextInt();
							list[inputStudentIndex].subjects[inputSubjectIndex].score = inputScore;
						}
					}

				}
			} else if (menu == 0) {
				run = false;
			}
		}
		scan.close();
	}
}