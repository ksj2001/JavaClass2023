package collection.collectionEx;
import java.util.HashSet;
public class HashSetEx02 {

	public static void main(String[] args) {
		HashSet<Person> personSet = new HashSet<>();
		personSet.add(new Person("홍길동",33));
		personSet.add(new Person("이순신",35));
		personSet.add(new Person("이순신",35));
		
		for(Person person : personSet) {
			System.out.println(person);
		}
	}

}
