package collection.collectionEx;
import java.util.HashSet;
public class HashSetEx02 {

	public static void main(String[] args) {
		HashSet<Person> personSet = new HashSet<>();
		personSet.add(new Person("ȫ�浿",33));
		personSet.add(new Person("�̼���",35));
		personSet.add(new Person("�̼���",35));
		
		for(Person person : personSet) {
			System.out.println(person);
		}
	}

}
