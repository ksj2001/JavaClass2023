package bookshelf;



public class BookShelf extends Shelf implements Queue{

	
	@Override
	public void inQueue(String title) { //�迭�� �߰�
		shelf.add(title);
	}

	public void inQueueInfo() {
		for(int i=0;i<shelf.size();i++) {
			System.out.println(i+"��° "+shelf.get(i));
		}
	}
	 
	@Override
	public String deQueue() { //�迭�� ����
		shelf.remove(0);
		return null;
	}

	// ArrayList���� remove�� �ϰ� �Ǹ� ArrayList�� size�� �پ���.
	// ���� ArrayList�� size��� �޼��带 ���ó�� �־���� �Ѵ�.
	public void deQueueInfo() {
		int num = shelf.size();
		for(int i=0;i<num;i++) {
			System.out.println(i+"��° "+shelf.remove(0));
		}
	}
	
	@Override
	public int getSize() {
		getCount();
		return 0;
	}

}
