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
			System.out.println(i+1+"."+arHakbun[i]+"�й�("+arScore[i]+"��)");
		}
	}
	
	public void choice2() {
		for(int i=0;i<arScore.length;i++) {
			if(arScore[i] > max) {
				max = arScore[i];
				index = i;
			}
		}
		System.out.println("1�� �л� = "+arHakbun[index]+"�й�("+arScore[index]+"��)");
	}
	
	public void choice3() {
		for(int i=0;i<arScore.length;i++) {
			if(arScore[i] < min) {
				min = arScore[i];
				index = i;
			}	
		}
		System.out.println("�õ� �л� = "+arHakbun[index]+"�й�("+arScore[index]+"��)");
	}
	
	public void choice4() {
		index = -1;
		System.out.print("�й��� �Է��ϼ��� : ");
		inputHakbun = scan.nextInt();
		for(int i=0;i<arHakbun.length;i++) {
			if(arHakbun[i] == inputHakbun)
				index = i;
		}
		if(index != -1) {
			System.out.println(arScore[index]);
		}
		else
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
	}
	
	public void run() {
		while(run) {
			System.out.println("=== �ް�IT ����б� ===");
			System.out.println("1. ������ ����Ȯ��");
			System.out.println("1. 1���л� ����Ȯ��");
			System.out.println("3. �õ��л� ����Ȯ��");
			System.out.println("4. (�й��� �Է��Ͽ�)����Ȯ���ϱ�");
			System.out.println("5. �����ϱ�");
			System.out.print("�޴� ���� : ");
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
				System.out.println("��ȿ���� ���� �޴��Դϴ�.");
		}
	}
}
