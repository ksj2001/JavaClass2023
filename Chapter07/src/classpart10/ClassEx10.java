package classpart10;
import java.util.*;
public class ClassEx10 {
	Scanner scan = new Scanner(System.in);
	//�������
	String name = "";
	int[] arHakbun = {1001,1002,1003,1004,1005};
	int[] arScore = {92,38,87,100,11};
	boolean run = true;
	int menu = 0;
	int maxScore = 0;
	int maxIndex = -1; // �ְ����� ���� �л��� �й� ��ġ
	int minScore = 100;
	int minIndex = -1; // �������� ���� �л��� �й� ��ġ
	int inputHakbun = 0;
	int inputIndex = -1; // �Էµ� �й��� �ش�Ǵ� �л��� ���� ��ġ
	//�޼���
	public void run() { // ��� �Լ�
		while(run) {
			System.out.println("=== �ް�IT ����б� ===");
			System.out.println("1.������ ����Ȯ��");
			System.out.println("2.1���л� ����Ȯ��");
			System.out.println("3.�õ��л� ����Ȯ��");
			System.out.println("4.(�й��� �Է¹޾�)����Ȯ���ϱ�");
			System.out.println("5.�����ϱ�");
			System.out.print("�޴� ���� : ");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				schoolScore();
				break;
			case 2:
				firstScore();
				break;
			case 3:
				lastScore();
				break;
			case 4:
				inputScore();
				break;
			case 5:
				break;
			default:
				System.out.println("���� �޴��Դϴ�.");
				break;
			}
		}
	}
	public void schoolScore() {
		for(int i=0;i<arScore.length;i++) {
			System.out.println((i+1)+"."+arHakbun[i]+"�й�("+arScore[i]+"��)");
		}
	}
	public void firstScore() {
		for(int i=0;i<arScore.length;i++) {
			if(arScore[i]>maxScore) {
				maxScore = arScore[i];
				maxIndex = i;
			}
		}
		System.out.println("1�� �л� = "+arHakbun[maxIndex]+"�й�("+maxScore+"��)");
	}
	public void lastScore() {
		for(int i=0;i<arScore.length;i++) {
			if(arScore[i]<minScore) {
				minScore = arScore[i];
				minIndex = i;
			}
		}
		System.out.println("�õ� �л� = "+arHakbun[minIndex]+"�й�("+minScore+"��)");
	}
	public void inputScore() {
		System.out.print("�й��� �Է��ϼ��� : ");
		inputHakbun = scan.nextInt();
		for(int i=0;i<arHakbun.length;i++) {
			if(inputHakbun==arHakbun[i]) {
				inputIndex = i;
			}
		}
		if(inputIndex == -1) {
			System.out.println("�ش� �й��� �������� �ʽ��ϴ�.");
		}
		else {
			System.out.println(arScore[inputIndex]);
		}
	}
}
