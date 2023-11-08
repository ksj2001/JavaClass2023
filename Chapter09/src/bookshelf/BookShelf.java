package bookshelf;



public class BookShelf extends Shelf implements Queue{

	
	@Override
	public void inQueue(String title) { //배열의 추가
		shelf.add(title);
	}

	public void inQueueInfo() {
		for(int i=0;i<shelf.size();i++) {
			System.out.println(i+"번째 "+shelf.get(i));
		}
	}
	 
	@Override
	public String deQueue() { //배열의 삭제
		shelf.remove(0);
		return null;
	}

	// ArrayList에서 remove를 하게 되면 ArrayList의 size가 줄어든다.
	// 따라서 ArrayList의 size라는 메서드를 상수처럼 넣어줘야 한다.
	public void deQueueInfo() {
		int num = shelf.size();
		for(int i=0;i<num;i++) {
			System.out.println(i+"번째 "+shelf.remove(0));
		}
	}
	
	@Override
	public int getSize() {
		getCount();
		return 0;
	}

}
