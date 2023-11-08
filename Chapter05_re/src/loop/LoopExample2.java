package loop;
public class LoopExample2 {
	public static void main(String[] args) {
		//巩力1
		int sum = 0;
		for(int i=1;i<=5;i++) {
			sum += i;
		}
		System.out.println(sum);
		//巩力2,3,4
		int sum2 = 0;
		int cnt2 = 0;
		for(int i=1;i<=10;i++) {
			if(i<3 || i>=7) {
				System.out.print(i+" "); //巩力2
				sum2 += i; //巩力3
				cnt2++; //巩力4
			}
		}
		System.out.println();
		System.out.println(sum2); //巩力3
		System.out.println(cnt2); //巩力4
	}
}
