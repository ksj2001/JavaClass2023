package chapter_06_Prob05;

public class Telephone extends Phone{
	private String when;

	public String getWhen() {
		return when;
	}

	public void setWhen(String when) {
		this.when = when;
	}
	
	public Telephone() {}
	public Telephone(String owner, String when) {
		super.owner = owner;
		this.when = when;
	}
	
	public void autoAnswering() {
		System.out.println(owner+"�� ����. "+when+" ��ȭ �ٷ�.");
	}
}
