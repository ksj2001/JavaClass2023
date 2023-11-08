package collection.arrayList;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> queueArrayList = new ArrayList<>();
	// queue�� �����ϴ� enQueue �޼��� �ۼ�
	public void enQueue(String data) {
		queueArrayList.add(data);
	
	}
	
	// queue�� �����ϴ� deQueue �޼��� �ۼ�
	public String deQueue() {
		if(queueArrayList.size() == 0) {
			return "queue�� ����ֽ��ϴ�.";
		}
		else {
			return queueArrayList.remove(0);
		}
	}
}

public class QueueArrayList {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue("a");
		queue.enQueue("b");
		queue.enQueue("c");
		queue.enQueue("d");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
	}

}
