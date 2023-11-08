package streamEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// Student클래스를 stream으로 생성 Stream<Student> studentStream = Stream.of(
		// stream으로 바로 데이터를 생성했으므로 List에 담을 수 없다.
		Stream<Student> studentStream = Stream.of(
		new Student("이자바", 3, 300),
		new Student("김자바", 1, 200),
		new Student("인자바", 2, 100),
		new Student("박자바", 2, 150),
		new Student("소자바", 1, 200),
		new Student("나자바", 3, 290),
		new Student("김자바", 3, 100)
		);
		
		
		
		List<Student> stuStream = Arrays.asList(
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("인자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("김자바", 3, 100)
				);
				
		List<Student> stuStream1 =  stuStream.stream()
				       .sorted(Comparator.comparing((Student s) -> s.getBan()).reversed())
					   .collect(Collectors.toList());
		
		Object[] obj = stuStream1.toArray();
		for(Object s : obj) {
			System.out.println(s);
		}
		System.out.println();
		
		List<Student> stuStream2 = stuStream.stream()
								   .sorted(Comparator.comparing((Student s) -> s.getBan())
								   .thenComparing((Student s) -> s.getName())
								   .thenComparing((Student s) -> s.getTotalScore()))
								   .collect(Collectors.toList());
		
		Object[] obj2 = stuStream2.toArray();
		for(Object s : obj2) {
			System.out.println(s);
		}
		
		
		
	}
}
