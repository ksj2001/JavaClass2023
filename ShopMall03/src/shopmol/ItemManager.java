package shopmol;
import java.util.*;
public class ItemManager {
	// User Ŭ���� �ν��Ͻ� 
	User u = new User();
	
	// ������ ��ٱ��ϸ� Integer �������� �Է¹��� ���� ����
	ArrayList<Integer>[] userBasket = new ArrayList[u.id.length-1];
	
	// ī�װ��� String �������� �Է¹��� ���� ����
	ArrayList<String> category = new ArrayList<>();
	
	// ī�װ� �ȿ� �� �׸��� �Է¹��� ���� ���� (�ڷ��� : Item)
	ArrayList<Item> itemList = new ArrayList<>();
	
	public ItemManager() {
		Info();
		setUserBasket();
	}
	
	// ArrayList(Item) �ȿ� ������ �߰� �޼���
	public void Info() {
		category.add("����"); // �ε��� : 0
		category.add("����"); // �ε��� : 1
		category.add("����"); // �ε��� : 2
		category.add("�����"); // �ε��� : 3
		// Item Ŭ������ �ν��Ͻ��Ѵ�.
		Item temp = new Item("�����",1500,category.get(0));
		itemList.add(temp);
		temp = new Item("����Ĩ",1800,category.get(0));
		itemList.add(temp);
		temp = new Item("����",5500,category.get(1));
		itemList.add(temp);
		temp = new Item("��ġ",15000,category.get(1));
		itemList.add(temp);
		temp = new Item("����",12000,category.get(2));
		itemList.add(temp);
		temp = new Item("��������",16000,category.get(2));
		itemList.add(temp);
		temp = new Item("��ī�ݶ�",1900,category.get(3));
		itemList.add(temp);
		temp = new Item("���䷹��",2100,category.get(3));
		itemList.add(temp);
	}
	
	// 2���� �迭 ArrayList ����(userBasket) 
	public void setUserBasket() {
		for(int i=0;i<u.id.length-1;i++) {
			userBasket[i] = new ArrayList<Integer>();
			for(int j=0;j<itemList.size();j++) {
				userBasket[i].add(0);
			}
		}	
	}
	
	// ī�װ� ��� �޼���
	public void printCategory() {
		for(int i=0;i<category.size();i++) {
			System.out.println("["+i+"]"+category.get(i));
		}
	}
	
	// item ��� ��� �޼���
	public void printItemList(int menu) {
		for(int i=0;i<itemList.size();i++) {
			if(itemList.get(i).category.equals(category.get(menu))) {
				System.out.print("["+i+"]");
				itemList.get(i).printInfo();
			}	
		}
	}
	
	// ��ٱ��Ͽ� item�� ��� �޼���
	public void addBasket(int menu) {
		itemList.get(menu).itemNum++;
	}
	
	// ��ٱ��� ��� �޼���
	public void printBasket() {
		for(int i=0;i<itemList.size();i++) {
			if(itemList.get(i).itemNum != 0) {
				System.out.println(itemList.get(i).name+": "+itemList.get(i).itemNum+"��, "
						+itemList.get(i).itemNum * itemList.get(i).price+"��");
			}
		}
	}
	
	// ���� ��ٱ��� ���� �޼���
	public void saveUserBasket(int log) {
		for(int i=0;i<itemList.size();i++) {
			userBasket[log-1].set(i, itemList.get(i).itemNum);
		}
	}
	
	// ��ٱ��� �ʱ�ȭ �޼���
	public void clearBasket() {
		for(int i=0;i<itemList.size();i++) {
			itemList.get(i).itemNum = 0;
		}
	}
	
	// ����� ���� ��ٱ��� �����ͷ� ��ٱ��� ä���
	public void fillBasket(int log) {
		for(int i=0;i<itemList.size();i++) {
			itemList.get(i).itemNum = userBasket[log-1].get(i);
		}
	}
	
	// ����� ���� ��ٱ��� ��ü�� ����ϴ� �޼���
	public void printUserBasket() {
		for(int i=0;i<userBasket.length;i++) {
			System.out.println("["+u.id[i+1]+"] ���� ��ٱ���");
			for(int j=0;j<itemList.size();j++) {
				if(userBasket[i].get(j) != 0) {
					System.out.println(itemList.get(j).name+": "+userBasket[i].get(j)+"��, "
							+userBasket[i].get(j) * itemList.get(j).price+"��");
				}
			}
			System.out.println();
		}
	}
	
	// item�� �߰����ִ� �޼���
	public void addItem(String name, int price, int categoryNum) {
		Item temp = new Item(name,price,category.get(categoryNum));
		itemList.add(temp);
		// userBasket ���̵� 1 �þ�� ��	
		for(int i=0;i<u.id.length-1;i++) {
			userBasket[i].add(0);
		}
		System.out.println("������ �߰� �Ϸ�");
	}
	
	// item�� �������ִ� �޼���
	public void removeItem(int num) {
		itemList.remove(num);
		// userBasket ���̵� 1 �پ���� ��
		for(int i=0;i<u.id.length-1;i++) {
			userBasket[i].remove(num);
		}
		System.out.println("������ ���� �Ϸ�");
	}
	
	// item�� �������ִ� �޼���
	public void updateItem(int num, String updateName, int updatePrice) {
		itemList.get(num).name = updateName;
		itemList.get(num).price = updatePrice;
		System.out.println("������ ���� �Ϸ�");
	}
}
