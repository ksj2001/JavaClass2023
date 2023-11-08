package capitalGame;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game {
	private HashMap<String,String> capitalMap = new HashMap<>();
	
	public Game() {
		Scanner scan = new Scanner(System.in);
		initialCapitalMap();
		System.out.println("*** ���� ���߱� ������ �����մϴ�. ***");
		while(true) {
			System.out.print("�Է� : 1, ���� : 2, ���� : 3 >> ");
			int menu = scan.nextInt();
			if(menu==1) {
				put();
			}
			else if(menu==2) {
				quiz();
			}
			else if(menu==3) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			else {
				System.out.println("��ȿ���� ���� �޴��Դϴ�.");
			}
		}
		scan.close();
	}

	public HashMap<String, String> getCapitalMap() {
		return capitalMap;
	}

	public void setCapitalMap(HashMap<String, String> capitalMap) {
		this.capitalMap = capitalMap;
	}
	
	public void initialCapitalMap() { // 8�� ������ ������ �̸� �Է��ϴ� �޼���
		capitalMap.put("�ѱ�", "����");
		capitalMap.put("ȣ��", "�õ��");
		capitalMap.put("�̱�", "������DC");
		capitalMap.put("�Ϻ�", "����");
		capitalMap.put("�߱�", "����¡");
		capitalMap.put("����", "������");
		capitalMap.put("ĳ����", "��Ÿ��");
		capitalMap.put("�����", "���������");
	}
	
	public void put() { // �Է� �޼���
		Scanner scan = new Scanner(System.in);
		System.out.println("���� "+capitalMap.size()+"�� ������ ������ �ԷµǾ� �ֽ��ϴ�.");
		while(true) {
			System.out.print("����� ���� �Է�"+(capitalMap.size()+1)+" >> ");
			String input = scan.nextLine();
			if(input.equals("�׸�")) {
				break;
			}
			else {
				StringTokenizer st = new StringTokenizer(input);
				String nation = st.nextToken().trim();
				String capital = st.nextToken().trim();
				if(capitalMap.containsKey(nation)) {
					System.out.println(nation+"�� �̹� �ֽ��ϴ�.");
				}
				else {
					capitalMap.put(nation, capital);
				}
			}
		}
	}
	
	public void quiz() { // ���� �޼���
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Object[] nationArr = capitalMap.keySet().toArray();
		Object[] capitalArr = capitalMap.values().toArray();
		while(true) {
			int random = ran.nextInt(capitalMap.size());
			System.out.print(nationArr[random]+"�� ������ ? ");
			String answer = scan.next();
			if(answer.equals("�׸�")) {
				break;
			}
			else if(answer.equals(capitalArr[random])) {
				System.out.println("����!!");
			}
			else {
				System.out.println("�ƴմϴ�.!!");
			}
		}
	}
}
