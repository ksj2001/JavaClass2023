package streamEx02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {

	public static void main(String[] args) {
		Student2[] stuArr = {
				new Student2("���ڹ�", true, 1, 1, 300),
				new Student2("������", false, 1, 1, 250),
				new Student2("���ڹ�", true, 1, 1, 200),
				new Student2("������", false, 1, 2, 150),
				new Student2("���ڹ�", true, 1, 2, 100),
				new Student2("������", false, 1, 2, 50),
				new Student2("Ȳ����", false, 1, 3, 100),
				new Student2("������", false, 1, 3, 150),
				new Student2("���ڹ�", true, 1, 3, 200),
				new Student2("���ڹ�", true, 2, 1, 300),
				new Student2("������", false, 2, 1, 250),
				new Student2("���ڹ�", true, 2, 1, 200),
				new Student2("������", false, 2, 2, 150),
				new Student2("���ڹ�", true, 2, 2, 100),
				new Student2("������", false, 2, 2, 50),
				new Student2("Ȳ����", false, 2, 3, 100),
				new Student2("������", false, 2, 3, 150),
				new Student2("���ڹ�", true, 2, 3, 200)
		};
		
		// Collect ���������� ���
		Stream<Student2> stuStream1 = Arrays.stream(stuArr);
		Stream<Student2> stuStream2 = Arrays.stream(stuArr);
		Stream<Student2> stuStream3 = Arrays.stream(stuArr);
		Stream<Student2> stuStream4 = Arrays.stream(stuArr);
		Stream<Student2> stuStream5 = Arrays.stream(stuArr);
		Stream<Student2> stuStream6 = Arrays.stream(stuArr);
		Stream<Student2> stuStream7 = Arrays.stream(stuArr);
		Stream<Student2> stuStream8 = Arrays.stream(stuArr);
		Stream<Student2> stuStream9 = Arrays.stream(stuArr);
		
		long count = stuStream1.count(); // stuArr �迭�� ��ü ����
		long count2 = stuStream2.collect(Collectors.counting()); // �׷��� ����
		
		// Ŭ������ :: �޼���
		// long totalScore = stuStream3.mapToInt((Student2 s) -> s.getScore()).sum();
		long totalScore = stuStream3.mapToInt((Student2::getScore)).sum(); 
		long totalScore2 = stuStream4.collect(Collectors.summingInt(Student2::getScore));
		
		OptionalInt maxScore = stuStream5.mapToInt(Student2::getScore).max();
		// �׷캰 �ִ��� ���� ��
		Optional<Student2> maxScore2 = stuStream6.collect(Collectors.maxBy(Comparator.comparingInt(Student2::getScore))); 
		
		int reduceScore = stuStream7.mapToInt(Student2::getScore).reduce(0, (a,b) -> a+b);
		// �׷캰�� �հ踦 ����� ���� �� reducing�� ����Ѵ�.
		int reduceScore2 = stuStream8.mapToInt(Student2::getScore).boxed().collect(Collectors.reducing(0, (a,b) -> a+b));
		// maptoInt �߰������ڴ� ���� ����� ������ �߿� reducing�ϰ� ���� ��������� ��ȯ�ش޶�� ���̴�.
		
		String nameJoin = stuStream9.map((Student2 s) -> s.getName()).collect(Collectors.joining(","));
		// StringBuilder�� ���� ������ �Ѵ�.
		
		System.out.println(count);
		System.out.println(count2);
		System.out.println(totalScore);
		System.out.println(totalScore2);
		System.out.println(maxScore);
		System.out.println(maxScore2);
		System.out.println(reduceScore);
		System.out.println(reduceScore2);
		System.out.println(nameJoin);
		
		// PartitioningBy�� �̿��� ������ 2���� ���
		Map<Boolean, List<Student2>> stuStream10 = Arrays.stream(stuArr)
												   .collect(Collectors.partitioningBy(Student2::isMale));
		Object[] obj1 = stuStream10.values().toArray();
		for(Object o : obj1) {
			System.out.println(o);
		}
		
		List<Student2> maleStudent = stuStream10.get(true); //Map���� ���л� ����� ��´�.
		List<Student2> femaleStudent = stuStream10.get(false); //Map���� ���л� ����� ��´�
		for(Student2 s : maleStudent) {
			System.out.println(s);
		}
		System.out.println();
		for(Student2 m : femaleStudent) {
			System.out.println(m);
		}
		
		// ������ �л� �� (Partitioning �Ű����� 2��¥�� �̿�)
		Map<Boolean, Long> stuStream11 = Arrays.stream(stuArr)
										 .collect(Collectors.partitioningBy(Student2::isMale, Collectors.counting()));
		System.out.println("���л� �� : "+stuStream11.get(true));
		System.out.println("���л� �� : "+stuStream11.get(false));
		
		// ������ score�� �ִ�
		Map<Boolean, Optional<Student2>> stuStream12 = Arrays.stream(stuArr)
													  .collect(Collectors.partitioningBy(Student2::isMale,
													  Collectors.maxBy(Comparator.comparing(Student2::getScore))));
		System.out.println("���л� score �ִ� : "+stuStream12.get(true));
		System.out.println("���л� score �ִ� : "+stuStream12.get(false));
		
		// ������ 100�� ������ score ���
		Map<Boolean, Map<Boolean,List<Student2>>> stuStream13 = Arrays.stream(stuArr)
					.collect(Collectors.partitioningBy((Student2 s) -> s.isMale(), 
							Collectors.partitioningBy((Student2 s) -> s.getScore() <= 100)));
		List<Student2> maleFailStudent = stuStream13.get(true).get(true);
		List<Student2> femaleFailStudent = stuStream13.get(false).get(true);
		for(Student2 s : maleFailStudent) {
			System.out.println(s);
		}
		System.out.println();
		for(Student2 s : femaleFailStudent) {
			System.out.println(s);
		}
		
		
		// groupingBy�� �ݺ� ���
		Map<Integer, List<Student2>> stuStream14 = Arrays.stream(stuArr)
				.collect(Collectors.groupingBy(Student2::getBan));
		Object[] obj3 = stuStream14.values().toArray();
		for(Object o : obj3) {
			System.out.println(o);
		}
		
		// groupingBy�� �г⺰, �ݺ� ���
		
	}
	
}
