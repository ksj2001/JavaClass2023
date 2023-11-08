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
		Stream<Integer> intStream = list.stream(); // List �ݷ����� stream���� ����
		intStream.sorted(Comparator.reverseOrder()) // �߰� �������� ���� ������ ������ �������� ������� �ʴ� ������ �����̴�.
		         .forEach(i -> System.out.print(i+" ")); // ���� �������� stream�� ��Ҹ� �Ҹ��Ѵ�. ��� stream�� ������.
		
		intStream = list.stream(); // ������ ����� stream �������� �ٽ� ����Ϸ��� stream�� ���������� �Ѵ�.
		intStream.collect(Collectors.toList()); // toString�� �������̵���� ���� �����̹Ƿ� collect�� �ǹ̰� ����.
		System.out.println(intStream);
		
		String[] strArr = {"a","bbb","c","dd"};
		Stream<String> strStream = Arrays.stream(strArr); // String�� stream���� ����
		//System.out.println(strStream.count());
		int cnt = (int)strStream.count();
		System.out.println(cnt);
		
		Stream<String> strStream2 = Arrays.stream(strArr);
		System.out.println(strStream2.mapToInt(s -> s.length()).sum()); // strArr �迭�� ������ ���̸� int(����)�� ��ȯ
		
		
		int[] intArr = {5,6,7,8,9};
		IntStream intStream2 = Arrays.stream(intArr); // ����ڽ̰� ��ڽ��� ��ȿ������ �۾��� �����ϱ� ���� �⺻�� intStream�� �����.
		IntStream intStream3 = Arrays.stream(intArr);
		IntStream intStream4 = Arrays.stream(intArr);
		IntStream intStream5 = Arrays.stream(intArr);
		IntStream intStream6 = Arrays.stream(intArr);
		
		// Optional�� ����Ŭ���� ��ü�̴�.
		// max, min�� OptionalInt ������Ÿ���̰�, average�� OptionalDouble ������Ÿ���̴�.
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
