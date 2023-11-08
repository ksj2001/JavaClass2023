package multi_array;

import java.util.Arrays;

public class String_Example01 {
	public static void main(String[] args) {
		String[] names = {"홍길동","김유신","마동석","자바킹","서동요"};
		String temp = new String("");
		for(int i=0;i<=4;i++) {
			for(int j=i;j<=4;j++) {
				int seq = names[i].compareTo(names[j]);
				if(seq>0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(names));
	}
}
