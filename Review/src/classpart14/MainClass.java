package classpart14;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] list = new Student[3];
		int cnt = 0;

		boolean run = true;
		int menu = -1;
		int inputStudentIndex = -1; // ([2] 과목 추가하기 선택 시) 입력받을 학생의 인덱스
		String inputSubject = null; // ([2] 과목 추가하기, 학생 인덱스 입력받은 후) 입력받을 과목의 이름
		int subCnt1 = 0;
		int subCnt2 = 0;
		int subCnt3 = 0;
		int inputSubjectIndex = -1;
		int inputScore = 0;

		while (run) {
			// for(int i=0;i<cnt;i++) {
			// System.out.println("["+(i+1)+"]"+list[i].name+"학생>>>");
			// for(int j=0;j<list[i].subjects.length;j++) {
			// System.out.println("["+(j+1)+"]"+list[i].subjects[j].name+"과목="+list[i].subjects[j].score+"점");
			// }
			// System.out.println();
			// }

			for (int i = 0; i < cnt; i++) {
				System.out.println("[" + (i + 1) + "]" + list[i].name + "학생>>>");
				if (i == 0) {
					for (int j = 0; j < subCnt1; j++) {
						System.out.println("[" + (j + 1) + "]" + list[i].subjects[j].name + "과목="
								+ list[i].subjects[j].score + "점");
					}
				} else if (i == 1) {
					for (int j = 0; j < subCnt2; j++) {
						System.out.println("[" + (j + 1) + "]" + list[i].subjects[j].name + "과목="
								+ list[i].subjects[j].score + "점");
					}
				} else if (i == 2) {
					for (int j = 0; j < subCnt3; j++) {
						System.out.println("[" + (j + 1) + "]" + list[i].subjects[j].name + "과목="
								+ list[i].subjects[j].score + "점");
					}
				}
				System.out.println();
			}

			System.out.println("[1]학생 추가하기");
			System.out.println("[2]과목 추가하기");
			System.out.println("[3]성적 추가하기");
			System.out.println("[0]종료");
			menu = scan.nextInt();
			if (menu == 1) {
				if (cnt >= 3) {
					System.out.println("더 이상 추가할 수 없습니다.");
				} else {
					System.out.print("이름입력 : ");
					list[cnt] = new Student();
					list[cnt].name = scan.next();
					cnt++;
				}
			} else if (menu == 2) {
				for (int k = 0; k < cnt; k++) {
					System.out.println("[" + (k + 1) + "]" + list[k].name);
				}

				System.out.print("학생 선택 : ");
				inputStudentIndex = scan.nextInt() - 1;
				if (inputStudentIndex < 0 || inputStudentIndex > cnt) {
					System.out.println("유효하지 않은 값입니다.");
				} else {
					System.out.print("과목 입력 : ");
					inputSubject = scan.next();

					if (list[inputStudentIndex].subjects == null) {
						list[inputStudentIndex].subjects = new Subject[1000];
					}

					if (inputStudentIndex == 0) {
						if (subCnt1 > 1000)
							System.out.println("범위 초과");
						else {
							list[inputStudentIndex].subjects[subCnt1] = new Subject();
							list[inputStudentIndex].subjects[subCnt1].name = inputSubject;
							list[inputStudentIndex].subjects[subCnt1].score = 0;
							subCnt1++;
						}
					}

					else if (inputStudentIndex == 1) {
						if (subCnt1 > 1000)
							System.out.println("범위 초과");
						else {
							list[inputStudentIndex].subjects[subCnt2] = new Subject();
							list[inputStudentIndex].subjects[subCnt2].name = inputSubject;
							list[inputStudentIndex].subjects[subCnt2].score = 0;
							subCnt2++;
						}
					}

					else {
						if (subCnt3 > 1000)
							System.out.println("범위 초과");
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
				System.out.print("학생 선택 : ");
				inputStudentIndex = scan.nextInt() - 1;
				if (inputStudentIndex < 0 || inputStudentIndex > cnt) {
					System.out.println("유효하지 않은 값입니다.");
				} else {

					if (inputStudentIndex == 0) {
						System.out.println(subCnt1);
						for (int k = 0; k < subCnt1; k++) {
							System.out.println("[" + (k + 1) + "]" + list[inputStudentIndex].subjects[k].name);
						}
						System.out.print("과목 선택 : ");
						inputSubjectIndex = scan.nextInt() - 1;
						if (inputSubjectIndex < 0 || inputSubjectIndex > subCnt1) {
							System.out.println("유효하지 않은 값입니다.");
						} else {
							System.out.println("성적 입력 : ");
							inputScore = scan.nextInt();
							list[inputStudentIndex].subjects[inputSubjectIndex].score = inputScore;
						}
					} else if (inputStudentIndex == 1) {
						for (int k = 0; k < subCnt2; k++) {
							System.out.println("[" + (k + 1) + "]" + list[inputStudentIndex].subjects[k].name);
						}
						System.out.print("과목 선택 : ");
						inputSubjectIndex = scan.nextInt() - 1;
						if (inputSubjectIndex < 0 || inputSubjectIndex > subCnt2) {
							System.out.println("유효하지 않은 값입니다.");
						} else {
							System.out.println("성적 입력 : ");
							inputScore = scan.nextInt();
							list[inputStudentIndex].subjects[inputSubjectIndex].score = inputScore;
						}
					} else {
						for (int k = 0; k < subCnt3; k++) {
							System.out.println("[" + (k + 1) + "]" + list[inputStudentIndex].subjects[k].name);
						}
						System.out.print("과목 선택 : ");
						inputSubjectIndex = scan.nextInt() - 1;
						if (inputSubjectIndex < 0 || inputSubjectIndex > subCnt3) {
							System.out.println("유효하지 않은 값입니다.");
						} else {
							System.out.print("성적 입력 : ");
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