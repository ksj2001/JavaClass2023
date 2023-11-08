package streamEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream(); // List 콜렉션을 stream으로 생성
		intStream.sorted(Comparator.reverseOrder()) // 중간 연산으로 최종 연산을 만나기 전까지는 연산되지 않는 지연된 연산이다.
		         .forEach(i -> System.out.print(i+" ")); // 최종 연산으로 stream의 요소를 소모한다. 고로 stream이 닫힌다.
		
		intStream = list.stream(); // 위에서 사용한 stream 변수명을 다시 사용하려면 stream을 재생성해줘야 한다.
		intStream.collect(Collectors.toList()); // toString이 오버라이드되지 않은 상태이므로 collect는 의미가 없다.
		System.out.println(intStream);
		
		String[] strArr = {"a","bbb","c","dd"};
		Stream<String> strStream = Arrays.stream(strArr); // String을 stream으로 생성
		//System.out.println(strStream.count());
		int cnt = (int)strStream.count();
		System.out.println(cnt);
		
		Stream<String> strStream2 = Arrays.stream(strArr);
		System.out.println(strStream2.mapToInt(s -> s.length()).sum()); // strArr 배열의 문자의 길이를 int(숫자)로 반환
		
		
		int[] intArr = {5,6,7,8,9};
		IntStream intStream2 = Arrays.stream(intArr); // 오토박싱과 언박싱의 비효율적인 작업을 제거하기 위해 기본형 intStream을 사용함.
		IntStream intStream3 = Arrays.stream(intArr);
		IntStream intStream4 = Arrays.stream(intArr);
		IntStream intStream5 = Arrays.stream(intArr);
		IntStream intStream6 = Arrays.stream(intArr);
		
		// Optional은 래퍼클래스 객체이다.
		// max, min은 OptionalInt 데이터타입이고, average는 OptionalDouble 데이터타입이다.
		int sum = intStream2.sum();
		int count = (int)intStream3.count();
		OptionalInt max = intStream4.max();
		OptionalInt min = intStream5.min();
		OptionalDouble avg = intStream6.average();
		System.out.println(sum);
		System.out.println(count);
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);
		
		IntStream limit = new Random().ints(5);
		limit.forEach(i -> System.out.println(i));
	}

}
