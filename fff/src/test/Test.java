package test;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArr = {"aaa","bbb","ccc"};
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.flatMap(s -> s.lines())
				 .forEach(s -> System.out.print(s));
	}

}
