package loop;
public class LoopExample1 {
	public static void main(String[] args) {
		//����1
		for(int i=1;i<=10;i++) {
			if(i>=5 && i<=9) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//����2
		for(int i=10;i>0;i--) {
			if(i>=3 && i<=6) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//����3
		for(int i=1;i<=10;i++) {
			if(i % 2 == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
