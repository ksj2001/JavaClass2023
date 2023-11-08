package classpart10;

import java.util.*;

public class ClassEx10 {
	Scanner scan = new Scanner(System.in);
	int[] arHakbun = {1001,1002,1003,1004,1005};
	int[] arScore = {92,38,87,100,11};
	int total = 0;
	int max = 0;
	int min = 101;
	int inputHakbun = 0;
	int index = -1;
	boolean run = true;
	int menu = -1;
	
	public void choice1() {
		for(int i=0;i<arHakbun.length;i++) {
			System.out.println(i+1+"."+arHakbun[i]+"학번("+arScore[i]+"점)");
		}
	}
	
	public void choice2() {
		for(int i=0;i<arScore.length;i++) {
			if(arScore[i] > max) {
				max = arScore[i];
				index = i;
			}
		}
		System.out.println("1등 학생 = "+arHakbun[index]+"학번("+arScore[index]+"점)");
	}
	
	public void choice3() {
		for(int i=0;i<arScore.length;i++) {
			if(arScore[i] < min) {
				min = arScore[i];
				index = i;
			}	
		}
		System.out.println("꼴등 학생 = "+arHakbun[index]+"학번("+arScore[index]+"점)");
	}
	
	public void choice4() {
		index = -1;
		System.out.print("학번을 입력하세요 : ");
		inputHakbun = scan.nextInt();
		for(int i=0;i<arHakbun.length;i++) {
			if(arHakbun[i] == inputHakbun)
				index = i;
		}
		if(index != -1) {
			System.out.println(arScore[index]);
		}
		else
			System.out.println("해당 학번은 존재하지 않습니다.");
	}
	
	public void run() {
		while(run) {
			System.out.println("=== 메가IT 고등학교 ===");
			System.out.println("1. 전교생 성적확인");
			System.out.println("1. 1등학생 성적확인");
			System.out.println("3. 꼴등학생 성적확인");
			System.out.println("4. (학번을 입력하여)성적확인하기");
			System.out.println("5. 종료하기");
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt();
			
			if(menu==1)
				choice1();
			else if(menu==2)
				choice2();
			else if(menu==3)
				choice3();
			else if(menu==4)
				choice4();
			else if(menu==5)
				run = false;
			else
				System.out.println("유효하지 않은 메뉴입니다.");
		}
	}
}
