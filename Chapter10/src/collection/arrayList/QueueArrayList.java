package collection.arrayList;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> queueArrayList = new ArrayList<>();
	// queue를 저장하는 enQueue 메서드 작성
	public void enQueue(String data) {
		queueArrayList.add(data);
	
	}
	
	// queue를 삭제하는 deQueue 메서드 작성
	public String deQueue() {
		if(queueArrayList.size() == 0) {
			return "queue가 비어있습니다.";
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
