package string;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClass {

	public static void main(String[] args) throws ClassNotFoundException {

		// 1�� getClass => �����ε� (Static Loading)
		Person person = new Person();
		Class p = person.getClass();
		System.out.println(p);

		// 2�� Class => �����ε�
		Class p1 = Person.class;
		System.out.println(p1);

		// 3�� forName => �����ε�
		Class p2 = Class.forName("java.lang.String");
		System.out.println(p2);
		Constructor[] cons = p2.getConstructors();
		// java.lang.String�� constructor �� ������ �����´�.
		for (int i = 0; i < cons.length; i++) {
			System.out.println(cons[i]);
		}
		
		System.out.println("======================");
		// Ctrl + Shift + O : import �޴� Field[] fields = strClass.getFields();
		for (int i = 0; i < cons.length; i++) {
			System.out.println(cons[i]);
		}
		
		// java.lang.String�� Method �� ������ �����´�.
		System.out.println("======================");
		Method[] methods = p2.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}

	}

}
