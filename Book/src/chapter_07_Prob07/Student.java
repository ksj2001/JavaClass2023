package chapter_07_Prob07;

public class Student implements Human{
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public Student(int age) {
		this.age = age;
	}
	
	@Override
	public void print() {
		System.out.println(age+"���� �л��Դϴ�.");
	}
	
	@Override
	public void eat() {
		System.out.println("���ö��� �Խ��ϴ�.");
	}
}
