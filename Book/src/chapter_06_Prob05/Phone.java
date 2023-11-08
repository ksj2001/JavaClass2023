package chapter_06_Prob05;

public class Phone {
	protected String owner;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public Phone() {}
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void talk() {
		System.out.println(owner+"가 통화 중이다.");
	}
}
