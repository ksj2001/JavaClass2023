package streamEx;

import java.util.stream.Stream;

public class StreamTest03 {

	public static void main(String[] args) {
		
		String[] arr = {"Java","JavaScript","Coding"};
		
        Stream<String> s = Stream.of(arr);
       // s.flatMap(f -> f.lines()).forEach(i -> System.out.println(i));
        
	}

}
