package returnPackage;

public class Test2 {
	public int multiple(int[] arr) {
		int cnt = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 4 == 0) {
				cnt++;
			}
		}
		return cnt;
	}
}
