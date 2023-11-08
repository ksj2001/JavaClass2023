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
		System.out.println(age+"세의 학생입니다.");
	}
	
	@Override
	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}
}
