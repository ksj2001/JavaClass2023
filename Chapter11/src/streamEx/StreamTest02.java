package streamEx;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest02 {

	public static void main(String[] args) {
		// iterator와 generator를 이용하여 stream 작성
		// 반드시 중간 연산자 limit를 이용해야 한다. (iterator와 generator는 모두 무한연산자이기 때문
		Stream<Integer> evenStream = Stream.iterate(0, n -> n+2);
		evenStream.limit(5).forEach(i -> System.out.print(i+" "));
		System.out.println();
		
		Stream<Double> randomStream = Stream.generate( () -> Math.random()*5 );
		randomStream.limit(5).forEach(i -> System.out.println(i+" "));
		System.out.println();
		
		Stream<Integer> oneStream = Stream.generate(()->1);
		oneStream.limit(5).forEach(i->System.out.println(i));
		
		System.out.println("--  중간 연산자 -----");		
		int[] arr = {7,7,6,5,5,4,3,3,2,1};
		String[] strArr = {"java","spring","database"};
		
		// 중간 연산자 : filter, distinct, map, flatMap, limit, skip, peek, sorted, sorted(Comparator)
		IntStream intStream = Arrays.stream(arr);
		intStream.filter(i -> i > 4)
				 .forEach(i -> System.out.print(i+" "));
		System.out.println();
		
		intStream = Arrays.stream(arr);
		intStream.distinct().forEach(i -> System.out.print(i+" "));
		System.out.println();
		
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.map(s -> s.length())
				 .forEach(i -> System.out.print(i+" "));
		System.out.println();
		
		Stream<String> stream4 = Arrays.stream(strArr);
		//stream4.flatMap(s->s.lines()).forEach(e -> System.out.print(e+" "));
		
		strStream = Arrays.stream(strArr);
		strStream.skip(1)
				 .forEach(i -> System.out.print(i+" "));
		System.out.println();
		
		intStream = Arrays.stream(arr);
		intStream.peek(i -> System.out.println(i+" ")) // 디버깅용
				 .anyMatch(s -> s % 2 == 0); // 조건에 만족하는 값이 나올 때까지 출력
		System.out.println();
		
		// 최종 연산자 : findFirst, findAny (Optional 객체로 되어져 있다 / 반드시 filter 중간 연산자와 함께 쓴다)
		intStream = Arrays.stream(arr);
		//intStream.filter(i -> i <= 5).peek(i -> System.out.print(i+" ")).findFirst();
		OptionalInt result = intStream.filter(i -> i == 7).findFirst();
		System.out.println(result);
		
		intStream = Arrays.stream(arr);
		OptionalInt result2 = intStream.filter(i -> i % 4 == 0).findAny();
		System.out.println(result2);
		
		Stream<String> strStream1 = Arrays.stream(strArr);
		Stream<String> strStream2 = Arrays.stream(strArr);
		Stream<String> strStream3 = Arrays.stream(strArr);
		Stream<String> strStream4 = Arrays.stream(strArr);
		// 문자를 숫자로 바꾸는 map을 이용해서 변환한다.
		// 최종 연산 reduce는 존재하지 않는 연산을 누적하여 만들어 쓰는 것이다. 
		int sum = strStream1.map(s -> s.length()).reduce(0, (a,b) -> a + b);
		int count = strStream2.map(s -> s.length()).reduce(0, (a,b) -> a+1);
		int max = strStream3.map(s -> s.length()).reduce(0, (a,b) -> a > b ? a : b);
		int min = strStream4.map(s -> s.length()).reduce(max, (a,b) -> a < b ? a : b);
		System.out.println(sum);
		System.out.println(count);
		System.out.println(max);
		System.out.println(min);
	}

}
