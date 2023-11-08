package shopMol;
import java.util.*;
public class ItemManager {
	// 카테고리를 String 형식으로 입력받을 공간 생성
	ArrayList<String> category = new ArrayList<>();
	
	// 카테고리 안에 들어갈 항목을 입력받을 공간 생성 (자료형 : Item)
	ArrayList<Item> itemList = new ArrayList<>();
	
	public ItemManager() {
		Info();
	}
	
	// ArrayList 안에 데이터 추가 메서드
	public void Info() {
		category.add("과자"); // 인덱스 : 0
		category.add("생선"); // 인덱스 : 1
		category.add("육류"); // 인덱스 : 2
		category.add("음료수"); // 인덱스 : 3
		// Item 클래스를 인스턴스한다.
		Item temp = new Item("새우깡",1500,category.get(0));
		itemList.add(temp);
		temp = new Item("꼬북칩",1800,category.get(0));
		itemList.add(temp);
		temp = new Item("고등어",5500,category.get(1));
		itemList.add(temp);
		temp = new Item("갈치",15000,category.get(1));
		itemList.add(temp);
		temp = new Item("삼겹살",12000,category.get(2));
		itemList.add(temp);
		temp = new Item("차돌박이",16000,category.get(2));
		itemList.add(temp);
		temp = new Item("코카콜라",1900,category.get(3));
		itemList.add(temp);
		temp = new Item("게토레이",2100,category.get(3));
		itemList.add(temp);
	}
	
	// 카테고리 출력 메서드
	public void printCategory() {
		for(int i=0;i<category.size();i++) {
			System.out.println("["+i+"]"+category.get(i));
		}
	}
	
	// item 목록 출력 메서드
	public void printItemList(int menu) {
		for(int i=0;i<itemList.size();i++) {
			System.out.print("["+i+"]");
			itemList.get(i).printInfo();
		}
	}
	
}
