package subInputOutputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		// main에 throws Exception 처리하면 JVM(Java Virtual Machine, 자바 가상 머신)에서 처리해준다.

		// BufferedReader은 보조 스트림 이므로, 매개변수를 기반 스트림이나 또 다른 보조 스트림으로 받는다.
		// Scanner의 System.in과 같은 역할을 하지만, 속도는 BufferedReader가 더 빠르다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 입력 : ");
		//String str1 = br.readLine(); // readLine은 문자 한 줄을 읽어들인다. (=nextLine();)
		// int num = br.read(); // read는 정수를 읽어들인다. (=nextInt();)
		//System.out.println(str1);

		// StringTokenizer를 이용하여 문자를 출력하는 방식
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str2 = st.nextToken();
		String str3 = st.nextToken();
		int num2 = Integer.parseInt(st.nextToken());
		System.out.println(str2+"\n"+str3+"\n"+num2);

	}

}
