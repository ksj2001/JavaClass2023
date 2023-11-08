package streamEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// StudentŬ������ stream���� ���� Stream<Student> studentStream = Stream.of(
		// stream���� �ٷ� �����͸� ���������Ƿ� List�� ���� �� ����.
		Stream<Student> studentStream = Stream.of(
		new Student("���ڹ�", 3, 300),
		new Student("���ڹ�", 1, 200),
		new Student("���ڹ�", 2, 100),
		new Student("���ڹ�", 2, 150),
		new Student("���ڹ�", 1, 200),
		new Student("���ڹ�", 3, 290),
		new Student("���ڹ�", 3, 100)
		);
		
		
		
		List<Student> stuStream = Arrays.asList(
				new Student("���ڹ�", 3, 300),
				new Student("���ڹ�", 1, 200),
				new Student("���ڹ�", 2, 100),
				new Student("���ڹ�", 2, 150),
				new Student("���ڹ�", 1, 200),
				new Student("���ڹ�", 3, 290),
				new Student("���ڹ�", 3, 100)
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
