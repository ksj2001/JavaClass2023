package loop;
public class Loop_Example01 {
	public static void main(String[] args) {
		int num = 1;
		int total = 0;
		while(num<=10) {
			System.out.println(num);
			total += num;
			num++; //1�� ������Ű�� ����
		}
		System.out.println(total);
	}
}
