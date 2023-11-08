package chapter_06_Prob02;

public class PersonTest {

	public static void main(String[] args) {
		Person[] persons = { new Person("길동이", 22), new Student("황진이", 23, 100),
				new ForeignStudent("Amy", 30, 200, "U.S.A") };
		
		for(Person i : persons) {
			System.out.println(i.show());
		}
	}
}

