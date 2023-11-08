package streamEx;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest02 {

	public static void main(String[] args) {
		// iterator�� generator�� �̿��Ͽ� stream �ۼ�
		// �ݵ�� �߰� ������ limit�� �̿��ؾ� �Ѵ�. (iterator�� generator�� ��� ���ѿ������̱� ����
		Stream<Integer> evenStream = Stream.iterate(0, n -> n+2);
		evenStream.limit(5).forEach(i -> System.out.print(i+" "));
		System.out.println();
		
		Stream<Double> randomStream = Stream.generate( () -> Math.random()*5 );
		randomStream.limit(5).forEach(i -> System.out.println(i+" "));
		System.out.println();
		
		Stream<Integer> oneStream = Stream.generate(()->1);
		oneStream.limit(5).forEach(i->System.out.println(i));
		
		System.out.println("--  �߰� ������ -----");		
		int[] arr = {7,7,6,5,5,4,3,3,2,1};
		String[] strArr = {"java","spring","database"};
		
		// �߰� ������ : filter, distinct, map, flatMap, limit, skip, peek, sorted, sorted(Comparator)
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
		intStream.peek(i -> System.out.println(i+" ")) // ������
				 .anyMatch(s -> s % 2 == 0); // ���ǿ� �����ϴ� ���� ���� ������ ���
		System.out.println();
		
		// ���� ������ : findFirst, findAny (Optional ��ü�� �Ǿ��� �ִ� / �ݵ�� filter �߰� �����ڿ� �Բ� ����)
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
		// ���ڸ� ���ڷ� �ٲٴ� map�� �̿��ؼ� ��ȯ�Ѵ�.
		// ���� ���� reduce�� �������� �ʴ� ������ �����Ͽ� ����� ���� ���̴�. 
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
