package collection.arrayList;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> stackArrayList = new ArrayList<>();
	
	// stack�� push �޼���
	public void push(String data) {
		stackArrayList.add(data);
	}
	
	// stack�� pop �޼���
	public String pop() {
		int len = stackArrayList.size();
		if(len==0) {
			System.out.println("stack�� ����ֽ��ϴ�.");
			return null;
		}
		else {
			return stackArrayList.remove(len-1); // len-1 : �ڷ��� ������ ��° index
		}
	}
	
	// peek : ���� ù��°�� ������ �ڷ�(���� �������� �Էµ� �ڷ�)�� �����ؼ� �����ش�.
	public String peek() {
		int len = stackArrayList.size();
		return stackArrayList.get(len-1);
	}
}


public class StackArrayList {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println();
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
