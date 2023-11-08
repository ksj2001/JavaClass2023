package collection.arrayList;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> stackArrayList = new ArrayList<>();
	
	// stack의 push 메서드
	public void push(String data) {
		stackArrayList.add(data);
	}
	
	// stack의 pop 메서드
	public String pop() {
		int len = stackArrayList.size();
		if(len==0) {
			System.out.println("stack이 비어있습니다.");
			return null;
		}
		else {
			return stackArrayList.remove(len-1); // len-1 : 자료의 마지막 번째 index
		}
	}
	
	// peek : 제일 첫번째로 나오는 자료(제일 마지막에 입력된 자료)만 추출해서 보여준다.
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
