package string;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClass {

	public static void main(String[] args) throws ClassNotFoundException {

		// 1번 getClass => 정적로딩 (Static Loading)
		Person person = new Person();
		Class p = person.getClass();
		System.out.println(p);

		// 2번 Class => 정적로딩
		Class p1 = Person.class;
		System.out.println(p1);

		// 3번 forName => 동적로딩
		Class p2 = Class.forName("java.lang.String");
		System.out.println(p2);
		Constructor[] cons = p2.getConstructors();
		// java.lang.String의 constructor 의 정보를 가져온다.
		for (int i = 0; i < cons.length; i++) {
			System.out.println(cons[i]);
		}
		
		System.out.println("======================");
		// Ctrl + Shift + O : import 메뉴 Field[] fields = strClass.getFields();
		for (int i = 0; i < cons.length; i++) {
			System.out.println(cons[i]);
		}
		
		// java.lang.String의 Method 의 정보를 가져온다.
		System.out.println("======================");
		Method[] methods = p2.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}

	}

}
