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
				new Student2("나자바", true, 1, 1, 300),
				new Student2("김지미", false, 1, 1, 250),
				new Student2("김자바", true, 1, 1, 200),
				new Student2("이지미", false, 1, 2, 150),
				new Student2("남자바", true, 1, 2, 100),
				new Student2("안지미", false, 1, 2, 50),
				new Student2("황지미", false, 1, 3, 100),
				new Student2("강지미", false, 1, 3, 150),
				new Student2("이자바", true, 1, 3, 200),
				new Student2("나자바", true, 2, 1, 300),
				new Student2("김지미", false, 2, 1, 250),
				new Student2("김자바", true, 2, 1, 200),
				new Student2("이지미", false, 2, 2, 150),
				new Student2("남자바", true, 2, 2, 100),
				new Student2("안지미", false, 2, 2, 50),
				new Student2("황지미", false, 2, 3, 100),
				new Student2("강지미", false, 2, 3, 150),
				new Student2("이자바", true, 2, 3, 200)
		};
		
		// Collect 최종연산의 통계
		Stream<Student2> stuStream1 = Arrays.stream(stuArr);
		Stream<Student2> stuStream2 = Arrays.stream(stuArr);
		Stream<Student2> stuStream3 = Arrays.stream(stuArr);
		Stream<Student2> stuStream4 = Arrays.stream(stuArr);
		Stream<Student2> stuStream5 = Arrays.stream(stuArr);
		Stream<Student2> stuStream6 = Arrays.stream(stuArr);
		Stream<Student2> stuStream7 = Arrays.stream(stuArr);
		Stream<Student2> stuStream8 = Arrays.stream(stuArr);
		Stream<Student2> stuStream9 = Arrays.stream(stuArr);
		
		long count = stuStream1.count(); // stuArr 배열의 전체 개수
		long count2 = stuStream2.collect(Collectors.counting()); // 그룹의 개수
		
		// 클래스명 :: 메서드
		// long totalScore = stuStream3.mapToInt((Student2 s) -> s.getScore()).sum();
		long totalScore = stuStream3.mapToInt((Student2::getScore)).sum(); 
		long totalScore2 = stuStream4.collect(Collectors.summingInt(Student2::getScore));
		
		OptionalInt maxScore = stuStream5.mapToInt(Student2::getScore).max();
		// 그룹별 최댓값을 구할 때
		Optional<Student2> maxScore2 = stuStream6.collect(Collectors.maxBy(Comparator.comparingInt(Student2::getScore))); 
		
		int reduceScore = stuStream7.mapToInt(Student2::getScore).reduce(0, (a,b) -> a+b);
		// 그룹별로 합계를 만들고 싶을 때 reducing을 사용한다.
		int reduceScore2 = stuStream8.mapToInt(Student2::getScore).boxed().collect(Collectors.reducing(0, (a,b) -> a+b));
		// maptoInt 중간연산자는 지금 저장된 데이터 중에 reducing하고 싶은 멤버변수로 변환해달라는 뜻이다.
		
		String nameJoin = stuStream9.map((Student2 s) -> s.getName()).collect(Collectors.joining(","));
		// StringBuilder와 같은 역할을 한다.
		
		System.out.println(count);
		System.out.println(count2);
		System.out.println(totalScore);
		System.out.println(totalScore2);
		System.out.println(maxScore);
		System.out.println(maxScore2);
		System.out.println(reduceScore);
		System.out.println(reduceScore2);
		System.out.println(nameJoin);
		
		// PartitioningBy를 이용한 성별별 2분할 출력
		Map<Boolean, List<Student2>> stuStream10 = Arrays.stream(stuArr)
												   .collect(Collectors.partitioningBy(Student2::isMale));
		Object[] obj1 = stuStream10.values().toArray();
		for(Object o : obj1) {
			System.out.println(o);
		}
		
		List<Student2> maleStudent = stuStream10.get(true); //Map에서 남학생 목록을 얻는다.
		List<Student2> femaleStudent = stuStream10.get(false); //Map에서 여학생 목록을 얻는다
		for(Student2 s : maleStudent) {
			System.out.println(s);
		}
		System.out.println();
		for(Student2 m : femaleStudent) {
			System.out.println(m);
		}
		
		// 성별별 학생 수 (Partitioning 매개변수 2개짜리 이용)
		Map<Boolean, Long> stuStream11 = Arrays.stream(stuArr)
										 .collect(Collectors.partitioningBy(Student2::isMale, Collectors.counting()));
		System.out.println("남학생 수 : "+stuStream11.get(true));
		System.out.println("여학생 수 : "+stuStream11.get(false));
		
		// 성별별 score의 최댓값
		Map<Boolean, Optional<Student2>> stuStream12 = Arrays.stream(stuArr)
													  .collect(Collectors.partitioningBy(Student2::isMale,
													  Collectors.maxBy(Comparator.comparing(Student2::getScore))));
		System.out.println("남학생 score 최댓값 : "+stuStream12.get(true));
		System.out.println("여학생 score 최댓값 : "+stuStream12.get(false));
		
		// 성별별 100점 이하의 score 출력
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
		
		
		// groupingBy로 반별 출력
		Map<Integer, List<Student2>> stuStream14 = Arrays.stream(stuArr)
				.collect(Collectors.groupingBy(Student2::getBan));
		Object[] obj3 = stuStream14.values().toArray();
		for(Object o : obj3) {
			System.out.println(o);
		}
		
		// groupingBy로 학년별, 반별 출력
		
	}
	
}
