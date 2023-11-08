package classpart03;

class Ex03 {

	//¸â¹öº¯¼ö
	int[] arr = {87,100,11,72,92};
}

public class ClassEx03 {

	public static void main(String[] args) {
		Ex03 ex = new Ex03();
		int total = 0;
		for(int i=0;i<ex.arr.length;i++) {
			total += ex.arr[i];
		}
		System.out.println(total);
		
		int multi4_total = 0;
		for(int i=0;i<ex.arr.length;i++) {
			if(ex.arr[i] % 4 == 0) {
				multi4_total += ex.arr[i];
			}	
		}
		System.out.println(multi4_total);
		
		int multi4_num = 0;
		for(int i=0;i<ex.arr.length;i++) {
			if(ex.arr[i] % 4 == 0) {
				multi4_num++;
			}
		}
		System.out.println(multi4_num);
		
		int even_num = 0;
		for(int i=0;i<ex.arr.length;i++) {
			if(ex.arr[i] % 2 == 0) {
				even_num++;
			}
		}
		System.out.println(even_num);
	}

}
