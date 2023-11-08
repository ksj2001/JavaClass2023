package subInputOutputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		// main�� throws Exception ó���ϸ� JVM(Java Virtual Machine, �ڹ� ���� �ӽ�)���� ó�����ش�.

		// BufferedReader�� ���� ��Ʈ�� �̹Ƿ�, �Ű������� ��� ��Ʈ���̳� �� �ٸ� ���� ��Ʈ������ �޴´�.
		// Scanner�� System.in�� ���� ������ ������, �ӵ��� BufferedReader�� �� ������.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� �Է� : ");
		//String str1 = br.readLine(); // readLine�� ���� �� ���� �о���δ�. (=nextLine();)
		// int num = br.read(); // read�� ������ �о���δ�. (=nextInt();)
		//System.out.println(str1);

		// StringTokenizer�� �̿��Ͽ� ���ڸ� ����ϴ� ���
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str2 = st.nextToken();
		String str3 = st.nextToken();
		int num2 = Integer.parseInt(st.nextToken());
		System.out.println(str2+"\n"+str3+"\n"+num2);

	}

}
