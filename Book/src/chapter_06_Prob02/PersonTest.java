package chapter_06_Prob02;

public class PersonTest {

	public static void main(String[] args) {
		Person[] persons = { new Person("�浿��", 22), new Student("Ȳ����", 23, 100),
				new ForeignStudent("Amy", 30, 200, "U.S.A") };
		
		for(Person i : persons) {
			System.out.println(i.show());
		}
	}
}

