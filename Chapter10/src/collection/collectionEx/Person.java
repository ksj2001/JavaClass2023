package collection.collectionEx;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+"("+age+")";
	}
	
	@Override
	public int hashCode() {
		return (this.name+this.age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person = (Person)obj; // 
			if(person.age == this.age && person.name.equals(this.name)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	
	
}
