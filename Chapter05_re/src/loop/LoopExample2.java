package loop;
public class LoopExample2 {
	public static void main(String[] args) {
		//����1
		int sum = 0;
		for(int i=1;i<=5;i++) {
			sum += i;
		}
		System.out.println(sum);
		//����2,3,4
		int sum2 = 0;
		int cnt2 = 0;
		for(int i=1;i<=10;i++) {
			if(i<3 || i>=7) {
				System.out.print(i+" "); //����2
				sum2 += i; //����3
				cnt2++; //����4
			}
		}
		System.out.println();
		System.out.println(sum2); //����3
		System.out.println(cnt2); //����4
	}
}
